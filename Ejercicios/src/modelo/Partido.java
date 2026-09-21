package modelo;

import java.io.Serializable;

public class Partido implements Serializable{

	private String equipoLoc;
	private String equipoVis;
	private int golesLoc;
	private int golesVis;
	private String lugar;
	private String fecha;
	
	
	public Partido(String equipoLoc, String equipoVis, int golesLoc, int golesVis, String lugar, String fecha) {
		
		this.equipoLoc = equipoLoc;
		this.equipoVis = equipoVis;
		this.golesLoc = golesLoc;
		this.golesVis = golesVis;
		this.lugar = lugar;
		this.fecha = fecha;
	}


	public String getEquipoLoc() {
		return equipoLoc;
	}


	public void setEquipoLoc(String equipoLoc) {
		this.equipoLoc = equipoLoc;
	}


	public String getEquipoVis() {
		return equipoVis;
	}


	public void setEquipoVis(String equipoVis) {
		this.equipoVis = equipoVis;
	}


	public int getGolesLoc() {
		return golesLoc;
	}


	public void setGolesLoc(int golesLoc) {
		this.golesLoc = golesLoc;
	}


	public int getGolesVis() {
		return golesVis;
	}


	public void setGolesVis(int golesVis) {
		this.golesVis = golesVis;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
