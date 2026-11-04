
package logica;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private int id;
    private String nombre;
    private ArrayList<Docente> docentes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    public void eliminarDocente(Docente docente) {
        docentes.remove(docente);
    }

    public int calcularPuntaje(int anio) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
}
