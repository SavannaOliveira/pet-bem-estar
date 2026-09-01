package biblioteca;

public class Jogo {
	private String titulo;
	private Plataforma plataforma;
	private Biblioteca biblioteca;
	
	public Jogo(String titulo, Plataforma plataforma) {
		this.titulo = titulo;
		this.plataforma = plataforma;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public Plataforma getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	public String toString() {
		return "Titulo: " + titulo + "\nPlataforma:" + plataforma;
	}
}
