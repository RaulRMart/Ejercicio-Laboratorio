import java.util.ArrayList;

public class Laboratorio{
    ArrayList<Alumno> listaAlumnos;
    
    public Laboratorio(){
        listaAlumnos = new ArrayList<Alumno>();
    }
    
    public void darAlta(String nombre, int clave){
        Alumno nuevoAlumno= new Alumno(nombre,clave);
        listaAlumnos.add(nuevoAlumno);
    }
    
    public boolean darBaja(int clave){
        for(int i = 0; i < listaAlumnos.size(); i++){
            if(listaAlumnos.get(i).dimeClave() == clave){
                listaAlumnos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void imprimirLista(){
        for(int i = 0; i < listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i));
        }
    }
}