package br.com.spdm.prontuariosantigos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Ambulatorial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column(name="campo01", length = 8)
	private Integer numatend;
	
	@Column(name="campo02", length = 6)
	private String campo02;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@Column(name="campo03")
	private Especialidade especialidade;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@Column(name="campo04", length = 10)
	private Wareline wareline;
	
	@Column(name="campo05", length = 40)
	private String nomPac;
	
	@Column(name="campo06", length = 10)
	private String dtAtend;
	
	@Column(name="campo07", length = 10)
	private String campo07;
	
	@Column(name="campo08", length = 6)
	private String campo08;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@Column(name="campo09", length = 6)
	private Prestador prestador;
	
	@Column(name="campo10", length = 6)
	private String campo10;
	
	@Column(name="campo11", length = 2)
	private String campo11;
	
	@Column(name="campo12", length = 20)
	private String horaAtend;
	
	@Column(name="campo13", length = 1)
	private String campo13;
	
	@Column(name="campo14", length = 4)
	private String campo14;
	
	@Column(name="campo15", length = 6)
	private String campo15;
	
	@Column(name="campo16", length = 2)
	private String campo16;
	
	@Column(name="campo17", length = 10)
	private String campo17;
	
	@Column(name="campo18", length = 50)
	private String campo18;
	
	@Column(name="campo19", length = 11)
	private String campo19;
	
	@Column(name="campo20", length = 50)
	private String campo20;
	
	@Column(name="campo21", length = 6)
	private String campo21;
	
	@Column(name="codbai", length = 2)
	private String codBai;
	
	@Column(name="codenc", length = 2)
	private String codEnc;
	
	@Column(name="codubs", length = 7)
	private String codUbs;
	
	@Column(name="gravou", length = 1)
	private String gravou;
	
	@Column(name="codconv", length = 3)
	private String codConv;
	
	@Column(name="pgprof", length = 1)
	private String pgProf;
	
	@Column(name="guia", length = 12)
	private String guia;
	
	@Column(name="tipfaa", length = 1)
	private String tipFaa;
	
	@Column(name="plano", length = 2)
	private String plano;
	
	@Column(name="datault", length = 50)
	private String dataUlt;
	
	@Column(name="horault", length = 5)
	private String hotaUlt;
	
	@Column(name="tipoult", length = 2)
	private String tipoUlt;
	
	@Column(name="esp1", length = 2)
	private String esp1;
	
	@Column(name="esp2", length = 2)
	private String esp2;
	
	@Column(name="esp3", length = 2)
	private String esp3;
	
	@Column(name="esp4", length = 2)
	private String esp4;
	
	@Column(name="esp5", length = 2)
	private String esp5;
	
	@Column(name="esp6", length = 2)
	private String esp6;
	
	@Column(name="esp7", length = 2)
	private String esp7;
	
	@Column(name="esp8", length = 2)
	private String esp8;
	
	@Column(name="esp9", length = 2)
	private String esp9;
	
	@Column(name="esp10", length = 2)
	private String esp10;
	
	@Column(name="unidreq", length = 6)
	private String unidReq;
	
	@Column(name="crmreq", length = 6)
	private String crmReq;
	
	@Column(name="datvalcar", length = 50)
	private String datValCar;
	
	@Column(name="datultpgt", length = 50)
	private String datUltPgt;
	
	@Column(name="faixa", length = 2)
	private String faixa;
	
	@Column(name="crmax", length = 6)
	private String crmAx;
	
	@Column(name="crman", length = 6)
	private String crmAn;
	
	@Column(name="usudig", length = 11)
	private String usuDig;
	
	@Column(name="caucao", length = 50)
	private String caucao;
	
	@Column(name="locatend", length = 2)
	private String locAtend;
	
	@Column(name="obs", length = 255)
	private String obs;
	
	@Column(name="horasai", length = 5)
	private String horaSai;
	
	@Column(name="datasai", length = 50)
	private String dataSai;
	
	@Column(name="valormat", length = 50)
	private String valorMat;
	
}
