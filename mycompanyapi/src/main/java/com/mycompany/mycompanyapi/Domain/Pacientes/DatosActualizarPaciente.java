package com.mycompany.mycompanyapi.Domain.Pacientes;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarPaciente(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
