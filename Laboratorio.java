import java.util.ArrayList;

public class Laboratorio{
    ArrayList<Alumno> listaAlumnos;
    Alumno alum;
    
    public Laboratorio(){
        listaAlumnos = new ArrayList<Alumno>();
    }
    
    public void darAlta(){
        listaAlumnos.add(alum);
    }
    
    public boolean darBaja(int clave){
        for(int i = 0; i < listaAlumnos.size(); i++){
            if(listaAlumnos.get(i).dimeClave() == clave){
                listaAlumnos.remove(i);
            }
        }
        
        return false;
    }
}