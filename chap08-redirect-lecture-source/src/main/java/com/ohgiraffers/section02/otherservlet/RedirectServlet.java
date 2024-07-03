package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("이 서블릿으로 redirect 성공!");

        StringBuilder redirectText = new StringBuilder();
        redirectText.append("<!doctype html>")
                .append("<html>")
                .append("<head>")
                .append("<body>")
                .append("<h1>이 서블릿으로 redirect 성공! </h1>")
                .append("</body>")
                .append("</html>");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(redirectText.toString());

        out.flush();
        out.close();

        /*
        * redirect하면 url이 제작성되어 새로고침 할 때 redirect된 페이지에 대한 요청을 반복한다.
        * 즉, 이전 요청에 포함된 정보는 남아있지 않고 url 변경이 변경되는 것이 redirect의 특징
        * 따라서 첫 요청 시의 redirect와 현제 redirect된 페이지의 request는 서로 다른 객체이므로
        * redirect를 쓰면 이전 서블릿의 값을 공유해서 사용 할 수 있다.
        * */


    }

}
