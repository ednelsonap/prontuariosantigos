package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//CADPAC.DBF
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="codpac",length=10,unique=true)
	private String codigoPaciente;
	
	@Column(name="nompac",length=60)
	private String nome;
	
	@Column(name="datnas",length=10)
	private String dataNascimento;
	
	@Column(name="sexpac",length=1)
	private String sexo;
	
	@Column(name="endpac",length=100)
	private String endereco;
	
	@Column(name="baipac",length=30)
	private String bairro;
	
	@Column(name="codmun",length=10)
	private String codigoMunicipio;
	
	@Column(name="ceppac",length=10)
	private String cep;
	
	@Column(name="docpac",length=20)
	private String documentoPaciente;
	
	@Column(name="cpfpac",length=20)
	private String cpf;
	
	@Column(name="pispac",length=50)
	private String pisPaciente;

	@Column(name="telpac",length=20)
	private String telefone;
	
	@Column(name="paspac",length=1)
	private String pasPac;
	
	@Column(name="modolo",length=1)
	private String modulo;
	
	@Column(name="ultate",length=20)
	private String ultimoAtendimento;
	
	@Column(name="horate",length=20)
	private String horaAtendimento;
	
	@Column(name="numpas",length=11)
	private String numeroPasta;
	
	@Column(name="codcon",length=5)
	private String codigoConvenio;
	
	@Column(name="usuario",length=15)
	private String usuario;
	
	@Column(name="dtcadast",length=20)
	private String dataCadastro;
	
	@Column(name="numresid",length=15)
	private String numeroResidencia;
	
	@Column(name="cartaosus",length=20)
	private String cartaoSus;
	
	@Column(name="codbai",length=15)
	private String codigoBairro;
	
	@Column(name="pis",length=15)
	private String pis;
	
	@Column(name="certnasc",length=15)
	private String certidaoNascimento;
	
	//GETTERS
	
	public Integer getId() {
		return id;
	}
	public String getCodigoPaciente() {
		return codigoPaciente;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public String getCep() {
		return cep;
	}
	public String getDocumentoPaciente() {
		return documentoPaciente;
	}
	public String getCpf() {
		return cpf;
	}
	public String getPisPaciente() {
		return pisPaciente;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getPasPac() {
		return pasPac;
	}
	public String getModulo() {
		return modulo;
	}
	public String getUltimoAtendimento() {
		return ultimoAtendimento;
	}
	public String getHoraAtendimento() {
		return horaAtendimento;
	}
	public String getNumeroPasta() {
		return numeroPasta;
	}
	public String getCodigoConvenio() {
		return codigoConvenio;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public String getNumeroResidencia() {
		return numeroResidencia;
	}
	public String getCartaoSus() {
		return cartaoSus;
	}
	public String getCodigoBairro() {
		return codigoBairro;
	}
	public String getPis() {
		return pis;
	}
	public String getCertidaoNascimento() {
		return certidaoNascimento;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
