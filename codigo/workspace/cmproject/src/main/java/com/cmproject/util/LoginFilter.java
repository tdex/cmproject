package com.cmproject.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmproject.controller.VisitanteMB;

public class LoginFilter implements Filter { 

	public void destroy() { 
		// TODO Auto-generated method stub 
	} 

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//Captura o ManagedBean chamado “usuarioMB” 
		VisitanteMB visitanteMB = (VisitanteMB) ((HttpServletRequest) request) .getSession().getAttribute("visitanteMB"); 
		//Verifica se nosso ManagedBean ainda não 
		//foi instanciado ou caso a 
		//variável loggedIn seja false, assim saberemos que 
		// o usuário não está logado 
		if (visitanteMB == null || !visitanteMB.isLoggedIn()) { 
			String contextPath = ((HttpServletRequest) request) .getContextPath(); 
			//Redirecionamos o usuário imediatamente 
			//para a página de login.xhtml 
			((HttpServletResponse) response).sendRedirect (contextPath + "/_pages/_other/login.xhtml"); } 
		else { 
			//Caso ele esteja logado, apenas deixamos 
			//que o fluxo continue 
			chain.doFilter(request, response); 
			} 
	} 
	public void init(FilterConfig arg0) throws ServletException { 
		// TODO Auto-generated method stub 
	} 
}



