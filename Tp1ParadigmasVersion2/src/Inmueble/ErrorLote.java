package Inmueble;

public class ErrorLote extends Exception( ){

//msg no podes asignar mas de un edificio a un lote 

 public ErrorLote(String msg){
 System.out.println(msg); 

 
 }
}