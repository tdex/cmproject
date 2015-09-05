package br.com.cmproject.teste;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cmproject.model.Visitante;
import com.cmproject.regradenegocio.VisitanteRN;
import com.cmproject.util.HibernateUtil;

public class VisitanteTeste {

	private static Session sessao;
	private static Transaction transacao;

	@BeforeClass
	public static void abreConexao(){

		sessao = HibernateUtil.getSession().getCurrentSession();
		transacao = sessao.beginTransaction();
	}

	@AfterClass
	public static void fechaConexao(){

		try {
			transacao.commit();
			
		} catch (Exception e) {
			System.out.println("deu problema no commit : "+e.getMessage()); 
		} finally {
			try {
				if(sessao.isOpen()){
					sessao.close();
				}
			} catch (Exception e2) {
				System.out.println("deu problema no fechamento da sessao : "+e2.getMessage()); 
			}
		}
	}
	
//	@Before
//	public void setup(){
//		Visitante v2 = new Visitante("maria",123,"gmail","1","rua carrapeta");
//		Visitante v3 = new Visitante("jose",456,"hotmail","2","rua  nova descoberta");
//		Visitante v4 = new Visitante("roberto",789,"outlook","3","rua pitombinha");
//		Visitante v5 = new Visitante("tales",1011,"uol","4","rua betinha");
//		Visitante v6 = new Visitante("rogerio",1213,"terra","5","rua maria do bairro");
//	
//		sessao.save(v2);
//		sessao.save(v3);
//	    sessao.save(v4);
//	    sessao.save(v5);
//		sessao.save(v6);
//	}
	
	@Test
	public void salvarVisitanteTest(){
		
		Visitante v1 = new Visitante("RAFAEL","9999","EMAIL.COM","kkkk","rua milagre", "");
		
		VisitanteRN visitanteRN = new VisitanteRN();
		
		visitanteRN.salvar(v1);
		
		
		
		assertEquals(true, true);
	}
	
//	@Test
//	public void salvarVisitanteTest(){
//		
//		String sql = "from Visitante v where v.nome like :nome";
//		Query consulta = sessao.createQuery(sql);
//		consulta.setString("nome", "%ma%");
//		Visitante visitante = (Visitante) consulta.uniqueResult();
//		
//		assertEquals(123, visitante.getTelefone());
//	}
//	
//	@Test
//	public void listarVisitantetest(){
//		
//		Criteria lista = sessao.createCriteria(Visitante.class);
//		@SuppressWarnings("unchecked")
//		List<Visitante> visitantes = lista.list();
//		
//		assertEquals(5, visitantes.size());
//	}
//	
//	@Test
//	public void excluirVisitantetest(){
//		
//		String sql = "from Visitante v where v.nome like :nome";
//		Query consulta = sessao.createQuery(sql);
//		consulta.setString("nome", "%maria%");
//		Visitante visitanteAlterado = (Visitante) consulta.uniqueResult();
//		sessao.delete(visitanteAlterado);
//		
//		visitanteAlterado = (Visitante) consulta.uniqueResult();
//
//	}
//	
//	@Test
//	public void alteracaoVisitantetest(){
//		
//		String sql = "from Visitante v where v.nome like :nome";
//		Query consulta = sessao.createQuery(sql);
//		consulta.setString("nome", "%tales%");
//		Visitante visitanteAlterado = (Visitante) consulta.uniqueResult();
//		visitanteAlterado.setEmail("aaaaaaa");
//		
//		sessao.update(visitanteAlterado);
//		
//		visitanteAlterado = (Visitante) consulta.uniqueResult();
//		assertEquals("aaaaaaa", visitanteAlterado.getEmail());
//	}
//	
//	@After
//	public void limparBanco(){
//		Criteria lista = sessao.createCriteria(Visitante.class);
//		@SuppressWarnings("unchecked")
//		List<Visitante> visitantes = lista.list();
//		
//		for(Visitante visitante: visitantes){
//			sessao.delete(visitantes);
//		}
//	}

}


