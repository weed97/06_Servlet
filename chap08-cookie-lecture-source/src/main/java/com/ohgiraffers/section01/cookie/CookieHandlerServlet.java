package com.ohgiraffers.section01.cookie;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(cookie) firstname : " + firstName);
        System.out.println("(cookie) lastname : " + lastName);

//        response.sendRedirect("redirect");


        /*
        * 쿠키를 사용하는 절차
        * 1. 쿠키를 생성한다.
        * 2. 생성한 쿠키의 만료 시간을 설정한다.
        * 3. 응답 헤더에 쿠키를 담는다.
        * 4. 응답을 보낸다.
        *
        * 쿠기의 제약사항
        * 쿠키의 이름은 ascii 문자만을 사용해야하며 한번 설정한 이름은 변경불가
        * 쿠키의 이름에는 공백문자와 일부 특수문자( [ ] ( ) =, " \ ? @ : ; )을 사용할 수 없다.
        * */

        // Cookie는 기본생성자를 제공해주지않는다
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        //초단위 설정 (만료시간을 하루로 둠)
        firstNameCookie.setMaxAge(60 * 60 * 24);
        lastNameCookie.setMaxAge(60 * 20 * 24);

        // response에 쿠키 담기
        response.addCookie(firstNameCookie);
        response.addCookie(lastNameCookie);

        response.sendRedirect("redirect");

    }
}
