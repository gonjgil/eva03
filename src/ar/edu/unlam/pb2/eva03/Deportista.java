package ar.edu.unlam.pb2.eva03;

public abstract class Deportista implements Comparable<Deportista>{
    
    private Integer numeroDeSocio;
    private String nombre;

    public Deportista(Integer numeroDeSocio, String nombre) {
	this.numeroDeSocio = numeroDeSocio;
	this.nombre = nombre;
    }

    public Integer getNumeroDeSocio() {
	return numeroDeSocio;
    }
    
    public int compareTo(Deportista deportista) {
	return this.getNumeroDeSocio().compareTo(deportista.getNumeroDeSocio());
    }
    
}
