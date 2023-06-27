package com.game.energ.controller;
import com.game.energ.models.Games;

import javax.servlet.ServletException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "updateGame", value = "/update-game")
public class updateGame extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List <Games> games = (ArrayList)
                req.getSession().getAttribute("games");

        int id = Integer.parseInt(req.getParameter("id"));
        for (Games g: games) {
            if (g.getId() == id) {
               g.setId(Integer.parseInt(req.getParameter("id")));
               g.setNombre(req.getParameter("nombre"));
               g.setDescripcion(req.getParameter("descripcion"));
               g.setCreador(req.getParameter("creador"));
               g.setGenero(req.getParameter("genero"));
               g.setAniolanzamiento(Integer.parseInt(req.getParameter("anio")));
            }
        }
        resp.sendRedirect("index.jsp");
    }

}

