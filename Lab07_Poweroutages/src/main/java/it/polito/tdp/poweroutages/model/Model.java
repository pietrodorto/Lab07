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

	
	public List<PowerOutages> getWorstCase(int years , int x, Nerc y){
		
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
	
	public long getOreDisservizioTot(List<PowerOutages> parziale) {
		
		long totore = 0;
		
		for (PowerOutages po : parziale) {
			
			totore =+ po.getDurataguasto();
		}
		return totore;
	}
	
	public boolean checkYears(int x , List<PowerOutages> parziale) {
		
		List<PowerOutages> parzialetemp = parziale.sort(c);
		
	}
	
	public boolean checkHours(List<PowerOutages> parziale, int y) {
		
		long totore = 0;
				
				for (PowerOutages po : parziale) {
					
					totore =+ po.getDurataguasto();
				}
				
	}
	
	
	public int getCustomersAffectedTot(List<PowerOutages> parziale) {
		
	int totcustomers = 0;
		
		for (PowerOutages po : parziale) {
			
			totcustomers =+ po.getCustomers_affected();
		}
		return totcustomers;
		
	}
}
