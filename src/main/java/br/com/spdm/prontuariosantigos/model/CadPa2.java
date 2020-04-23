package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//CADPA2.DBF
@Entity
@Table(name = "cadpa2")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class CadPa2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="cgcemp",length=15)
	private String cgcemp;
	
	@Column(name="cid",length=10)
	private String cid;
	
	@Column(name="codemp",length=10)
	private String codemp;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codpac",referencedColumnName="codpac",nullable=false)
	private CadPac cadPac;
	
	@Column(name="condic",length=1)
	private String condic;
	
	@Column(name="conpac",length=60)
	private String conjuguePaciente;
	
	@Column(name="corpac",length=1)
	private String corPaciente;
	
	@Column(name="cpfres",length=15)
	private String cpfResponsavel;
	
	@Column(name="ctpspa",length=10)
	private String ctpsPaciente; //carteira de trabalho
	
	@Column(name="divida",length=7)
	private String divida;
	
	@Column(name="docres",length=15)
	private String docResponsavel;
	
	@Column(name="dtobito",length=10)
	private String dataObito;
	
	@Column(name="emppac",length=20)
	private String empregoPaciente;
	
	@Column(name="endemp",length=70)
	private String enderecoEmprego;
	
	@Column(name="estciv",length=1)
	private String estadoCivil;
	
	@Column(name="instrucao",length=20)
	private String instrucao;
	
	@Column(name="maepac",length=60)
	private String maePaciente;
	
	@Column(name="morfologia",length=10)
	private String morfologia;
	
	@Column(name="natura",length=30)
	private String naturalidade;
	
	@Column(name="nfilhos",length=2)
	private String numeroFilhos;
	
	@Column(name="paipac",length=60)
	private String paipac;
	
	@Column(name="profresp",length=20)
	private String profissaoResponsavel;
	
	@Column(name="propac",length=20)
	private String profissaoPaciente;
	
	@Column(name="relpac",length=20)
	private String religiaoPaciente;
	
	@Column(name="respac",length=60)
	private String responsavelPaciente;
	
	@Column(name="segura",length=60)
	private String segura;
	
	@Column(name="telemp",length=70)
	private String telemp;
	
	@Column(name="tipo",length=10)
	private String tipo;
	
	@Column(name="tipsang",length=3)
	private String tipoSanguinio;
	
	@Column(name="topografia",length=10)
	private String tomografia;
	
	@Column(name="vincul",length=10)
	private String vincul;
	
	@Column(name="empremae",length=10)
	private String empremae;
	
	@Column(name="endempmae",length=60)
	private String endempmae;
	
	@Column(name="fonempmae",length=10)
	private String fonempmae;
	
	@Column(name="profmae",length=10)
	private String profmae;
	
	@Column(name="ctpsma",length=10)
	private String ctpsma;
	
	@Column(name="convmae",length=10)
	private String convmae;
	
	@Column(name="convpai",length=10)
	private String convpai;
	
	@Column(name="fonecont",length=10)
	private String fonecont;
	
	@Column(name="iamcargo",length=50)
	private String iamcargo;
	
	@Column(name="iampadrao",length=50)
	private String iampadrao;
	
	@Column(name="iaminscr",length=50)
	private String iaminscr;
	
	@Column(name="iamrg",length=50)
	private String iamrg;
	
	@Column(name="iamsecr",length=50)
	private String iamsecr;
	
	@Column(name="iamunid",length=50)
	private String iamunid;
	
	@Column(name="iamafin",length=50)
	private String iamafin;
	
	@Column(name="iamcontrib",length=50)
	private String iamcontrib;
	
	@Column(name="peso",length=6)
	private String peso;
	
	@Column(name="altura",length=3)
	private String altura;
	
	@Column(name="endres",length=70)
	private String endres;
	
	@Column(name="telres",length=25)
	private String telres;
	
	@Column(name="dtinativo",length=10)
	private String dtinativo;
	
	@Column(name="emirg",length=10)
	private String emissorRG;
	
	@Column(name="datrg",length=10)
	private String dataRG;
	
	@Column(name="ufnatpac",length=2)
	private String ufNatPac;
		
	//GETTERS
	
	public Integer getId() {
		return id;
	}

	public String getCgcemp() {
		return cgcemp;
	}

	public String getCid() {
		return cid;
	}

	public String getCodemp() {
		return codemp;
	}

	public CadPac getCadPac() {
		return cadPac;
	}

	public String getCondic() {
		return condic;
	}

	public String getConjuguePaciente() {
		return conjuguePaciente;
	}

	public String getCorPaciente() {
		return corPaciente;
	}

	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public String getCtpsPaciente() {
		return ctpsPaciente;
	}

	public String getDivida() {
		return divida;
	}

	public String getDocResponsavel() {
		return docResponsavel;
	}

	public String getDataObito() {
		return dataObito;
	}

	public String getEmpregoPaciente() {
		return empregoPaciente;
	}

	public String getEnderecoEmprego() {
		return enderecoEmprego;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getInstrucao() {
		return instrucao;
	}

	public String getMaePaciente() {
		return maePaciente;
	}

	public String getMorfologia() {
		return morfologia;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public String getNumeroFilhos() {
		return numeroFilhos;
	}

	public String getPaipac() {
		return paipac;
	}

	public String getProfissaoResponsavel() {
		return profissaoResponsavel;
	}

	public String getProfissaoPaciente() {
		return profissaoPaciente;
	}

	public String getReligiaoPaciente() {
		return religiaoPaciente;
	}

	public String getResponsavelPaciente() {
		return responsavelPaciente;
	}

	public String getSegura() {
		return segura;
	}

	public String getTelemp() {
		return telemp;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTipoSanguinio() {
		return tipoSanguinio;
	}

	public String getTomografia() {
		return tomografia;
	}

	public String getVincul() {
		return vincul;
	}

	public String getEmpremae() {
		return empremae;
	}

	public String getFonempmae() {
		return fonempmae;
	}

	public String getProfmae() {
		return profmae;
	}

	public String getCtpsma() {
		return ctpsma;
	}

	public String getConvmae() {
		return convmae;
	}

	public String getConvpai() {
		return convpai;
	}

	public String getFonecont() {
		return fonecont;
	}

	public String getIamcargo() {
		return iamcargo;
	}

	public String getIampadrao() {
		return iampadrao;
	}

	public String getIaminscr() {
		return iaminscr;
	}

	public String getIamsecr() {
		return iamsecr;
	}

	public String getIamunid() {
		return iamunid;
	}

	public String getIamafin() {
		return iamafin;
	}

	public String getIamcontrib() {
		return iamcontrib;
	}

	public String getPeso() {
		return peso;
	}

	public String getAltura() {
		return altura;
	}

	public String getEndres() {
		return endres;
	}

	public String getTelres() {
		return telres;
	}

	public String getDtinativo() {
		return dtinativo;
	}

	public String getEmissorRG() {
		return emissorRG;
	}

	public String getDataRG() {
		return dataRG;
	}

	public String getUfNatPac() {
		return ufNatPac;
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
