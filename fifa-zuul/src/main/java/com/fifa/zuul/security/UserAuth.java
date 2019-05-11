package com.fifa.zuul.security;

import com.fifa.zuul.proxies.AuthProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserAuth {
  @Autowired
  private AuthProxy authProxy;

  public boolean checkUserAuth(String token) {
    Map<String, Object> requestAuth = new HashMap<>();
    requestAuth.put("token", token);
    System.out.println(requestAuth.toString());
    Map<String, Object> responseAuth = authProxy.userAuth(requestAuth);
    System.out.println(responseAuth.toString());
    boolean authOk = (Boolean) responseAuth.get("authOk");
    return authOk;
  }
}