package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class JDBCContatosDAO implements ContatosDAO {

	private Connection abreConexão() {return null;}

	@Override
	public void salvaContato(Contatos a) {
		// TODO Auto-generated method stub
		String sql = "insert into contatos" + "(id, nome, telefone)"+" values (?,?,?)";

		Connection conexao = abreConexão();

		try {
			PreparedStatement statement = null;
			statement = conexao.prepareStatement(sql);

			statement.setInt(1, a.getId());
			statement.setString(2, a.getNome());
			statement.setInt(3, a.getTelefone());

			statement.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			try {
				conexao.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}


	@Override
	public List<Contatos> mostrarContatos(){
		List<Contatos>  contatos = new ArrayList<Contatos>();
		String sql = "select * from contatos";
		Connection conexao = abreConexão();
		
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				Contatos contato = new Contatos();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getInt("telefone"));
				
				contatos.add(contato); //adiciona o contato obtido na lista
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			try {
				conexao.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return contatos;
	}

}
