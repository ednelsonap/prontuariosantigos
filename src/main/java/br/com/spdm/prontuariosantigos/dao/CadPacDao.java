package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.spdm.prontuariosantigos.model.CadPac;

public class CadPacDao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<CadPac> dao;
	
	@PostConstruct
	void init(){
		this.dao = new DAO<CadPac> (this.em, CadPac.class);
	}
	//Métodos delegados do DAO
	public void adiciona(CadPac cadPac) {
		this.dao.adiciona(cadPac);
	}

	public void remove(CadPac cadPac) {
		this.dao.remove(cadPac);
	}

	public void atualiza(CadPac cadPac) {
		this.dao.atualiza(cadPac);
	}

	public List<CadPac> listaTodos() {
		return this.dao.listaTodos();
	}

	public int contaTodos() {
		return this.dao.contaTodos();
	}

	public CadPac buscaPorId(Integer id) {
		return this.dao.buscaPorId(id);
	}
	
	public List<CadPac> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.dao.listaTodosPaginada(firstResult, maxResults, coluna, valor);
	}
	
	public int quantidadeDeElementos() {
		return this.dao.quantidadeDeElementos();
	}
	
	
	public boolean cadPacExistente(CadPac cadPac) {

		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<CadPac> query = em.createQuery(
				" select p from Paciente p " + " where p.codigoPaciente = :pCodigoPaciente", CadPac.class);

		query.setParameter("pCodigoPaciente", cadPac.getCodigoPaciente());

		try {
			CadPac resultado = query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}

		em.close();

		return true;
	}

	public boolean nomeExistente(CadPac cadPac) {

		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<CadPac> query = em.createQuery(" select p from CadPac p " + " where p.nome = :pNome",
				CadPac.class);

		query.setParameter("pNome", cadPac.getNome());

		try {
			CadPac resultado = query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}

		em.close();

		return true;
	}
	
	public List<CadPac> porNomeSemelhante(String nome) {
		return em.createQuery("from CadPac where nome like :nome", CadPac.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}
	
	
	
	//com join cadpa2
	/*public List<Paciente> porNome(String nome) {
		return em.createQuery("from Paciente where nome like :nome", Paciente.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}*/
	
}
