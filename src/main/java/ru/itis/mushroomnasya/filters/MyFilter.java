package ru.itis.mushroomnasya.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

@Component
public class MyFilter implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

        if (httpRequest.authenticate((HttpServletResponse)servletResponse)){
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            throw new AccessDeniedException("Not user");
        }
    }
}
