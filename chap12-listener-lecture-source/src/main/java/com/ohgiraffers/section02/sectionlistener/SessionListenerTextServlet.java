package com.ohgiraffers.section02.sectionlistener;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionListenerTextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //세션만들기
        HttpSession session = req.getSession();
        System.out.println("발급받은 session id : " + session.getId());

        // session 만료하게 되면 sessionDestroyed()가 동작한다.
        // session.setMaxInactiveInterval(5);
//        session.invalidate();

        // session에 attribute를 추가 할때 attributeAdded() 메소드가 동작한다.
        session.setAttribute("username","honggildong");
        session.setAttribute("age",20);

        // dta의 바인딩 리스너 확인
        session.setAttribute("user",new UserDTO("honnildong",20));

        // session attribute에 동일한 키로 덮어 쓰는 경우 (수정) attributedReplaced 메소드가 동작한다.
        session.setAttribute("username","hong");

        // session attribute를 제거할 때 attributeRemoved() 가 동작한다.
        session.removeAttribute("username");


    }
}
