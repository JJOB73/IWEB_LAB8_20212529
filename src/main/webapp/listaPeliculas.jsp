<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.lab8.beans.Pelicula" %>

<%
    ArrayList<Pelicula> peliculas = (ArrayList<Pelicula>)  request.getAttribute("peliculas") ;

%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Películas</title>
</head>
<body>
<h1>Lista de películas</h1>
<table border="1">
    <tr>
        <th>Título</th>
        <th>Director</th>
        <th>Año Publicación</th>
        <th>Rating</th>
        <th>BoxOffice</th>
        <th>Género</th>
        <th>Acciones</th>
    </tr>

    <%

        // Imprimir en la consola para verificar si se obtuvo correctamente
        System.out.println("Contenido de peliculas: " + peliculas);

        // Comprobamos que la lista no sea null y que no esté vacía antes de iterar
        if (peliculas != null && !peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
    %>
    <tr>
        <td><%= pelicula.getTitulo() %></td>
        <td><%= pelicula.getDirector() %></td>
        <td><%= pelicula.getAnoPublicacion() %></td>
        <td><%= pelicula.getRating() %></td>
        <td><%= pelicula.getBoxOffice() %></td>
        <td><%= pelicula.getIdGenero() %></td>
        <td>
            <!-- Botón de eliminación -->
            <form action="peliculas" method="post">
                <input type="hidden" name="accion" value="eliminar" />
                <button type="submit">Eliminar</button>
            </form>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="7">No hay películas disponibles</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>


