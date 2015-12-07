package com.cmproject.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;

import com.cmproject.model.StatusENUM;
import com.cmproject.model.TipoVeiculoENUM;
import com.cmproject.model.Veiculo;
import com.cmproject.regradenegocio.VeiculoNR;

@ManagedBean (name="veiculoMB")
@SessionScoped
public class VeiculoMB{

	private Veiculo veiculo = new Veiculo();

	private Veiculo selectedVeiculo = new Veiculo();

	private VeiculoNR veiculoNR;

	private UploadedFile file;
	 
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }

	public void salvar(){
		this.veiculo.setImagem(file.getFileName());
		VeiculoNR veiculoNR = new VeiculoNR();
		veiculoNR.salvar(veiculo);
		FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}

	public String alugarNossosVeiculos(String nome){
		VeiculoNR veiculoNR = new VeiculoNR();
		veiculo = veiculoNR.getVeiculo(nome);
		return "/_pages/_edit/aluguel.xhtml";
	}

	public String alugar() throws ParseException{

		String dataInicioDigitada = this.veiculo.getDataInicio();
		String dataFinalDigitada = this.veiculo.getDataFinal();

		VeiculoNR veiculoNRn = new VeiculoNR();
		String teste = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nome");
		this.veiculo = veiculoNRn.getVeiculo(teste);
		veiculo.setDataInicio(dataInicioDigitada);
		veiculo.setDataFinal(dataFinalDigitada);

		if(this.veiculo.getDataInicio() == "" || this.veiculo.getDataFinal() == ""){
			FacesMessage mensagem = new FacesMessage("Os campos 'Data de retirada' e 'Data de devolução' devem ser preenchidos!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			return "";
		} else {
			Date dataAtual = new Date();
			SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");  
			Date dateDataInicio = formatData.parse(this.veiculo.getDataInicio());
			if(dateDataInicio.compareTo(dataAtual) == 1){
				Date dateDataFinal = formatData.parse(this.veiculo.getDataFinal());
				if(dateDataFinal.compareTo(dateDataInicio) == 1){
					VeiculoNR veiculoNR = new VeiculoNR();
					//					String nome = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nome");
					//					Veiculo veiculo = new Veiculo();
					//					veiculo = veiculoNR.getVeiculo(nome);
					this.veiculo.setStatus(StatusENUM.Indisponível);
					//					veiculo.setDataInicio(this.veiculo.getDataInicio());
					//					veiculo.setDataFinal(this.veiculo.getDataFinal());
					veiculoNR.salvar(veiculo);
					FacesMessage mensagem = new FacesMessage("Veículo alugado com sucesso!");
					FacesContext context = FacesContext.getCurrentInstance();
					context.addMessage(null, mensagem);
					return "/_pages/_other/alugado_sucesso.xhtml";
				} else {
					FacesMessage mensagem = new FacesMessage("O campo 'Data de devolução' deve ter uma data maior que a do campo 'Data de retirada'");
					FacesContext context = FacesContext.getCurrentInstance();
					context.addMessage(null, mensagem);
					return "";
				}
			} else {
				FacesMessage mensagem = new FacesMessage("O campo 'Data de retirada' deve ter uma data maior que atual");
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(null, mensagem);
				return "";
			}
		}
	}

	//	public String verficarTodosLabels(String , String tipo, String valor){
	//		VeiculoNR veiculoNR = new VeiculoNR();
	//		String retorno = veiculoNR.verficarLabelValor(nome);
	//		return retorno;
	//	}

	public boolean verficarStatus(String nome){
		VeiculoNR veiculoNR = new VeiculoNR();
		this.veiculo = veiculoNR.getVeiculo(nome);
		boolean retorno = veiculoNR.verificarStatus(nome);
		return retorno;
	}

	public String verficarLabelValor(String nome){
		VeiculoNR veiculoNR = new VeiculoNR();
		String retorno = veiculoNR.verficarLabelValor(nome);
		return retorno;
	}

	public List<Veiculo> listar(){
		veiculoNR = new VeiculoNR();
		return veiculoNR.listar_veiculos();
	}

	public void selectVeiculo(SelectEvent evt){
		try {
			if (evt.getObject() != null) {
				this.selectedVeiculo = (Veiculo) evt.getObject();
			} else {
				this.selectedVeiculo = null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void unselectVeiculo(){
		this.selectedVeiculo = null;
	}

	public void remover() {
		if (this.selectedVeiculo != null) {
			this.veiculoNR.deletar(selectedVeiculo);
		} else{
			System.out.println("nenhum veiculo selecionado");
		}
	}

	public void onDateSelect(SelectEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	}

	public void click() {
		RequestContext requestContext = RequestContext.getCurrentInstance();

		requestContext.update("form:display");
		requestContext.execute("PF('dlg').show()");
	}

	//getter e setter
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<TipoVeiculoENUM> getTipoVeiculo(){
		return Arrays.asList(TipoVeiculoENUM.values());
	}

	public List<StatusENUM> getStatusVeiculos(){
		return Arrays.asList(StatusENUM.values());
	}

	public Veiculo getSelectedVeiculo() {
		return selectedVeiculo;
	}

	public void setSelectedVeiculo(Veiculo selectedVeiculo) {
		this.selectedVeiculo = selectedVeiculo;
	}

	public VeiculoNR getVeiculoNR() {
		return veiculoNR;
	}

	public void setVeiculoNR(VeiculoNR veiculoNR) {
		this.veiculoNR = veiculoNR;
	}

}
