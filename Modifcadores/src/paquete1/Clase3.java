package paquete1;

import paquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3() {
        super(); //Invocamos al contructor vacio de la Clase Padre
        //Modificamos directamente el atributo protegido de la Clase Padre
        this.atributoPrivate = "Modificamos el atributo privado";
        System.out.println("Atributo privado desde la hija" + this.atributoPrivate);
        //Accdemos con this al metodo protegido de la Clase Padre
        this.metodoPrivate();
    }
}
