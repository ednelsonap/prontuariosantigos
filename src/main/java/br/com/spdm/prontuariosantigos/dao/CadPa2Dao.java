package br.com.spdm.prontuariosantigos.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.spdm.prontuariosantigos.model.CadPa2;

public class CadPa2Dao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	private DAO<CadPa2> dao;
	
	@PostConstruct
	void init(){
		this.dao = new DAO<CadPa2> (this.em, CadPa2.class);
	}
	//Métodos delegados do DAO
	public void adiciona(CadPa2 cadPa2) {
		this.dao.adiciona(cadPa2);
	}

	public void remove(CadPa2 cadPa2) {
		this.dao.remove(cadPa2);
	}

	public void atualiza(CadPa2 cadPa2) {
		this.dao.atualiza(cadPa2);
	}

	public List<CadPa2> listaTodos() {
		return this.dao.listaTodos();
	}

	public int contaTodos() {
		return this.dao.contaTodos();
	}

	public CadPa2 buscaPorId(Integer id) {
		return this.dao.buscaPorId(id);
	}
	
	public List<CadPa2> listaTodosPaginada(int firstResult, int maxResults, String coluna, String valor) {
		return this.dao.listaTodosPaginada(firstResult, maxResults, coluna, valor);
	}
	
	public int quantidadeDeElementos() {
		return this.dao.quantidadeDeElementos();
	}
	
	/*public List<CadPa2> porMaeSemelhante(String maePaciente) {
		return em.createQuery("from CadPa2 where maePaciente like :maePaciente", CadPa2.class)
				.setParameter("maePaciente", "%" + maePaciente + "%")
				.getResultList();
	}*/
	
	public List<CadPa2> porNomeSemelhante(String nomePaciente) {
		return em.createQuery("from CadPa2 where cadPac.nome like :nome", CadPa2.class)
				.setParameter("nome", "%" + nomePaciente + "%")
				.getResultList();
	}
	
	public List<CadPa2> porCodigoPaciente(String codigoPaciente) {
		return em.createQuery("from CadPa2 where cadPac.codigoPaciente = :codigoPaciente", CadPa2.class)
				.setParameter("codigoPaciente", "%" + codigoPaciente + "%")
				.getResultList();
	}
}
