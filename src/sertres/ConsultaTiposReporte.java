package sertres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class ConsultaTiposReporte {

	public static LinkedList<TipoReporte> getTipoReporte()
	   {
	      LinkedList<TipoReporte> listaTipoReporte=new LinkedList<TipoReporte>();
	      try
	      {
	         Class.forName("org.gjt.mm.mysql.Driver");
	         Connection conexion = DriverManager.getConnection(
	            "jdbc:mysql://localhost/tipoReporte", "usuario", "password");
	         Statement st = conexion.createStatement();
	         ResultSet rs = st.executeQuery("select * from tipo_reporte" );
	         while (rs.next())
	         {
	        	 TipoReporte tipoReporte = new TipoReporte();
	        	 tipoReporte.setId_tipo_reporte(rs.getInt("Id_tipo_reporte"));
	        	 tipoReporte.setTipo_reporte(rs.getString("Tipo_reporte"));
	        	 tipoReporte.setDescripcion(rs.getString("Descripcion"));
	        	 listaTipoReporte.add(tipoReporte);
	         }
	         rs.close();
	         st.close();
	         conexion.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      return listaTipoReporte;
	   }
}
