package com.fifa.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

  @Override
  public boolean shouldFilter() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public String filterType() {
    // TODO Auto-generated method stub
    return "pre";
  }

  @Override
  public int filterOrder() {
    // TODO Auto-generated method stub
    return 1;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
//    System.out.println(request.getHeader("Authorization"));
    ctx.addZuulRequestHeader("Authorization", request.getHeader("Authorization").toString());

    request.setAttribute("Authorization", request.getHeader("Authorization"));
    ctx.setRequest(request);

    System.out.println(
            "Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
    return null;
  }

}
