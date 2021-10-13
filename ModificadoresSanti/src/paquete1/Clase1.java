
package paquete1;


class Clase1 {
    
    String atributoDefault;
    
    Clase1(){
        System.out.println("Imprimiendo desde constructor vacio de la Clase1 default");
    }
    
    public Clase1(String arg){
        System.out.println("Imprimiendo desde el cons. default con 1 arg. " + arg);
    }
    
    void metodoDefault(){
        System.out.println("Imprimiendo desde el método default");
    }
    
}
