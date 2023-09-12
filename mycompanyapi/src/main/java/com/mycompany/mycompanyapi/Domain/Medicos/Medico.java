package com.mycompany.mycompanyapi.Domain.Medicos;

import com.mycompany.mycompanyapi.Domain.Direccion.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="medicos")
@Entity(name="Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String nombre;
     private String email;
     private String telefono;
     private String documento;
     private Boolean activo;
     @Enumerated(EnumType.STRING)
     private Especialidad especialidad;
     @Embedded
     private Direccion direccion;


     public Medico(DatosRegistroMedico datosRegistroMedico) {
          this.activo=true;
          this.nombre = datosRegistroMedico.nombre();
          this.email = datosRegistroMedico.email();
          this.documento = datosRegistroMedico.documento();
          this.especialidad = datosRegistroMedico.especialidad();
          this.direccion = new Direccion(datosRegistroMedico.direccion());
          this.telefono=datosRegistroMedico.telefono();
     }

     public void actualizarDatos(DatosActualizarMedico datosActualizarMedico) {
          if(datosActualizarMedico.nombre()!=null)this.nombre = datosActualizarMedico.nombre();
          if(datosActualizarMedico.documento()!=null)this.documento = datosActualizarMedico.documento();
          if(datosActualizarMedico.direccion()!=null)this.direccion = direccion.actualizardatos(datosActualizarMedico.direccion());


     }

     public void desactivarMedico() {
          this.activo=false;
     }
}
