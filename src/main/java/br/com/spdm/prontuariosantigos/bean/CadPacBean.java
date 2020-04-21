package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.CadPacDao;
import br.com.spdm.prontuariosantigos.model.CadPac;

@Named
@ConversationScoped 
public class CadPacBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private CadPac cadPac = new CadPac();
	
	private List<CadPac> cadPacs;

	private String nome;
	
	private List<CadPac> cadPacsFiltrados;
	
	@Inject
	private CadPacDao cadPacDao;
	
	/*@Inject
	private FacesContext context;*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void pesquisar() {
		cadPacsFiltrados = cadPacDao.porNomeSemelhante(nome);
	}
	
	public List<CadPac> getCadPacsFiltrados() {
		return cadPacsFiltrados;
	}
	
	public CadPac getCadPac() {
		return cadPac;
	}

	public void setPaciente(CadPac cadPac) {
		this.cadPac = cadPac;
	}

	public List<CadPac> getCadPacs(){
		if (this.cadPacs == null) {
			this.cadPacs = this.cadPacDao.listaTodos();
		}
		return cadPacs;
	}

	public boolean exibirBotaoAlterar(CadPac cadPac) {
		if (this.cadPac.getId() != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean exibirBotaoSalvar(CadPac cadPac) {
		if (this.cadPac.getId() == null) {
			return true;
		} else {
			return false;
		}
	}

	public void limpar() {
		this.cadPac = new CadPac();
		PrimeFaces.current().resetInputs("formPaciente:panelGridCadastro");
	}
	
	public void limparPesquisa() {
		this.cadPac = new CadPac();
		PrimeFaces.current().resetInputs("formPesquisa:panelGridPesquisa");
	}
}
