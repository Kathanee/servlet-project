package com.java.servletpackage.servletfilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import  java.io.IOException;

public class HomeFilter implements Filter {
    private  static final org.slf4j.Logger LOGGER= LoggerFactory.getLogger(HomeFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("filter() executed {}","init()");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       LOGGER.info("filter() executed {}","doFilter()");
       System.out.println("Before"+ this.getClass());
       filterChain.doFilter(servletRequest,servletResponse);
       System.out.println("After"+this.getClass());
    }

    @Override
    public void destroy() {
        LOGGER.info("filter() executed {}","destroy()");

    }
}
