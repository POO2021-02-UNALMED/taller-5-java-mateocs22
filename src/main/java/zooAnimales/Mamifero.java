package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.pelaje= pelaje;
		this.patas= patas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadMamiferos(){
		return listado.size()  ;
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
	
	static public Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++ ; 
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
		
	}
	
	static public Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
		
	}
	
	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	public ArrayList<Mamifero> getListado(){
		return Mamifero.listado;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
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
