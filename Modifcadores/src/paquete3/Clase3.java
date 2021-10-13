package paquete3;

import paquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3(){
        super(); //Para hacer referencia a Clase1
        this.atributoPublico = "Modificamos el atributo protegido";
        System.out.println("Atributo protegido desde la hija"+this.atributoPublico);
        this.metodoProtected();
    }
}
