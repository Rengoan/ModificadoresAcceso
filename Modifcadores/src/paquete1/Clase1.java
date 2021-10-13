package paquete1;

public class Clase1 {

    protected String atributoPublico;

    protected Clase1() {
        System.out.println("Imprimiendo desde el constructor vacio protegido de Clase1");
    }
    
    public Clase1(String arg){
        System.out.println("Imprimiendo desde el constructor público con 1 argumento" +arg);
        
    }
    
    protected void metodoProtected(){
        System.out.println("Imprimiendo desde metodo protegidos Clase1");
    }
    

}
