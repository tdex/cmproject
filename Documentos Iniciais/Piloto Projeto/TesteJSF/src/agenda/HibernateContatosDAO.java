package agenda;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class HibernateContatosDAO implements ContatosDAO {

	private Session abreConexao() {	return null;}

	@Override
	public void salvaContato(Contatos a) {
		Session sessao = abreConexao();
		Transaction tx = sessao.beginTransaction();

		sessao.save(a);

		tx.commit();
		sessao.close();
	}

	@Override
	public List<Contatos> mostrarContatos() {
		Session sessao = abreConexao();
		
		List<Contatos> contatos = sessao.createQuery("from Contatos").list();
		
		sessao.close();
		return contatos;
	}

}
