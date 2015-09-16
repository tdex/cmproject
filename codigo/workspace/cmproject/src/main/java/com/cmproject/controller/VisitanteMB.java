package com.cmproject.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Visitante;
import com.cmproject.regradenegocio.VisitanteRN;
import com.mysql.jdbc.TimeUtil;

@ManagedBean (name="visitanteMB")
@SessionScoped
public class VisitanteMB {

	private boolean loggedIn;

	private Visitante visitante = new Visitante();
	
	private Visitante visitanteLogado = new Visitante();

	public void salvar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarCPF(visitante.getCpf()) || visitanteRN.pesquisarEmail(visitante.getEmail())){
			FacesMessage mensagem = new FacesMessage("cpf informado já cadastrado.");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		} else {
			visitanteRN.salvar(visitante);
			FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		}
	}

	public String logar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarEmail(visitante.getEmail())){
			FacesMessage mensagem = new FacesMessage("Usuário logado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			setLoggedIn(true);
			visitanteLogado = visitante;
			return "/index.xhtml";
		} else {
			FacesMessage mensagem = new FacesMessage("Você não tem cadastrado");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			return "";
		}
	}

	public List<Visitante> listar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		return visitanteRN.listar_visitantes();
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

//	//Realiza o login caso de tudo certo 
//	public String doLogin(){ 
//		//Verifica se o e-mail e senha existem e se o usuario pode logar 
//		Usuario usuarioFound = (Usuario) usuarioBO.isUsuarioReadyToLogin(email, senha); 
//		//Caso não tenha retornado nenhum usuario, então mostramos um erro
//		//e redirecionamos ele para a página login.xhtml 
//		//para ele realiza-lo novamente 
//		if (usuarioFound == null){ 
//			addErrorMessage("Email ou Senha errado, tente novamente !"); 
//			FacesContext.getCurrentInstance().validationFailed(); 
//			return "/login/login.xhtml?faces-redirect=true"; 
//		}else{ 
//			//caso tenha retornado um usuario, setamos a variável loggedIn 
//			//como true e guardamos o usuario encontrado na variável 
//			//usuarioLogado. Depois de tudo, mandamos o usuário 
//			//para a página index.xhtml 
//			loggedIn = true; 
//			usuarioLogado = usuarioFound; 
//			return "/restricted/index.xhtml?faces-redirect=true"; } } 
//	//Realiza o logout do usuário logado 
//	public String doLogout(){ 
//		//Setamos a variável usuarioLogado como nulo, ou seja, limpamos 
//		//os dados do usuário que estava logado e depois setamos a variável 
//		//loggedIn como false para sinalizar que o usuário não está mais 
//		//logado 
//		usuarioLogado = null; 
//		loggedIn = false; 
//		//Mostramos um mensagem ao usuário e redirecionamos ele para a 
//		//página de login 
//		addInfoMessage("Logout realizado com sucesso !"); 
//		return "/login/login.xhtml?faces-redirect=true"; 
//	}
//}
//}
}






