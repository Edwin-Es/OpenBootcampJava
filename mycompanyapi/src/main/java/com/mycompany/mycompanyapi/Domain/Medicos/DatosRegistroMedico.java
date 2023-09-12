package com.mycompany.mycompanyapi.Domain.Medicos;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroMedico(@NotBlank String nombre,
                                  @NotBlank
                                  @Email
                                  String email,
                                  @NotBlank
                                  String telefono,
                                  @NotBlank
                                  String documento,
                                  @NotNull
                                  Especialidad especialidad,
                                  @NotNull
                                  DatosDireccion direccion
                                  ) {

}
