package org.jacademie.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jacademie.domain.Equipe;


@ManagedBean
@SessionScoped
public class MyController {

	private Collection<Equipe> equipes;

	public MyController() {
		
		equipes = new ArrayList<Equipe>();
		equipes.add(new Equipe("Paris SG", "Blue, Red"));
		equipes.add(new Equipe("Olympique de Marseille", "White, Blue"));
		equipes.add(new Equipe("Olympique Lyonnais", "White, Blue, Red"));
		equipes.add(new Equipe("AS St-Etienne", "Green, White"));
	}
	
	
	public boolean getDisplayHelloWorld() {

		Random rdm = new Random();
		int rdmNumber = rdm.nextInt(1000);
		
		return (rdmNumber%2 == 0);
	}

	public Collection<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}
}
