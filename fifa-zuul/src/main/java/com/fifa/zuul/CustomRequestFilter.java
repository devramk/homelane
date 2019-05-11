package com.fifa.zuul;

import com.fifa.zuul.security.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomRequestFilter implements Filter {
  @Autowired
  private UserAuth userAuth;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    HttpServletRequest request= (HttpServletRequest) servletRequest;

    response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
    response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
    response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Access-Control-Max-Age", "180");

    String authToken = request.getHeader("Authorization");
    System.out.println(authToken);

    String path = request.getRequestURI().substring(request.getContextPath().length());
    boolean allowRequest = false;

    if(path.contains("auth") || request.getMethod().equals("OPTIONS")) {
      allowRequest = true;
    } else {
      allowRequest = userAuth.checkUserAuth(authToken);
    }

    if(allowRequest) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }
  }

  @Override
  public void destroy() {

  }
}
