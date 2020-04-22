package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.spdm.prontuariosantigos.model.CadPa2;
import br.com.spdm.prontuariosantigos.model.CadPac;

public class WarelineDao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<CadPac> daoCadPac;
	private DAO<CadPa2> daoCadPa2;
	
	@PostConstruct
	void init(){
		this.daoCadPac = new DAO<CadPac> (this.em, CadPac.class);
		this.daoCadPa2 = new DAO<CadPa2> (this.em, CadPa2.class);
	}
	//Métodos delegados do DAO
	

	public List<CadPac> listaTodosCadPac() {
		return this.daoCadPac.listaTodos();
	}
	
	public List<CadPac> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.daoCadPac.listaTodosPaginada(firstResult, maxResults, coluna, valor);
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
	
	public List<CadPac> porNome(String nome) {
		return em.createQuery("from CadPac where nome like :nome", CadPac.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}
	
	//com join cadpa2
	public List<CadPac> porNomeSemelhante(String nome) {
		return em.createQuery("c.codigoPaciente, c.nome, c.dataNascimento, d.maePaciente from CadPac c left join CadPa2 as d on c.codigoPaciente=d.codigoPaciente where nome like :nome", CadPac.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}
	
}
