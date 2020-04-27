package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Sandor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "prontu", length = 10, unique=true, nullable=false)
	private String prontu;

	@Column(name = "prontuant", length = 10)
	private String prontuAnt;
	
	@Column(name = "nomepac", length = 60)
	private String nomePac;

	@Column(name = "endereco", length = 60)
	private String endereco;
	
	@Column(name = "cidade", length = 20)
	private String cidade;
	
	@Column(name = "estado", length = 2)
	private String estado;
	
	@Column(name = "cep", length = 8)
	private String cep;
	
	@Column(name = "contato", length = 30)
	private String contato;
	
	@Column(name = "datanasc", length = 10)
	private String dataNasc;

	@Column(name = "sexo", length = 1)
	private String sexo;

	@Column(name = "dtcadast", length = 10)
	private String dtCadast;

	@Column(name = "horate", length = 10)
	private String horAte;

	@Column(name = "validade", length = 10)
	private String validade;
	
	@Column(name = "estcivil", length = 1)
	private String estCivil;
	
	@Column(name = "docum", length = 15)
	private String docum;
	
	@Column(name = "tdocum", length = 10)
	private String tDocum;
	
	@Column(name = "funresp", length = 30)
	private String funResp;
	
	@Column(name = "bairro", length = 20)
	private String bairro;

	@Column(name = "pai", length = 60)
	private String pai;
	
	@Column(name = "mae", length = 60)
	private String mae;
	
	@Column(name = "conjuge", length = 60)
	private String conjuge;
	
	@Column(name = "profissao", length = 30)
	private String profissao;
	
	@Column(name = "emprtr", length = 30)
	private String emprTr;
	
	@Column(name = "cgcemptr", length = 10)
	private String cgcEmpTr;
	
	@Column(name = "religiao", length = 20)
	private String religiao;
	
	@Column(name = "cor", length = 10)
	private String cor;
	
	@Column(name = "codconv", length = 50)
	private String codConv;
	
	@Column(name = "grau", length = 50)
	private String grau;
	
	@Column(name = "ddd", length = 5)
	private String ddd;
	
	@Column(name = "fone", length = 10)
	private String fone;
	
	@Column(name = "naturali", length = 30)
	private String natural;
	
	@Column(name = "filhos", length = 10)
	private String filhos;
	
	@Column(name = "rgresp", length = 15)
	private String rgResp;
	
	@Column(name = "resp", length = 60)
	private String resp;
	
	@Column(name = "endresp", length = 60)
	private String endResp;
	
	@Column(name = "dddresp", length = 5)
	private String dddResp;
	
	@Column(name = "fonresp", length = 10)
	private String fonResp;
	
	@Column(name = "codtat", length = 3)
	private String codAAt;
	
	@Column(name = "modulo", length = 1)
	private String modulo;
	
	@Column(name = "propac", length = 1)
	private String propac;
	
	@Column(name = "nsct", length = 1)
	private String nstc;
	
	@Column(name = "trabresp", length = 1)
	private String trabResp;
	
	@Column(name = "diag", length = 20)
	private String diag;
	
	@Column(name = "profconj", length = 30)
	private String profConj;
	
	@Column(name = "emprconj", length = 50)
	private String emprConj;
	
	@Column(name = "parentesco", length = 20)
	private String parentesco;
	
	@Column(name = "plempresa", length = 50)
	private String plEmpresa;
	
	@Column(name = "titular", length = 60)
	private String titular;
	
	@Column(name = "obs", length = 60)
	private String obs;
	
	@Column(name = "pis", length = 15)
	private String pis;
	
	@Column(name = "ctps", length = 10)
	private String ctps;
	
	@Column(name = "segurado", length = 10)
	private String segurado;
	
	@Column(name = "dtultalte", length = 10)
	private String dtUltAlte;
	
	@Column(name = "cnasc", length = 1)
	private String cNasc;
	
	@Column(name = "rg", length = 15)
	private String rg;
	
	@Column(name = "cpf", length = 15)
	private String cpf;
	
	@Column(name = "plano", length = 1)
	private String plano;
	
	@Column(name = "valconv", length = 10)
	private String valConv;
	
	@Column(name = "recado", length = 20)
	private String recado;
	
	@Column(name = "cidunimed", length = 20)
	private String cidUnimed;
	
	@Column(name = "locenc", length = 60)
	private String locEnc;
	
	@Column(name = "nautor", length = 60)
	private String nAutor;
	
	@Column(name = "cadsus", length = 15)
	private String cadsus;
	
	@Column(name = "prenatal", length = 60)
	private String preNatal;
	
	//GETTERS
	
	public Integer getId() {
		return id;
	}

	public String getProntu() {
		return prontu;
	}

	public String getProntuAnt() {
		return prontuAnt;
	}

	public String getNomePac() {
		return nomePac;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public String getContato() {
		return contato;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public String getDtCadast() {
		return dtCadast;
	}

	public String getHorAte() {
		return horAte;
	}

	public String getValidade() {
		return validade;
	}

	public String getEstCivil() {
		return estCivil;
	}

	public String getDocum() {
		return docum;
	}

	public String gettDocum() {
		return tDocum;
	}

	public String getFunResp() {
		return funResp;
	}

	public String getBairro() {
		return bairro;
	}

	public String getPai() {
		return pai;
	}

	public String getMae() {
		return mae;
	}

	public String getConjuge() {
		return conjuge;
	}

	public String getProfissao() {
		return profissao;
	}

	public String getEmprTr() {
		return emprTr;
	}

	public String getCgcEmpTr() {
		return cgcEmpTr;
	}

	public String getReligiao() {
		return religiao;
	}

	public String getCor() {
		return cor;
	}

	public String getCodConv() {
		return codConv;
	}

	public String getGrau() {
		return grau;
	}

	public String getDdd() {
		return ddd;
	}

	public String getFone() {
		return fone;
	}

	public String getNatural() {
		return natural;
	}

	public String getFilhos() {
		return filhos;
	}

	public String getRgResp() {
		return rgResp;
	}

	public String getResp() {
		return resp;
	}

	public String getEndResp() {
		return endResp;
	}

	public String getDddResp() {
		return dddResp;
	}

	public String getFonResp() {
		return fonResp;
	}

	public String getCodAAt() {
		return codAAt;
	}

	public String getModulo() {
		return modulo;
	}

	public String getPropac() {
		return propac;
	}

	public String getNstc() {
		return nstc;
	}

	public String getTrabResp() {
		return trabResp;
	}

	public String getDiag() {
		return diag;
	}

	public String getProfConj() {
		return profConj;
	}

	public String getEmprConj() {
		return emprConj;
	}

	public String getParentesco() {
		return parentesco;
	}

	public String getPlEmpresa() {
		return plEmpresa;
	}

	public String getTitular() {
		return titular;
	}

	public String getObs() {
		return obs;
	}

	public String getPis() {
		return pis;
	}

	public String getCtps() {
		return ctps;
	}

	public String getSegurado() {
		return segurado;
	}

	public String getDtUltAlte() {
		return dtUltAlte;
	}

	public String getcNasc() {
		return cNasc;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getPlano() {
		return plano;
	}

	public String getValConv() {
		return valConv;
	}

	public String getRecado() {
		return recado;
	}

	public String getCidUnimed() {
		return cidUnimed;
	}

	public String getLocEnc() {
		return locEnc;
	}

	public String getnAutor() {
		return nAutor;
	}

	public String getCadsus() {
		return cadsus;
	}

	public String getPreNatal() {
		return preNatal;
	}
	
	//HASHCODE AND EQUALS
	
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
