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
public class Wareline implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// COLUNAS do CADPAC.DBF
	
	@Column(name = "codpac", length = 10, unique = true)
	private String codPac;

	@Column(name = "nompac", length = 60)
	private String nomPac;

	@Column(name = "datnas", length = 10)
	private String datNas;

	@Column(name = "sexpac", length = 1)
	private String sexPac;

	@Column(name = "endpac", length = 100)
	private String endPac;

	@Column(name = "baipac", length = 30)
	private String baiPac;

	@Column(name = "codmun", length = 10)
	private String codMun;

	@Column(name = "ceppac", length = 10)
	private String cepPac;

	@Column(name = "docpac", length = 20)
	private String docPac;

	@Column(name = "cpfpac", length = 20)
	private String cpfPac;

	@Column(name = "pispac", length = 50)
	private String pisPac;

	@Column(name = "telpac", length = 40)
	private String telPac;

	@Column(name = "paspac", length = 1)
	private String pasPac;

	@Column(name = "modulo", length = 1)
	private String modulo;

	@Column(name = "ultate", length = 20)
	private String ultAte;

	@Column(name = "horate", length = 20)
	private String horAte;

	@Column(name = "numpas", length = 11)
	private String numPas;

	@Column(name = "codcon", length = 5)
	private String codCon;

	@Column(name = "usuario", length = 15)
	private String usuario;

	@Column(name = "dtcadast", length = 20)
	private String dtCadast;

	@Column(name = "numresid", length = 15)
	private String numResid;

	@Column(name = "cartaosus", length = 20)
	private String cartaoSus;

	@Column(name = "codbai", length = 15)
	private String codBai;

	@Column(name = "pis", length = 15)
	private String pis;

	@Column(name = "certnasc", length = 15)
	private String certNasc;

	// COLUNAS do CADPA2.DBF

	@Column(name = "cgcemp", length = 15)
	private String cgcEmp;

	@Column(name = "cid", length = 10)
	private String cid;

	@Column(name = "codemp", length = 10)
	private String codEmp;

	@Column(name = "condic", length = 1)
	private String condic;

	@Column(name = "conpac", length = 60)
	private String conPac;

	@Column(name = "corpac", length = 1)
	private String corPac;

	@Column(name = "cpfres", length = 15)
	private String cpfRes;

	@Column(name = "ctpspa", length = 10)
	private String ctpsPa; // carteira de trabalho

	@Column(name = "divida", length = 7)
	private String divida;

	@Column(name = "docres", length = 15)
	private String docRes;

	@Column(name = "dtobito", length = 10)
	private String dtObito;

	@Column(name = "emppac", length = 20)
	private String empPac;

	@Column(name = "endemp", length = 70)
	private String endEmp;

	@Column(name = "estciv", length = 1)
	private String estCiv;

	@Column(name = "instrucao", length = 20)
	private String instrucao;

	@Column(name = "maepac", length = 60)
	private String maePac;

	@Column(name = "morfologia", length = 10)
	private String morfologia;

	@Column(name = "natura", length = 30)
	private String natura;

	@Column(name = "nfilhos", length = 2)
	private String nFilhos;

	@Column(name = "paipac", length = 60)
	private String paiPac;

	@Column(name = "profresp", length = 20)
	private String profResp;

	@Column(name = "propac", length = 20)
	private String proPac;

	@Column(name = "relpac", length = 20)
	private String relPac;

	@Column(name = "respac", length = 60)
	private String resPac;

	@Column(name = "segura", length = 60)
	private String segura;

	@Column(name = "telemp", length = 70)
	private String telEmp;

	@Column(name = "tipo", length = 10)
	private String tipo;

	@Column(name = "tipsang", length = 3)
	private String tipSang;

	@Column(name = "topografia", length = 10)
	private String tomografia;

	@Column(name = "vincul", length = 10)
	private String vincul;

	@Column(name = "empremae", length = 10)
	private String empreMae;

	@Column(name = "endempmae", length = 60)
	private String endEmpMae;

	@Column(name = "fonempmae", length = 10)
	private String fonEmpMae;

	@Column(name = "profmae", length = 10)
	private String profMae;

	@Column(name = "ctpsma", length = 10)
	private String ctpsMa;

	@Column(name = "convmae", length = 10)
	private String convMae;

	@Column(name = "convpai", length = 10)
	private String convPai;

	@Column(name = "fonecont", length = 10)
	private String foneCont;

	@Column(name = "iamcargo", length = 50)
	private String iamCargo;

	@Column(name = "iampadrao", length = 50)
	private String iamPadrao;

	@Column(name = "iaminscr", length = 50)
	private String iamInscr;

	@Column(name = "iamrg", length = 50)
	private String iamRg;

	@Column(name = "iamsecr", length = 50)
	private String iamSecr;

	@Column(name = "iamunid", length = 50)
	private String iamUnid;

	@Column(name = "iamafin", length = 50)
	private String iamAfin;

	@Column(name = "iamcontrib", length = 50)
	private String iamContrib;

	@Column(name = "peso", length = 6)
	private String peso;

	@Column(name = "altura", length = 3)
	private String altura;

	@Column(name = "endres", length = 70)
	private String endRes;

	@Column(name = "telres", length = 25)
	private String telRes;

	@Column(name = "dtinativo", length = 10)
	private String dtInativo;

	@Column(name = "emirg", length = 10)
	private String emiRG;

	@Column(name = "datrg", length = 10)
	private String datRG;

	@Column(name = "ufnatpac", length = 2)
	private String ufNatPac;

	// GETTERS COLUNAS CADPAC.DBF

	public Integer getId() {
		return id;
	}

	public String getCodPac() {
		return codPac;
	}

	public String getNomPac() {
		return nomPac;
	}

	public String getDatNas() {
		return datNas;
	}

	public String getSexPac() {
		return sexPac;
	}

	public String getEndPac() {
		return endPac;
	}

	public String getBaiPac() {
		return baiPac;
	}

	public String getCodMun() {
		return codMun;
	}

	public String getCepPac() {
		return cepPac;
	}

	public String getDocPac() {
		return docPac;
	}

	public String getCpfPac() {
		return cpfPac;
	}

	public String getPisPac() {
		return pisPac;
	}

	public String getTelPac() {
		return telPac;
	}

	public String getPasPac() {
		return pasPac;
	}

	public String getModulo() {
		return modulo;
	}

	public String getUltAte() {
		return ultAte;
	}

	public String getHorAte() {
		return horAte;
	}

	public String getNumPas() {
		return numPas;
	}

	public String getCodCon() {
		return codCon;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getDtCadast() {
		return dtCadast;
	}

	public String getNumResid() {
		return numResid;
	}

	public String getCartaoSus() {
		return cartaoSus;
	}

	public String getCodBai() {
		return codBai;
	}

	public String getPis() {
		return pis;
	}

	public String getCertNasc() {
		return certNasc;
	}

	//GETTERS COLUNAS CADPA2.DBF
	
	public String getCgcEmp() {
		return cgcEmp;
	}

	public String getCid() {
		return cid;
	}

	public String getCodEmp() {
		return codEmp;
	}

	public String getCondic() {
		return condic;
	}

	public String getConPac() {
		return conPac;
	}

	public String getCorPac() {
		return corPac;
	}

	public String getCpfRes() {
		return cpfRes;
	}

	public String getCtpsPa() {
		return ctpsPa;
	}

	public String getDivida() {
		return divida;
	}

	public String getDocRes() {
		return docRes;
	}

	public String getDtObito() {
		return dtObito;
	}

	public String getEmpPac() {
		return empPac;
	}

	public String getEndEmp() {
		return endEmp;
	}

	public String getEstCiv() {
		return estCiv;
	}

	public String getInstrucao() {
		return instrucao;
	}

	public String getMaePac() {
		return maePac;
	}

	public String getMorfologia() {
		return morfologia;
	}

	public String getNatura() {
		return natura;
	}

	public String getnFilhos() {
		return nFilhos;
	}

	public String getPaiPac() {
		return paiPac;
	}

	public String getProfResp() {
		return profResp;
	}

	public String getProPac() {
		return proPac;
	}

	public String getRelPac() {
		return relPac;
	}

	public String getResPac() {
		return resPac;
	}

	public String getSegura() {
		return segura;
	}

	public String getTelEmp() {
		return telEmp;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTipSang() {
		return tipSang;
	}

	public String getTomografia() {
		return tomografia;
	}

	public String getVincul() {
		return vincul;
	}

	public String getEmpreMae() {
		return empreMae;
	}

	public String getEndEmpMae() {
		return endEmpMae;
	}

	public String getFonEmpMae() {
		return fonEmpMae;
	}

	public String getProfMae() {
		return profMae;
	}

	public String getCtpsMa() {
		return ctpsMa;
	}

	public String getConvMae() {
		return convMae;
	}

	public String getConvPai() {
		return convPai;
	}

	public String getFoneCont() {
		return foneCont;
	}

	public String getIamCargo() {
		return iamCargo;
	}

	public String getIamPadrao() {
		return iamPadrao;
	}

	public String getIamInscr() {
		return iamInscr;
	}

	public String getIamRg() {
		return iamRg;
	}

	public String getIamSecr() {
		return iamSecr;
	}

	public String getIamUnid() {
		return iamUnid;
	}

	public String getIamAfin() {
		return iamAfin;
	}

	public String getIamContrib() {
		return iamContrib;
	}

	public String getPeso() {
		return peso;
	}

	public String getAltura() {
		return altura;
	}

	public String getEndRes() {
		return endRes;
	}

	public String getTelRes() {
		return telRes;
	}

	public String getDtInativo() {
		return dtInativo;
	}

	public String getEmiRG() {
		return emiRG;
	}

	public String getDatRG() {
		return datRG;
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
