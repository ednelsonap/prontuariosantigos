package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Especialidade implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codesp", length = 2)
	private Integer codEsp;
	
	@Column(name="desesp", length = 20)
	private String desEsp;

	public Integer getCodEsp() {
		return codEsp;
	}

	public String getDesEsp() {
		return desEsp;
	}
	
}
