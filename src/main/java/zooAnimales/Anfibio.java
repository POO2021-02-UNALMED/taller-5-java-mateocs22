package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadAnfibios(){
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	@Override
	public String toString() {
		String cadena = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat  + " y mi genero es " + genero;
	    if (zona != null) {
	    	cadena = cadena + ", la zona en la que me ubico es " + zona + ", en el" + zona.getZoo().getNombre();
	    	return cadena;
	    }else {
	    	return cadena;
	    }
	}
	
	static public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++ ;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		
	}
	
	static public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++ ;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		
	}
	
	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	public ArrayList<Anfibio> getListado(){
		return Anfibio.listado;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;	
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		if (genero.equals("F") || genero.equals("M")) {
			this.genero = genero;
		}else {
			
		}
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return zona;
	}

	

}
