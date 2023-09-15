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
            <h1>Su Registro ha exitoso!</h1>  

        </header>
        <table>
            <tr>
                <td> Nombre: </td>
                <td><% 
               
                    for(int i=0;i<Aspirante.listaA.size();i++){
                    %>
                    <ul>
                        <li><%=((Aspirante) Aspirante.listaA.get(i)).getNombre()%></li>
                    </ul>
                    <ul>
                        <li><%=((Aspirante) Aspirante.listaA.get(i)).getMaterias()%></li>
                    </ul>
                    <%}%>
                </td>
            </tr>
            

        </table>


    </body>
</html>
