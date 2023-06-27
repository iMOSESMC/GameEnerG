package com.game.energ.controller;
import com.game.energ.models.Games;

import javax.servlet.ServletException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "deleteGame", value = "/delete-game")
public class deleteGame extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List <Games> games = (ArrayList)
                req.getSession().getAttribute("games");
        int id = Integer.parseInt(req.getParameter("id"));
        Games x = new Games();
        for (Games g: games) {
            if (g.getId() == id) {
                x = g;
            }
        }
        games.remove(x);
        resp.sendRedirect("index.jsp");
    }
}
