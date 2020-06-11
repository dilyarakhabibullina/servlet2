package ru.itpark;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DataServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Robot bot = new Robot ("Dima", 4577);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Robot bot = new Robot ("Dima", 4577);
        req.setAttribute("bot", bot);
        req.getRequestDispatcher("/WEB-INF/botpage.jsp").forward(req, resp);
    }


}
