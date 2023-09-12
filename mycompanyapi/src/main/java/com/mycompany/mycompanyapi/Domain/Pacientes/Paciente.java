package com.mycompany.mycompanyapi.Domain.Pacientes;

import com.mycompany.mycompanyapi.Domain.Direccion.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="pacientes")
@Entity(name="Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String nombre;
     private String email;
     private String telefono;
     private String documento;
     private Boolean activo;
     @Embedded
     private Direccion direccion;

     public Paciente(DatosRegistroPacientes datosRegistroPacientes) {
          this.activo=true;
          this.nombre = datosRegistroPacientes.nombre();
          this.email = datosRegistroPacientes.email();
          this.documento = datosRegistroPacientes.documento();
          this.direccion = new Direccion(datosRegistroPacientes.direccion());
          this.telefono=datosRegistroPacientes.telefono();
     }

     public void actualizarDatos(DatosActualizarPaciente datosActualizarPaciente) {
          if(datosActualizarPaciente.nombre()!=null)this.nombre = datosActualizarPaciente.nombre();
          if(datosActualizarPaciente.documento()!=null)this.documento = datosActualizarPaciente.documento();
          if(datosActualizarPaciente.direccion()!=null)this.direccion = direccion.actualizardatos(datosActualizarPaciente.direccion());


     }

     public void desactivarPaciente() {
          this.activo=false;
     }
}
