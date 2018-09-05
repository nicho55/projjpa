package aplicacao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Telefone;
import dominio.Usuario;

public class Programa {

	public static void main(String[] args) {

		List<Telefone> fones = new ArrayList<>();
		
		Usuario u = new Usuario(null, "ROnan123", "123123");
		
		Telefone t = new Telefone();
		t.setFone("7070-7070");
		
		Telefone t2 = new Telefone();
		t2.setFone("8080-7070");
		
		fones.add(t);
		fones.add(t2);
		u.setTelefone(fones);
		
	
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("aula-jpa");
		
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(t);
		em.persist(t2);
		em.persist(u);
		
			
		em.getTransaction().commit();
		em.close();
		fabrica.close();
		
	}

}
