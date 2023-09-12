package com.mycompany.mycompanyapi.Domain.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {

     UserDetails findByLogin(String username);
}
