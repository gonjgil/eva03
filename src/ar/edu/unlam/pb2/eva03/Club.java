package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.excepciones.NoEstaPreparado;

public class Club {

    private String nombre;
    private Set<Deportista> socios;
    private Map<String, Evento> competencias;

    public Club(String nombre) {
	this.nombre = nombre;
	this.socios = new TreeSet<Deportista>();
	this.competencias = new HashMap<String, Evento>();
    }

    public Boolean agregarDeportista(Deportista deportista) {
	return socios.add(deportista);
    }

    public Integer getCantidadSocios() {
	return this.socios.size();
    }

    public void crearEvento(TipoDeEvento tipoDeEvento, String nombreDeEvento) {
	Evento evento = new Evento(tipoDeEvento, competencias.size()+1);
	competencias.put(nombreDeEvento, evento);
    }

    public Evento buscarEvento(String nombre) {
	return competencias.get(nombre);
    }
    
    public Boolean inscribirEnEvento(String string, Deportista deportista) throws NoEstaPreparado {
//	if(deportista instanceof Inadador)buscarEvento(string);
	return false; 
    }
    
}
