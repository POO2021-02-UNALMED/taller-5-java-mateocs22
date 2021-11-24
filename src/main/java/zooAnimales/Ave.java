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
	
	public void crearHalcon(String nombre, int edad, String genero) {
		new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones++ ;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas++;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}
