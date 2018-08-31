public class Alumno{
    private String nombre;
    private int clave;
    
    public Alumno(String nomb, int clave){
        nombre = nomb;
        this.clave = clave;
    }
    
    public int dimeClave(){
        return clave;
    }
    
    public String toString(){
        String alumno = "Nombre: " + nombre + ", Clave: " + clave;
        return alumno;
    }
}