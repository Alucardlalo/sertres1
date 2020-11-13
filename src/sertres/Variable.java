package sertres;

public class Variable {

	int id_variable;
	int id_tipo_reporte;
	String nombre_variable;
	String etiqueta;
	int orden;
	
	
	public int getId_variable() {
		return id_variable;
	}
	public void setId_variable(int id_variable) {
		this.id_variable = id_variable;
	}
	public int getId_tipo_reporte() {
		return id_tipo_reporte;
	}
	public void setId_tipo_reporte(int id_tipo_reporte) {
		this.id_tipo_reporte = id_tipo_reporte;
	}
	public String getNombre_variable() {
		return nombre_variable;
	}
	public void setNombre_variable(String nombre_variable) {
		this.nombre_variable = nombre_variable;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	
}
