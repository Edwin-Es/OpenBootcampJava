package com.mycompany.mycompanyapi.Infra.Security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.mycompany.mycompanyapi.Domain.Usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
     @Value("${api.security.secret}")
     private String apiSecret;
     public String generateToken(Usuarios usuarios){
          try {
               Algorithm algorithm = Algorithm.HMAC256(apiSecret);
               return JWT.create()
                         .withIssuer("Company.com")
                         .withSubject(usuarios.getLogin())
                         .withClaim("id",usuarios.getId())
                         .withExpiresAt(generarFechaExp())
                         .sign(algorithm);
          } catch (JWTCreationException exception){
               throw new RuntimeException();
          }
     }
     private Instant generarFechaExp(){
          return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-05:00"));
     }
}
