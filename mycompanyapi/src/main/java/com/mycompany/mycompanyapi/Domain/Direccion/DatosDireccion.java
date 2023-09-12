package com.mycompany.mycompanyapi.Domain.Direccion;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosDireccion(
          @NotBlank String calle,
          @NotBlank
          String distrito,
          @NotBlank
          String ciudad,
          @NotBlank String numero,
          @NotBlank String complemento) {
}
