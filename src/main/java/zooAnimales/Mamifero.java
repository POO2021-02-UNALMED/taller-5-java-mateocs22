package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Mamifero> listado;
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.pelaje= pelaje;
		this.patas= patas;
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadMamiferos(){
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos++ ; 
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
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
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
	}
	
	
	

	
}
