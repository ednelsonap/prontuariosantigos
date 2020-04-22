package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HomeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String acessarWarelineAntiga(){
		System.out.println("Acessando cadastro Wareline Antiga");
		return "cadpac?faces-redirect=true";
	}
	
	public String acessarSandor(){
		System.out.println("Acessando cadastro Sandor");
		return "sandor?faces-redirect=true";
	}

}
