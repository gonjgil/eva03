package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador {

    private String estiloPreferido;
    
    public Nadador(Integer numeroDeSocio, String nombre, String estilo) {
	super(numeroDeSocio, nombre);	
	this.estiloPreferido = estilo;
    }
    
    public String getEstiloPreferido() {
	return estiloPreferido;
    }
    
}
