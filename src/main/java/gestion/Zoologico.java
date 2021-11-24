package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		zona.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int a = 0;
		for (int i = 0; i < zonas.size(); i++) {
			a = a + zonas.get(i).cantidadAnimales();
		}
		return a;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;	
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public ArrayList<Zona> getZonas(){
		return this.zonas;
	}

}
