
public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private String categoria;
	
	public Libro(String titulo,String autor, String editorial, String categoria) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setCategoria(categoria);
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
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return "Titulo: " + this.getTitulo() + " Autor: " + this.getAutor() + " Editorial: " + 
				this.getEditorial() + " Categoria: " + this.getCategoria();
	}

}
