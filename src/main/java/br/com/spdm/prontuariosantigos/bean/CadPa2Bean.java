package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.CadPa2Dao;
import br.com.spdm.prontuariosantigos.model.CadPa2;

@Named
@ConversationScoped 
public class CadPa2Bean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private CadPa2 cadPa2 = new CadPa2();

	private String maePaciente;
	
	private String codigoPaciente;
	
	private List<CadPa2> cadPa2sFiltrados;
	
	@Inject
	private CadPa2Dao cadPa2Dao; 
	
	/*@Inject
	private FacesContext context;*/
	
	
	public CadPa2 getCadPa2() {
		return cadPa2;
	}

	public void setCadPa2(CadPa2 cadPa2) {
		this.cadPa2 = cadPa2;
	}

	public String getCodigoPaciente() {
		return codigoPaciente;
	}
	
	public void setCodigoPaciente(String codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	
	public String getMaePaciente() {
		return maePaciente;
	}
	
	public void setMaePaciente(String maePaciente) {
		this.maePaciente = maePaciente;
	}
	
	public void pesquisarPorCodigo() {
		cadPa2sFiltrados = cadPa2Dao.porCodigoPaciente(codigoPaciente);
	}
	
	public void pesquisarPorMae() {
		cadPa2sFiltrados = cadPa2Dao.porMaeSemelhante(maePaciente);
	}
	
	public List<CadPa2> getCadPa2sFiltrados() {
		return cadPa2sFiltrados;
	}
	
	public void limparPesquisaCodigo() {
		this.cadPa2 = new CadPa2();
		PrimeFaces.current().resetInputs("formPesquisaCodigo:panelGridPesquisaCodigo");
	}
	
	public void limparPesquisaMae() {
		this.cadPa2 = new CadPa2();
		PrimeFaces.current().resetInputs("formPesquisaMae:panelGridPesquisaMae");
	}
}
