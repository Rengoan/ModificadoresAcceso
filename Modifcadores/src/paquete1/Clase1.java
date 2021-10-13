package paquete1;

class Clase1 { //Si no se pone public, la clase se queda como default

//    protected String atributoPublico;
//    protected String atributoDefault;
    private String atributoPrivate;

//    protected Clase1() {
//        System.out.println("Imprimiendo desde el constructor vacio protegido de Clase1");
//    }
    private  Clase1() {
        System.out.println("Imprimiendo desde el constructor vacio protegido de Clase1");
    }

//    public Clase1(String arg) {
//        System.out.println("Imprimiendo desde el constructor público con 1 argumento" + arg);
//
//    }
    
    private  Clase1(String arg) {
        System.out.println("Imprimiendo desde el constructor público con 1 argumento" + arg);

    }

//    protected void metodoProtected() {
//        System.out.println("Imprimiendo desde metodo protegidos Clase1");
//    }
    
    private  void metodoPrivate() {
        System.out.println("Imprimiendo desde metodo protegidos Clase1");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    

}
