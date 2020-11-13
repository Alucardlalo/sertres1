<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "sertres.ConsultaTiposReporte"%> 
<%@ page import = "sertres.TipoReporte"%> 
<%@ page import = "java.util.LinkedList"%> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>pruebas reporte</title>
</head>
	<style>
		.header{
			padding-top:15px;
		}
	</style>
<body>
	<div class="header">
	</div>
	<div class = "container">
	pruebas de reporte de dispositivos y pruebas quincenales
	
		<div><!-- tabla de tipos de reporte -->
			<%
			LinkedList<TipoReporte> lista = ConsultaTiposReporte.getTipoReporte();
			for (int i=0;i<lista.size();i++)
			{
			   out.println("<tr>");
			   out.println("<td>"+lista.get(i).getId_tipo_reporte()+"</td>");
			   out.println("<td>"+lista.get(i).getTipo_reporte()+"</td>");
			   out.println("<td>"+lista.get(i).getDescripcion()+"</td>");
			   out.println("</tr>");
			}
			%>
		</div>
	
	</div>
</body>
</html>