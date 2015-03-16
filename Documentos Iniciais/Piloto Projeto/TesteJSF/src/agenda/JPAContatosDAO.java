package agenda;

import java.util.List;

import javax.persistence.EntityManager;

public class JPAContatosDAO implements ContatosDAO {

	private EntityManager abreConexao() {return null;	}

	@Override
	public void salvaContato(Contatos c) {
		EntityManager em = abreConexao();
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
		em.close();		
	}


	@Override
	public List<Contatos> mostrarContatos() {
		EntityManager em = abreConexao();
		
		List<Contatos> contatos = em.createQuery("select c from Contatos c").getResultList();
		
		em.close();
		return contatos;
	}

}
