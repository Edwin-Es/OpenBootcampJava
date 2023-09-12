package com.mycompany.mycompanyapi.Controllers;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import com.mycompany.mycompanyapi.Domain.Medicos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
     @Autowired
     private MedicoRepository medicoRepository;

     @PostMapping
     public ResponseEntity<DatosRespuestaMedicos> guardar(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico,
                                                          UriComponentsBuilder uriComponentsBuilder){
          Medico medico=medicoRepository.save(new Medico( datosRegistroMedico));
          DatosRespuestaMedicos datosRespuestaMedicos=new DatosRespuestaMedicos(
                  medico.getId(),medico.getNombre(),medico.getEmail(),medico.getTelefono(),medico.getEspecialidad().toString(),
                  new DatosDireccion(medico.getDireccion().getCalle(),medico.getDireccion().getCiudad(),medico.getDireccion().getDistrito(),
                          medico.getDireccion().getNumero(),medico.getDireccion().getComplemento())
          );
          URI url=uriComponentsBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
          return ResponseEntity.created(url).body(datosRespuestaMedicos);
     }
     @GetMapping
     public ResponseEntity<Page<DatosListadoMedico>> listadoMedicos(@PageableDefault(size=5,sort="nombre") Pageable paginacion){
          //return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
          return ResponseEntity.ok(medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new));
     }
     @PutMapping
     @Transactional
     public ResponseEntity<DatosRespuestaMedicos> actualizarMedico(@RequestBody DatosActualizarMedico datosActualizarMedico){
          Medico medico=medicoRepository.getReferenceById(datosActualizarMedico.id());
          medico.actualizarDatos(datosActualizarMedico);
          return ResponseEntity.ok(new DatosRespuestaMedicos(
                  medico.getId(),medico.getNombre(),medico.getEmail(),medico.getTelefono(),medico.getEspecialidad().toString(),
                  new DatosDireccion(medico.getDireccion().getCalle(),medico.getDireccion().getCiudad(),medico.getDireccion().getDistrito(),
                          medico.getDireccion().getNumero(),medico.getDireccion().getComplemento())
          ));
     }

     /* Base de datos:
     @DeleteMapping("/{id}")
     @Transactional
     public void eliminarMedico(@PathVariable Long id){
          Medico medico=medicoRepository.getReferenceById(id);
          medicoRepository.delete(medico);
     }*/
     //delete logico:
     @DeleteMapping("/{id}")
     @Transactional
     public ResponseEntity eliminarMedico(@PathVariable Long id){
          Medico medico=medicoRepository.getReferenceById(id);
          medico.desactivarMedico();
          return  ResponseEntity.noContent().build();
     }

     @GetMapping("/{id}")
     @Transactional
     public ResponseEntity<DatosRespuestaMedicos> retornarMedico(@PathVariable Long id){
          Medico medico=medicoRepository.getReferenceById(id);
          var datosMedicos=new DatosRespuestaMedicos(
                  medico.getId(),medico.getNombre(),medico.getEmail(),medico.getTelefono(),medico.getEspecialidad().toString(),
                  new DatosDireccion(medico.getDireccion().getCalle(),medico.getDireccion().getCiudad(),medico.getDireccion().getDistrito(),
                          medico.getDireccion().getNumero(),medico.getDireccion().getComplemento())
          );

          return  ResponseEntity.ok(datosMedicos);
     }

}
