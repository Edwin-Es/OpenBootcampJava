package com.mycompany.mycompanyapi.Controllers;

import com.mycompany.mycompanyapi.Domain.Usuarios.DatosAutenticacionUsuario;
import com.mycompany.mycompanyapi.Domain.Usuarios.Usuarios;
import com.mycompany.mycompanyapi.Infra.Security.DatosJWTToken;
import com.mycompany.mycompanyapi.Infra.Security.TokenService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
     @Autowired
     private AuthenticationManager authenticationManager;
     @Autowired
     private TokenService tokenService;
     @PostMapping
     public ResponseEntity autenticarUsuario(@RequestBody DatosAutenticacionUsuario datosAutenticacionUsuario){
          Authentication authtoken=new UsernamePasswordAuthenticationToken(
                    datosAutenticacionUsuario.login(),datosAutenticacionUsuario.clave());
          var usuarioAutenticado=authenticationManager.authenticate(authtoken);
          var JWTtoken=tokenService.generateToken((Usuarios) usuarioAutenticado.getPrincipal());
          return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
     }
}
