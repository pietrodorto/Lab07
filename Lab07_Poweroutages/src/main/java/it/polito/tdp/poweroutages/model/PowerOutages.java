package it.polito.tdp.poweroutages.model;

import java.time.LocalDateTime;
import java.util.Date;

public class PowerOutages {
	int id;
	int event_type_id;
	int area_id;
	int nerc_id;
	int customers_affected;
	LocalDateTime data_event_began;
	LocalDateTime data_event_finished;
	
	
	
	public PowerOutages(int id, int event_type_id, int area_id, int nerc_id, int customers_affected,
			LocalDateTime data_event_began, LocalDateTime data_event_finished) {
		super();
		this.id = id;
		this.event_type_id = event_type_id;
		this.area_id = area_id;
		this.nerc_id = nerc_id;
		this.customers_affected = customers_affected;
		this.data_event_began = data_event_began;
		this.data_event_finished = data_event_finished;
		
		int durataguasto;
		
		durataguasto = LocalDateTime.
		
		int year = data_event_began.getYear();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEvent_type_id() {
		return event_type_id;
	}
	public void setEvent_type_id(int event_type_id) {
		this.event_type_id = event_type_id;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public int getNerc_id() {
		return nerc_id;
	}
	public void setNerc_id(int nerc_id) {
		this.nerc_id = nerc_id;
	}
	public int getCustomers_affected() {
		return customers_affected;
	}
	public void setCustomers_affected(int customers_affected) {
		this.customers_affected = customers_affected;
	}
	public Date getData_event_began() {
		return data_event_began;
	}
	public void setData_event_began(Date data_event_began) {
		this.data_event_began = data_event_began;
	}
	public Date getData_event_finished() {
		return data_event_finished;
	}
	public void setData_event_finished(Date data_event_finished) {
		this.data_event_finished = data_event_finished;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PowerOutages other = (PowerOutages) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
