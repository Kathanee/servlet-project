package com.java.servletpackage.servletlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HomeContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("context initialized "+this.getClass());

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("context destroyed "+this.getClass());

    }
}
