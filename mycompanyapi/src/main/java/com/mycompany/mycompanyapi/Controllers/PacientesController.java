package com.mycompany.mycompanyapi.Controllers;
import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import com.mycompany.mycompanyapi.Domain.Medicos.DatosRespuestaMedicos;
import com.mycompany.mycompanyapi.Domain.Medicos.Medico;
import com.mycompany.mycompanyapi.Domain.Pacientes.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {
     @Autowired
     private PacienteRepository pacienteRepository;

     @PostMapping
     public ResponseEntity<DatosRespuestaPacientes> guardar(@RequestBody @Valid DatosRegistroPacientes datosRegistroPacientes,
                                                          UriComponentsBuilder uriComponentsBuilder){
          Paciente paciente =pacienteRepository.save(new Paciente(datosRegistroPacientes));
          DatosRespuestaPacientes datosRespuestaPacientes=new DatosRespuestaPacientes(
                  paciente.getId(),paciente.getNombre(),paciente.getEmail(),paciente.getTelefono(), paciente.getDocumento()
                  ,new DatosDireccion(paciente.getDireccion().getCalle(),paciente.getDireccion().getCiudad(),paciente.getDireccion().getDistrito(),
                          paciente.getDireccion().getNumero(),paciente.getDireccion().getComplemento())
          );
          URI url=uriComponentsBuilder.path("/medicos/{id}").buildAndExpand(paciente.getId()).toUri();
          return ResponseEntity.created(url).body(datosRespuestaPacientes);
     }

     @GetMapping
     public ResponseEntity<Page<DatosListadoPaciente>> listadoPacientes(@PageableDefault(size=5,sort="nombre") Pageable paginacion){
          return ResponseEntity.ok(pacienteRepository.findByActivoTrue(paginacion).map(DatosListadoPaciente::new));
     }

     @PutMapping
     @Transactional
     public ResponseEntity<DatosRespuestaPacientes> actualizarDatos(@RequestBody DatosActualizarPaciente datosActualizarPaciente){
          Paciente paciente=pacienteRepository.getReferenceById(datosActualizarPaciente.id());
          paciente.actualizarDatos(datosActualizarPaciente);
          return ResponseEntity.ok(new DatosRespuestaPacientes(paciente.getId(),paciente.getNombre(),paciente.getEmail(),paciente.getTelefono(), paciente.getDocumento()
                  ,new DatosDireccion(paciente.getDireccion().getCalle(),paciente.getDireccion().getCiudad(),paciente.getDireccion().getDistrito(),
                  paciente.getDireccion().getNumero(),paciente.getDireccion().getComplemento())));
     }

     @DeleteMapping("/{id}")
     @Transactional
     public ResponseEntity eliminarPaciente(@PathVariable Long id){
          Paciente paciente=pacienteRepository.getReferenceById(id);
          paciente.desactivarPaciente();
          return ResponseEntity.noContent().build();
     }

     @GetMapping("/{id}")
     @Transactional
     public ResponseEntity<DatosRespuestaPacientes> retornarMedico(@PathVariable Long id){
          Paciente paciente=pacienteRepository.getReferenceById(id);
          var datosPaciente=new DatosRespuestaPacientes(
                  paciente.getId(),paciente.getNombre(),paciente.getEmail(),paciente.getTelefono(),paciente.getDocumento(),
                  new DatosDireccion(paciente.getDireccion().getCalle(),paciente.getDireccion().getCiudad(),paciente.getDireccion().getDistrito(),
                          paciente.getDireccion().getNumero(),paciente.getDireccion().getComplemento())
          );

          return  ResponseEntity.ok(datosPaciente);
     }

}
