package com.ohgiraffers.section03.Status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 200, 400, 401, 404,  500

        response.sendError(404, "없는 페이지입니다. 경로를 확인해주세요.");
//        response.sendError(200, "GET : 리소스를 불러와서 메세지를 바디에 전송 되었습니다.");
        response.sendError(400, "잘못된 문법으로 인하여 서버가 요청을 이해 할 수 었습니다.");
        response.sendError(401, "비인증 되었습니다 요청 받기 위해서 스스로 인증 해야 합니다.");
        response.sendError(404, "서버는 요청 받은 리소스를 찾을 수 없습니다. ");
        response.sendError(500, "서버는 처리방법을 알 수 없습니다.");


    }


}
