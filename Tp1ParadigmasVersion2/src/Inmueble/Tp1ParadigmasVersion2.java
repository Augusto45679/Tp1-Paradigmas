package Inmueble;

public class Tp1ParadigmasVersion2 {

        public static void main(String[] args) {
        
            //creamos registro
         Registro  registro1 = new Registro(2223,"San MArtin",33);
         Registro registro2 = new Registro(2234,"Rivadavia",34);  
          //creamos lotes
      Lote lote1 = new Lote(20202,21,"Alvarez 80 ",23); 
      Lote lote2 = new Lote(20200,34,"Rodriguez 20",24);
      //Integer idPadron, int superficie, String domicilio, float avaluoxmt
      Lote lote3 = new Lote(212.2,"alaa",23);
      //creo una escritura
      
      Escritura escritura1 = new Escritura(1, lote1.superficie,lote1.getDomicilio());
      Escritura escritura2 = new Escritura(2,lote2.superficie,lote2.getDomicilio());
            
       registro1.registrar(lote1); 
       registro2.registrar(lote2); 
       registro2.registrar(lote3); 
       
       registro1.emitirBoletos(); 
       registro2.emitirBoletos(); 
      
    }
        
}
