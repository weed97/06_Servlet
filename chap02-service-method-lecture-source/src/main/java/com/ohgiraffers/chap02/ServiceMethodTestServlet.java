package com.ohgiraffers.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/request-servlet")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST 요철을 처리할 메소드 호출");
    }

//    @Override
//    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//        // httpRequest의 getMethod() : 어떠한 http method 요청이지 문자열로 반환해준다.
//        String httpMethod = httpRequest.getMethod();
//
//        System.out.println("http method : " + httpMethod);
//
//        if ("GET".equals(httpMethod)) {
//
//            // get 요청을  처리할 메소드로 요청과 응답 정보를 전달한다.
//            doGet(httpRequest, httpResponse);
//        } else if (("Post").equals(httpMethod)) {
//            // post 요청을 처리할 메소드로 요청을 응답 정보를 전달한다.
//            doPost(httpRequest, httpResponse);
//        }
//
//    }


}
