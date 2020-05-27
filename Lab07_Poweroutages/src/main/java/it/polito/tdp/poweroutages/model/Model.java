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
		
		recursive()
		
		return result;
	}
	
	public void recursive(List<PowerOutages> parziale, int level) {
		
		//casi terminali
		/*
		 * differenza tra anno più recente e anno più vecchio > X
		 * Ore disservizio totale > Y
		 */
		
		if()
		
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
		
		int diff = 0;
				
				if(parziale.size() > 1) {
					
					int primo = parziale.get(0).getYear();
					int ultimo = parziale.get(parziale.size() - 1).getYear();
					
					diff = ultimo - primo + 1;
					
					if(diff>x){
						
					return false;
					
					}
				}
	
				return true;
	}
	
	public boolean checkHours(List<PowerOutages> parziale, int y) {
		
			long totore = getOreDisservizioTot(parziale);
			
			if(totore>y) {
				return false;
			}
			
			return true;
	}
	
	
	public int getCustomersAffectedTot(List<PowerOutages> parziale) {
		
	int totcustomers = 0;
		
		for (PowerOutages po : parziale) {
			
			totcustomers =+ po.getCustomers_affected();
		}
		return totcustomers;
		
	}
}
