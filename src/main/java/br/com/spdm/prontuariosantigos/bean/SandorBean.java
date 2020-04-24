package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.SandorDao;
import br.com.spdm.prontuariosantigos.model.Sandor;

@Named
@ViewScoped
public class SandorBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Sandor sandor = new Sandor();
	private String nomePaciente;

	private List<Sandor> pacientesFiltrados;
	
	@Inject
	private SandorDao sandorDao; 
	
	/*@Inject
	private FacesContext context;*/
	
	
	public Sandor getSandor() {
		return sandor;
	}

	public void setSandor(Sandor sandor) {
		this.sandor = sandor;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public void pesquisarPorNome() {
		pacientesFiltrados = sandorDao.porNomeSemelhante(nomePaciente);
	}
	
	public List<Sandor> getPacientesFiltrados() {
		return pacientesFiltrados;
	}
	
	public void limparPesquisa() {
		this.sandor = new Sandor();
		this.pacientesFiltrados = new ArrayList<>();
		this.nomePaciente = ""; 
		PrimeFaces.current().resetInputs("formPesquisa:panelGridPesquisa");
	}

}
