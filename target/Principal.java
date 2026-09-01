package br.edu.ifrs.turmas;

import br.edu.ifrs.turmas.dominio.Aluno;
import br.edu.ifrs.turmas.dominio.Professor;
import br.edu.ifrs.turmas.dominio.Turma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {

        Professor ana = new Professor("Ana", "ana@ifrs.edu.br");

        Turma turmaA = new Turma("Programacao para Web I - Turma A");
        Turma turmaB = new Turma("Programacao para Web I - Turma B");

        ana.adicionarTurma(turmaA);
        ana.adicionarTurma(turmaB);

        turmaA.adicionarAluno(new Aluno("Bruno", "2026001"));
        turmaA.adicionarAluno(new Aluno("Carla", "2026002"));
        turmaB.adicionarAluno(new Aluno("Diego", "2026003"));

        System.out.println("Professora: " + ana);
        System.out.println("Turmas: " + ana.getTurmas());
        System.out.println();

        for (Turma turma : ana.getTurmas()) {
            System.out.println(turma + " | alunos: " + turma.getAlunos());
        }
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("turmas-pu");
        EntityManager em = enf.createEntityManager();
        
        em.getTransation().begin();
        em.persist(ana);
        
       em.getTransaction().commit();

       em.close();
       em.close();

        // A pergunta de hoje: quando este programa termina, o que sobra
        // da professora Ana e das turmas dela? 
    }
}
