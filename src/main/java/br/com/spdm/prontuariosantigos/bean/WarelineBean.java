package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.CadPacDao;
import br.com.spdm.prontuariosantigos.model.CadPa2;
import br.com.spdm.prontuariosantigos.model.CadPac;

@Named
@ViewScoped
public class WarelineBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private CadPac cadPac = new CadPac();
	private CadPa2 cadPa2 = new CadPa2();
	private List<CadPac> cadPacs;
	private List<CadPac> cadPacsFiltrados;
	private String nome;
	
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

	public CadPa2 getCadPa2() {
		return cadPa2;
	}

	public void setCadPa2(CadPa2 cadPa2) {
		this.cadPa2 = cadPa2;
	}
}
