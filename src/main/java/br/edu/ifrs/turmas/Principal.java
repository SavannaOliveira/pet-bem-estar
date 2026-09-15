package br.edu.ifrs.turmas;

import java.util.List;

import br.edu.ifrs.turmas.dao.*;

import br.edu.ifrs.turmas.dominio.Aluno;
import br.edu.ifrs.turmas.dominio.Professor;
import br.edu.ifrs.turmas.dominio.Turma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
    
	ProfessorDAO professorDAO = new ProfessorDAOJPA();   
    
    Professor ana = new Professor("Ana", "ana@ifrs.edu.br");
    professorDAO.salvar(ana);
    ana.setEmail("anuxa@email.com");
    professorDAO.atualizar(ana);
    
    Professor vitor = new Professor("Vitor", "vitor@ifrs.edu.br");
    professorDAO.salvar(vitor);
    
    professorDAO.remover(1L);

	
}
}