package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.spdm.prontuariosantigos.model.Paciente;

public class PacienteDao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<Paciente> dao;
	
	@PostConstruct
	void init(){
		this.dao = new DAO<Paciente> (this.em, Paciente.class);
	}
	//Métodos delegados do DAO
	public void adiciona(Paciente paciente) {
		this.dao.adiciona(paciente);
	}

	public void remove(Paciente paciente) {
		this.dao.remove(paciente);
	}

	public void atualiza(Paciente paciente) {
		this.dao.atualiza(paciente);
	}

	public List<Paciente> listaTodos() {
		return this.dao.listaTodos();
	}

	public int contaTodos() {
		return this.dao.contaTodos();
	}

	public Paciente buscaPorId(Integer id) {
		return this.dao.buscaPorId(id);
	}
	
	public List<Paciente> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.dao.listaTodosPaginada(firstResult, maxResults, coluna, valor);
	}
	
	public int quantidadeDeElementos() {
		return this.dao.quantidadeDeElementos();
	}
	
	
	public boolean pacienteExistente(Paciente paciente) {

		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<Paciente> query = em.createQuery(
				" select p from Paciente p " + " where p.codigoPaciente = :pCodigoPaciente", Paciente.class);

		query.setParameter("pCodigoPaciente", paciente.getCodigoPaciente());

		try {
			Paciente resultado = query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}

		em.close();

		return true;
	}

	public boolean nomeExistente(Paciente paciente) {

		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<Paciente> query = em.createQuery(" select p from Paciente p " + " where p.nome = :pNome",
				Paciente.class);

		query.setParameter("pNome", paciente.getNome());

		try {
			Paciente resultado = query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}

		em.close();

		return true;
	}
	
	public List<Paciente> porNomeSemelhante(String nome) {
		return em.createQuery("from Paciente where nome like :nome", Paciente.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}
	
}
