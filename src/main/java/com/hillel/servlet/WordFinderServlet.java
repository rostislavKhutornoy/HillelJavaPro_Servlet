package com.hillel.servlet;

import com.hillel.util.WordFinder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/find")
public class WordFinderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("The file contains this word in quantity: " +
                WordFinder.findWord("D:\\JavaProjects\\WebAppTest\\src\\main\\resources\\text.txt", req.getParameter("string")));
    }
}