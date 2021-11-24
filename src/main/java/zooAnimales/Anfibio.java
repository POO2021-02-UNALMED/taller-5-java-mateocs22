package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Anfibio> listado;
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadAnfibios(){
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++ ;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.ranas++ ;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorEscamas() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}

	

}
