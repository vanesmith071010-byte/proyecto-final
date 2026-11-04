package logica;

import java.util.ArrayList;
import java.util.List;

public class CursoPosgrado {
	private int id;
	private String tema;
	private String objetivos;
	private int creditos;
	private int anio;
	private Docente responsable;
	private ArrayList<InscripcionCurso> inscripciones;
	
	public int getId(){
		return id;
	}
	
	
	public void setId(int id){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public String getTema(){
		return tema;
	}
	
	
	public void setTema(String tema){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public String getObjetivos(){
		return objetivos;
	}
	
	
	public void setObjetivos(String objetivos){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public int getCreditos(){
		return creditos;
	}
	
	
	public void setCreditos(int creditos){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public int getAnio(){
		return anio;
	}
	
	
	public void setAnio(int Anio){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public Docente getResponsable(){
		return responsable;
	}
	
	
	public void setResponsable(Docente responsable){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public List<InscripcionCurso> getInscripciones(){
		return inscripciones;
	}
	
	
	public void setInscripciones(InscripcionCurso inscripcion){
		//todo Validar
		inscripciones.add(inscripcion);
	}
	
	
	public void inscribir(Docente docente){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
	
	
	public void asignarNota(Docente docente, double nota){
		//todo
		throw new UnsupportedOperationException("NO IMPLEMENTADO");
	}
}
