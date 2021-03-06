package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.spdm.prontuariosantigos.model.Wareline;

public class WarelineDao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<Wareline> dao;
	
	@PostConstruct
	void init(){
		this.dao = new DAO<Wareline> (this.em, Wareline.class);
	}
	//Métodos delegados do DAO
	public void adiciona(Wareline wareline) {
		this.dao.adiciona(wareline);
	}

	public void remove(Wareline wareline) {
		this.dao.remove(wareline);
	}

	public void atualiza(Wareline wareline) {
		this.dao.atualiza(wareline);
	}

	public List<Wareline> listaTodos() {
		return this.dao.listaTodos();
	}

	public int contaTodos() {
		return this.dao.contaTodos();
	}

	public Wareline buscaPorId(Integer id) {
		return this.dao.buscaPorId(id);
	}
	
	public List<Wareline> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.dao.listaTodosPaginada(firstResult, maxResults, coluna, valor);
	}
	
	public int quantidadeDeElementos() {
		return this.dao.quantidadeDeElementos();
	}
	
	public List<Wareline> porNomeSemelhante(String nomePaciente) {
		return em.createQuery("from Wareline w where w.nomPac like :nome", Wareline.class)
				.setParameter("nome", "%" + nomePaciente + "%")
				.getResultList();
	}
	
}
