package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        response.getWriter().write("Hello, World!");
    }

    @Override
    protected void doHead(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doHead(request, response);
    }

    @Override
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doPut(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doPut(request, response);
    }

    @Override
    protected void doDelete(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doDelete(request, response);
    }

    @Override
    protected void doOptions(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doOptions(request, response);
    }

    @Override
    protected void doTrace(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        super.doTrace(request, response);
    }
}
