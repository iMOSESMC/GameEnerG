package com.game.energ.controller;
import com.game.energ.models.Games;

import javax.servlet.ServletException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "createGame", value = "/create-game")
public class createGame extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Games nuevo = new Games();

        String id = req.getParameter("id");
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        String creador = req.getParameter("creador");
        String genero = req.getParameter("genero");
        String anio = req.getParameter("anio");

        nuevo.setId(Integer.parseInt(id));
        nuevo.setNombre(nombre);
        nuevo.setDescripcion(descripcion);
        nuevo.setCreador(creador);
        nuevo.setGenero(genero);
        nuevo.setAniolanzamiento(Integer.parseInt(anio));

        List<Games> games = (ArrayList)
                req.getSession().getAttribute("games");
        games.add(nuevo);

        req.getSession().setAttribute("games", games);
        resp.sendRedirect("index.jsp");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
