package com.mycompany.mycompanyapi.Domain.Pacientes;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroPacientes(
          @NotBlank String nombre,
          @NotBlank String email,
          @NotBlank String telefono,
          @NotBlank String documento,
          @NotNull DatosDireccion direccion) {
}
