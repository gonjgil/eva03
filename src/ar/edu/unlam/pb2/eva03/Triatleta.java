package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICorredor, INadador, ICiclista {

    private String distanciaPreferida;
    private String estiloPreferido;
    private TipoDeBicicleta tipoDeBicicleta;
    private Integer cantidadDeKilometrosEntrenados;
    
    public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta  tipoDeBicicleta) {
	super(numeroDeSocio, nombre);
	this.distanciaPreferida = distanciaPreferida;
	this.tipoDeBicicleta = tipoDeBicicleta;
    }

    @Override
    public void setCantidadDeKilometrosEntrenados(Integer km) {
	this.cantidadDeKilometrosEntrenados = km;
    }

    public String getDistanciaPreferida() {
	return distanciaPreferida;
    }
    
    @Override
    public Integer getCantidadDeKilometrosEntrenados() {
	return cantidadDeKilometrosEntrenados;
    }

    public String getEstiloPreferido() {
	return estiloPreferido;
    }
    
    public TipoDeBicicleta getTipoDeBicicleta() {
        return tipoDeBicicleta;
    }

}
