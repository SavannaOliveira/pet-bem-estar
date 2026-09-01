package biblioteca;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Biblioteca {
	
	@Id
	private Long id; 
	private String nome;
	private String email;
	
	private List<Jogo> jogos = new ArrayList<>();
	
	public Biblioteca(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void adicionarJogo(Jogo jogo) {
		jogos.add(jogo);
		jogo.setBiblioteca(this);
	}
}
