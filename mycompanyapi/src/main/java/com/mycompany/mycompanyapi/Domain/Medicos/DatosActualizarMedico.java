package com.mycompany.mycompanyapi.Domain.Medicos;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
