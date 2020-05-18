package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Medico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=6)
	private Integer crmMed;
	
	@Column(length=40)
	private String nomMed;
	
	@Column(length=14)
	private String cpfMed;
	
	@Column(length=1)
	private String vinMed;
	
	@Column(length=1)
	private String corpoClin;
	
	@Column(length=2)
	private String codEsp;
	
	@Column(length=60)
	private String endereco;
	
	@Column(length=40)
	private String email;
	
	@Column(length=20)
	private String foneRes;
	
	@Column(length=20)
	private String foneCom;
	
	@Column(length=20)
	private String foneCel;
	
	@Column(length=20)
	private String foneBip;
	
	@Column(length=3)
	private String banco;
	
	@Column(length=5)
	private String agencia;
	
	@Column(length=10)
	private String conta;
	
	@Column(length=20)
	private String bairro;
	
	@Column(length=8)
	private String cep;
	
	@Column(length=20)
	private String cidade;
	
	@Column(length=2)
	private String estado;
	
	@Column(length=60)
	private String infoMed;
	
	@Column(length=10)
	private String dataNasc;
	
	@Column(length=10)
	private String iniCorpCli;
	
}
