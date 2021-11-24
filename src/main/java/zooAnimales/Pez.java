package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Pez> listado = new ArrayList<Pez>();
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadPeces(){
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
		return "nadar";
	}
	
	static public Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++ ;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		
	}
	
	static public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++ ;
		return new Pez(nombre, edad, "oceano", genero, "gris", 1);
		
	}
	
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	
	public ArrayList<Pez> getListado(){
		return Pez.listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
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
