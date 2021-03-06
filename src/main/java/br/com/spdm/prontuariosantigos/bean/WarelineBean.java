package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.WarelineDao;
import br.com.spdm.prontuariosantigos.model.Wareline;

@Named
@ViewScoped
public class WarelineBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Wareline wareline = new Wareline();
	private String nomePaciente;

	private List<Wareline> pacientesFiltrados;
	
	@Inject
	private WarelineDao warelineDao; 
	
	/*@Inject
	private FacesContext context;*/
	
	
	public Wareline getWareline() {
		return wareline;
	}

	public void setWareline(Wareline wareline) {
		this.wareline = wareline;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public void pesquisarPorNome() {
		pacientesFiltrados = warelineDao.porNomeSemelhante(nomePaciente);
	}
	
	public List<Wareline> getPacientesFiltrados() {
		return pacientesFiltrados;
	}
	
	public void limparPesquisa() {
		this.wareline = new Wareline();
		this.pacientesFiltrados = new ArrayList<>();
		this.nomePaciente = ""; 
		PrimeFaces.current().resetInputs("formPesquisa:panelGridPesquisa");
	}

}
