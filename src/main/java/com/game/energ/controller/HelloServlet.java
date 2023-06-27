package com.game.energ.controller;

import com.game.energ.models.Games;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Games g1 = new Games(1, "GTA V", " de acción de mundo abierto con multitud de misiones en la que encarnamos a tres personajes distintos: Trevor, Michael y Franklin.", "Rockstar", "Accion", 2013);
        Games g2 = new Games(2, "FIFA 21", "FIFA 21 es un videojuego de simulación de fútbol desarrollado por EA Vancouver y EA Rumania, como parte de la serie FIFA de Electronic Arts.", "EA Sports", "Deportes", 2020);
        Games g3 = new Games(3, "Minecraft", "Minecraft es un videojuego de construcción, de tipo «mundo abierto» o sandbox creado originalmente por el sueco Markus Persson,​ y posteriormente desarrollado por su empresa, Mojang Studios.", "Mojang", "Aventura", 2011);
        List<Games> games = new ArrayList<>();
        games.add(g1);
        games.add(g2);
        games.add(g3);

        request.setAttribute("games", games);
        request.getSession().setAttribute("games", games);
        this.getServletConfig().getServletContext().setAttribute("games", games);
        response.sendRedirect("index.jsp");

    }

    public void destroy() {
    }
}