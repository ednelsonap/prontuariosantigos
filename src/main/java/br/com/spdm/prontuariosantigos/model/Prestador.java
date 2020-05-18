package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Prestador implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="campo01", length=6)
	private Integer codigo;
	
	@Column(name="campo02", length=40)
	private String nome;
	
	@Column(name="campo03", length=1)
	private String campo03;
	
	@Column(name="campo04", length=11)
	private String cpf;
	
	@Column(name="categoria", length=2)
	private String categoria;
	
	@Column(name="cargahor", length=5)
	private String cargaHor;
	
	@Column(name="crprof", length=8)
	private String crProf;
	
	@Column(name="empresa", length=40)
	private String empresa;
	
	@Column(name="cnpj", length=14)
	private String cnpj;
	
	@Column(name="cns", length=15)
	private String cns;

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCampo03() {
		return campo03;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getCargaHor() {
		return cargaHor;
	}

	public String getCrProf() {
		return crProf;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getCns() {
		return cns;
	}
	
	
}
