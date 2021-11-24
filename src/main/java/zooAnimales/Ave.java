package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Ave> listado = new ArrayList<Ave>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorPlumas = colorPlumas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadAves(){
		return listado.size() ;
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
		return "volar";
	}
	
	static public Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++ ;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		
	}
	
	static public Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		
	}
	
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	
	public ArrayList<Ave> getListado(){
		return Ave.listado;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
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
