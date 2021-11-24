package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Pez> listado;
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadPeces(){
		return listado.size();
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

}
