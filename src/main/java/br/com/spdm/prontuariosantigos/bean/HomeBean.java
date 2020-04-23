package br.com.spdm.prontuariosantigos.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HomeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String acessarWarelineDOS(){
		System.out.println("Acessando cadastro Wareline Antiga");
		return "cadpa2?faces-redirect=true";
	}
	
	public String acessarSandor(){
		System.out.println("Acessando cadastro Sandor");
		return "sandor?faces-redirect=true";
	}

}
