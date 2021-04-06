package com.min.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "/error";

    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Error error){
        ModelAndView mv = new ModelAndView(DEFAULT_ERROR_VIEW);
        mv.addObject("message",error.getMessage());
        mv.addObject("errorUrl",request.getRequestURL());
        return mv;
    }

}
