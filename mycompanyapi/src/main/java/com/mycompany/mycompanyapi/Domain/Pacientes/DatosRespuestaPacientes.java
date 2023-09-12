package com.mycompany.mycompanyapi.Domain.Pacientes;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;

public record DatosRespuestaPacientes(Long id, String nombre, String email, String telefono, String documento,
                                      DatosDireccion direccion) {
}
