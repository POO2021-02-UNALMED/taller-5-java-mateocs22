package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Reptil> listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadReptiles(){
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas++ ;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes++ ;
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

}
