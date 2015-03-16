package agenda;

import java.util.List;

public interface ContatosDAO {

	void salvaContato(Contatos a);
	List<Contatos> mostrarContatos();
}
