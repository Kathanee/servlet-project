package com.java.servletpackage.servletfilter;

import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class ServicesFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before"+ this.getClass());
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("After"+this.getClass());
    }

    @Override
    public void destroy() {

    }
}
