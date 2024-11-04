package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
    
    private Integer distanciaPreferida;
    private Integer cantidadDeKilometrosEntrenados;
    
    public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
	super(numeroDeSocio, nombre);
	this.distanciaPreferida = distanciaPreferida;
    }

    @Override
    public void setCantidadDeKilometrosEntrenados(Integer km) {
	this.cantidadDeKilometrosEntrenados = km;
    }

    public Integer getDistanciaPreferida() {
	return distanciaPreferida;
    }
    
    @Override
    public Integer getCantidadDeKilometrosEntrenados() {
	return cantidadDeKilometrosEntrenados;
    }

}
