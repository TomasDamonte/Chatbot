
public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private String genero;
	private String fechaPublicacion;
	
	public Libro(String titulo,String autor, String editorial, String genero, String fechaPublicacion) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setGenero(genero);
		this.setFechaPublicacion(fechaPublicacion);
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return this.editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFechaPublicacion() {
		return this.fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String toString() {
		return "Titulo: " + this.getTitulo() + " Autor: " + this.getAutor() + " Editorial: " + 
	this.getEditorial() + " Genero: " + this.getGenero() + " Fecha de publicacion: " + this.getFechaPublicacion();
	}

}
