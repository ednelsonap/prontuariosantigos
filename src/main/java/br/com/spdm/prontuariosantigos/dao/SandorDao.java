package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.spdm.prontuariosantigos.model.Sandor;

public class SandorDao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<Sandor> dao;
	
	@PostConstruct
	void init(){
		this.dao = new DAO<Sandor> (this.em, Sandor.class);
	}
	//Métodos delegados do DAO
	public void adiciona(Sandor sandor) {
		this.dao.adiciona(sandor);
	}

	public void remove(Sandor sandor) {
		this.dao.remove(sandor);
	}

	public void atualiza(Sandor sandor) {
		this.dao.atualiza(sandor);
	}

	public List<Sandor> listaTodos() {
		return this.dao.listaTodos();
	}

	public int contaTodos() {
		return this.dao.contaTodos();
	}

	public Sandor buscaPorId(Integer id) {
		return this.dao.buscaPorId(id);
	}
	
	public List<Sandor> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.dao.listaTodosPaginada(firstResult, maxResults, coluna, valor);
	}
	
	public int quantidadeDeElementos() {
		return this.dao.quantidadeDeElementos();
	}
	
	public List<Sandor> porNomeSemelhante(String nomePaciente) {
		return em.createQuery("from Sandor s where s.nomePac like :nome", Sandor.class)
				.setParameter("nome", "%" + nomePaciente + "%")
				.getResultList();
	}
	
}
