package com.fifa.zuul.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "fifa-auth")
public interface AuthProxy {
  @RequestMapping(value = "/user/verify", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
  Map<String, Object> userAuth(@RequestBody Map<String, Object> request);
}
