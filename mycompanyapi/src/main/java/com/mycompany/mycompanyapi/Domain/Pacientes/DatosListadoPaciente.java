package com.mycompany.mycompanyapi.Domain.Pacientes;

public record DatosListadoPaciente(Long id, String nombre, String telefono, String documento, String email) {

     public DatosListadoPaciente(Paciente paciente){
          this(paciente.getId(), paciente.getNombre(), paciente.getTelefono(), paciente.getDocumento(),
                    paciente.getEmail());
     }
}
