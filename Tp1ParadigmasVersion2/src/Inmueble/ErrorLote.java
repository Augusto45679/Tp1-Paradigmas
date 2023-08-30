package Inmueble;

public class ErrorLote extends Exception( ){

//msg no podes asignar mas de un edificio a un lote 

 public ErrorLote(){
    super("No se puede asignar mas de un edificio a un lote");

 }
}