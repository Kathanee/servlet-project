package com.java.servletpackage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletLifecycleExample extends HttpServlet {
    public void init() throws ServletException {
        // super.init();
        System.out.println("Method Executed : init()");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Method Executed : service()");
        resp.getWriter().write("service method response");
    }

    @Override
    public void destroy() {
       // super.destroy();
        System.out.println("Method Executed : destroy()");
    }

    


}
