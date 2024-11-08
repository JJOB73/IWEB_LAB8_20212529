package com.example.lab8.Servlet;

import com.example.lab8.daos.PeliculaDao;
import com.example.lab8.beans.Pelicula;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PeliculaServlet", value = "/PeliculaServlet")
public class PeliculaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PeliculaDao peliculaDao = new PeliculaDao();

        ArrayList<Pelicula> peliculas = peliculaDao.listarPeliculas();

        System.out.println("Lista de películas obtenidas: " + peliculas);

        request.setAttribute("peliculas", peliculas);

        RequestDispatcher view = request.getRequestDispatcher("listaPeliculas.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        PeliculaDao peliculaDao = new PeliculaDao();

        if ("eliminar".equals(accion)) {
            try {
                int idPelicula = Integer.parseInt(request.getParameter("id"));

                // Eliminar la película con el ID proporcionado
                peliculaDao.eliminarPelicula(idPelicula);

                // Confirmación de depuración
                System.out.println("Película con ID " + idPelicula + " eliminada.");

                // Después de eliminar, redirige a la lista de películas para actualizar la vista
                response.sendRedirect("peliculas");  // Redirigir a /peliculas para actualizar la lista
            } catch (NumberFormatException e) {
                System.out.println("ID de película no válido: " + request.getParameter("id"));
            }
        }
    }
}

