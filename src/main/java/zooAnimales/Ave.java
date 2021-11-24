package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal {
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	static private ArrayList<Ave> listado;
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero= genero;
		this.colorPlumas = colorPlumas;
		listado.add(this);
		Animal.setTotalAnimale(Animal.getTotalAnimales() + 1);
	}
	
	static public int cantidadAves(){
		return listado.size();
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

}
