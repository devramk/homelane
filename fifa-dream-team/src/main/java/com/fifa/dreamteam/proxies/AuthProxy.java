package com.fifa.dreamteam.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient("fifa-auth")
public interface AuthProxy {
  @RequestMapping(value = "/user/verify", method = RequestMethod.POST)
  public Map<String, Object> userAuth(@RequestBody Map<String, Object> request);
}
