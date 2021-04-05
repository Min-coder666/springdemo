package com.min.filter;


import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("####### TestFilter init ########");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("####### TestFilter doFilter ########");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("####### TestFilter destroy ########");
    }
}
