public class Respuesta {
	private Double porcentaje_exito;
	private String respuesta;
	
	public Respuesta(String respuesta, Double porcentaje_exito) {
		this.setPorcentaje_exito(porcentaje_exito);
		this.setRespuesta(respuesta);
	}
	
	public Double getPorcentaje_exito() {
		return porcentaje_exito;
	}
	public void setPorcentaje_exito(Double porcentaje_exito) {
		this.porcentaje_exito = porcentaje_exito;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
}
