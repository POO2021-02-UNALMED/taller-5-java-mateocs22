package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadReptiles(){
		return listado.size() + 1;
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
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	static public Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++ ;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		
	}
	
	static public Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++ ;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		
	}
	
	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public ArrayList<Reptil> getListado(){
		return Reptil.listado;
	}
	
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return largoCola;
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
