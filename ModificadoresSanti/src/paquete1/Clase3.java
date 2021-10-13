package paquete1;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    
    public Clase3(){
        super(); // Invocamos al constructor vacío de la Clase Padre
        // Modificamos directamente el atributoDefault de la Padre
        this.atributoDefault = "Modificamos el atributo default";
        System.out.println("Atributo default desde la hija " + 
                this.atributoDefault);
        // Accediendo con this al método default de la Padre
        this.metodoDefault();
    }
}
