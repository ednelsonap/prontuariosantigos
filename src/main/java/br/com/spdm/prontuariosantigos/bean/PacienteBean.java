package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.primefaces.PrimeFaces;

import br.com.spdm.prontuariosantigos.dao.PacienteDao;
import br.com.spdm.prontuariosantigos.model.Paciente;

@Named
@ConversationScoped 
public class PacienteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Paciente paciente = new Paciente();
	
	private List<Paciente> pacientes;

	private String nome;
	
	private List<Paciente> pacientesFiltrados;
	
	@Inject
	private PacienteDao pacienteDao;
	
	@Inject
	private FacesContext context;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void pesquisar() {
		pacientesFiltrados = pacienteDao.porNomeSemelhante(nome);
	}
	
	public List<Paciente> getPacientesFiltrados() {
		return pacientesFiltrados;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getPacientes(){
		if (this.pacientes == null) {
			this.pacientes = this.pacienteDao.listaTodos();
		}
		return pacientes;
	}
	
	@Transactional
	public void alterar() {
		System.out.println("Alterando paciente " + this.paciente.getNome());

		try {
			pacienteDao.atualiza(this.paciente);
			context.addMessage(null,
					new FacesMessage("Paciente " + paciente.getNome() + " alterado com sucesso!"));

		} catch (PersistenceException e) {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Não foi possível salvar este paciente! Verifique se não há duplicidade.",
							null));
		}
		this.paciente = new Paciente();
	}

	public boolean exibirBotaoAlterar(Paciente paciente) {
		if (this.paciente.getId() != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean exibirBotaoSalvar(Paciente paciente) {
		if (this.paciente.getId() == null) {
			return true;
		} else {
			return false;
		}
	}

	public void limpar() {
		this.paciente = new Paciente();
		PrimeFaces.current().resetInputs("formPaciente:panelGridCadastro");
	}
	
	public void limparPesquisa() {
		this.paciente = new Paciente();
		PrimeFaces.current().resetInputs("formPesquisa:panelGridPesquisa");
	}
	
	@Transactional
	public void remover(Paciente paciente) {
		System.out.println("Removendo Paciente " + paciente.getNome());
		pacienteDao.remove(paciente);
		context.addMessage(null,
				new FacesMessage("Paciente " + paciente.getNome() + " removido!"));
	}	
}
