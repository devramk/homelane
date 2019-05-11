package com.fifa.dreamteam.utils;

import com.fifa.dreamteam.proxies.AuthProxy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class UserAuth {
  @Autowired
  private AuthProxy authProxy;

  public boolean checkUserAuth(String token) {
    Map<String, Object> requestAuth = new HashMap<>();
    requestAuth.put("token", token);
    Map<String, Object> responseAuth = authProxy.userAuth(requestAuth);
    boolean authOk = (Boolean) responseAuth.get("authOk");
    return authOk;
  }
}
