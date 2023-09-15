<%-- 
    Document   : salida
    Created on : 12/09/2023, 7:16:00 a. m.
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Aspirante"%>
<%@page import="java.util.List"%>



<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/Mi_Estilo.css" rel="stylesheet" type="text/css"> 
        <title>Salida Datos</title>
    </head>
    <body>
        <header>
            <h1> Su Registro ha sido exitoso!</h1>  
        </header>
        <table>
            <tr>
                <th> Nombre </th>
                <th> Cursos </th>
                <th> Fecha de inscripción </th>
            </tr>
            <% for(int i=0;i<Aspirante.listaA.size();i++){
                %>
                <tr>
                    <td><%=((Aspirante) Aspirante.listaA.get(i)).getNombre()%></td>
                    <td><%=((Aspirante) Aspirante.listaA.get(i)).getMaterias()%></td>
                </tr>
                <%}%>
        </table>
        
        <input class="button" type="button" onclick="" value="Volver">
        
        <footer>
            <p>&copy; Copyright 2023. Diseñado Karen Alarcón, Santiago Alfonso y Jhon Gonzalez &#124 Bogotá - Colombia</p>
        </footer>
    </body>
</html>
