package Inmueble;

public class Escritura {
    public Integer numero;
    public int superficie; 
    private String domicilio;
    
    //metodo constructor
    public Escritura(Integer numero, int superficie,String domicilio){
     this.domicilio = domicilio; 
     this.numero = numero; 
     this.superficie = superficie;
    }
    
}
