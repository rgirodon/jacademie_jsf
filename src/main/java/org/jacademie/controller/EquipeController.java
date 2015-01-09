package org.jacademie.controller;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.jacademie.domain.Equipe;


@ManagedBean
@RequestScoped
public class EquipeController {

	private Integer equipeId;
	
	private Equipe equipe;
	
	private Map<Integer, Equipe> equipes;

	public EquipeController() {
		super();
		
		this.equipes = new HashMap<Integer, Equipe>();
		this.equipes.put(1, new Equipe("Paris SG", "Blue, Red"));
		this.equipes.put(2, new Equipe("Olympique de Marseille", "White, Blue"));
		this.equipes.put(3, new Equipe("Olympique Lyonnais", "White, Blue, Red"));
		this.equipes.put(4, new Equipe("AS St-Etienne", "Green, White"));
	}

	public void findEquipe() {
		
		if (this.equipeId != null) {
		
			this.equipe = this.equipes.get(this.equipeId);
		}
		
		if (this.equipe == null) {
			
			this.equipe = new Equipe("Unknown", "No colors");
		}
	}
	
	public Integer getEquipeId() {
		return equipeId;
	}

	public void setEquipeId(Integer equipeId) {
		this.equipeId = equipeId;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
}
