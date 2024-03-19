package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	
	public Zoologico (String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico(){
		
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for (Zona zonas : zonas) {
			totalAnimales += zonas.cantidadAnimales();
		}
		return totalAnimales;
	}
	
	
	
	public String getNombre () {
		return this.nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion () {
		return this.ubicacion;
	}
	public void setUbicacion (String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList <Zona> getZona () {
		return this.zonas;
	}
	public void setZonas (ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}