package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	String nombre;
	Zoologico zoo;
	ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		//nombre= "ola";
		//zoo= null;
		
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();	
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;	
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public ArrayList<Animal> getAnimales(){
		return this.animales;
		
	}

}
