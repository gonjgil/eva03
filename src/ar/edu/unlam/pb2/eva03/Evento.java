package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInsripcion) {
	    this.tipo = tipo;
	    this.numeroDeInscripcion = numeroDeInsripcion;
	    this.participantes = new TreeMap<Integer, Deportista>();
	}
	    
}
