package com.fifa.auth.controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.fifa.auth.utils.Constants.JWT_SECRET;

@RestController
@RequestMapping("/user")
public class AuthController {
  @PostMapping(value = "/token")
  public Map<String, Object> getToken(@RequestBody Map<String, Object> request) {
    Map<String, Object> response = new HashMap<>();
    String jwtToken = JWT.create().withSubject(request.get("user").toString()).sign(Algorithm.HMAC512(JWT_SECRET.getBytes()));
    response.put("token", jwtToken);
    return response;
  }

  @PostMapping(value = "/verify")
  public Map<String, Object> verifyToken(@RequestBody Map<String, Object> request) {
    System.out.println(request.get("token").toString());
    Map<String, Object> response = new HashMap<>();
    boolean authOK = false;
    response.put("authOk", authOK);
    try {
      String authValues = JWT.require(Algorithm.HMAC512(JWT_SECRET.getBytes())).build().verify(request.get("token").toString()).getSubject();
      if(authValues != null && !authValues.isEmpty()) {
        authOK = true;
        response.put("authOk", authOK);
      }
    } catch (SignatureVerificationException sve) {
      System.out.println("Signature exception");
      return response;
    } catch (JWTDecodeException jde) {
      System.out.println("JWT Token not valid");
      return response;
    }
    return response;
  }
}
