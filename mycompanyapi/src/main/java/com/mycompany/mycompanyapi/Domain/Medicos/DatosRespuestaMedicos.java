package com.mycompany.mycompanyapi.Domain.Medicos;

import com.mycompany.mycompanyapi.Domain.Direccion.DatosDireccion;

public record DatosRespuestaMedicos(Long id, String nombre, String email, String telefono, String documento,
                                    DatosDireccion direccion) {
}
