package it.polito.tdp.poweroutages.model;

import java.util.*;

import it.polito.tdp.poweroutages.DAO.PowerOutageDAO;

public class Model {
	
	PowerOutageDAO podao;
	List<PowerOutages> result;
	
	public Model() {
		podao = new PowerOutageDAO();
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList();
	}

	
	public List<PowerOutages> getWorstCase(int years , int hours, Nerc nerc){
		
		this.result = new ArrayList<PowerOutages>();
		
		
		
		return result;
	}
	
	public void recursive(List<PowerOutages> parziale, int level) {
		
		//casi terminali
		/*
		 * differenza tra anno più recente e anno più vecchio > X
		 * Ore disservizio totale > Y
		 */
		
		//caso intermedio
		
		//backtracking
		
	}
	
	public int getOreDisservizioTot(List<PowerOutages> parziale) {
	
	}
	
	public int controlloAnni() {
		
	}
	
	public int getCustomersAffectedTot() {
		
	}
}
