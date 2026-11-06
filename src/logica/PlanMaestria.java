package logica;

import java.util.ArrayList;
import java.util.List;

public class PlanMaestria {
    private int id;
    private ArrayList<CursoPosgrado> cursos;
    private List<Docente> matriculados;

    
    public PlanMaestria(int id) {
        setId(id);
        this.cursos = new ArrayList<>();
        this.matriculados = new ArrayList<>();
    }
    
    
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public List<CursoPosgrado> getCursos() {
        return cursos;
    }
    

    public void setCursos(List<CursoPosgrado> cursos) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public List<Docente> getMatriculados() {
        return matriculados;
    }
    

    public void setMatriculados(List<Docente> matriculados) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public void agregarCurso(CursoPosgrado curso) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public void matricular(Docente docente) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public int calcularCreditosTotales() {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
    

    public boolean puedeDefender(Docente matriculado) {
        //todo
        throw new UnsupportedOperationException("NO IMPLEMENTADO");
    }
}
