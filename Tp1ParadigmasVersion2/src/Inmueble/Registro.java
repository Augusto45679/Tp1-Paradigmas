package Inmueble;

import java.util.ArrayList;

public class Registro {
    public float coefAvaluoEdificio;
    public String municipio;
    public ArrayList<Lote> inmueble = new ArrayList<>(); //relacion 1..n 
    public ArrayList<Escritura> escritu = new ArrayList<>(); 
    
    private float tasa; 
    
    //metodo constructor

    public Registro(float coefAvaluoEdificio, String municipio, float tasa) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasa = tasa;
    }
    //metodos set and get

    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public void setCoefAvaluoEdificio(float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    // otros metodos
    
    public void valuar(Lote loteo){
        
    }
    public void emitirBoletos(){
        //esto se puedehacer de dos maneras
        
        /*
        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Elemento 1");
        miLista.add("Elemento 2");
        miLista.add("Elemento 3");

        for (int i = 0; i < miLista.size(); i++) {
            String elemento = miLista.get(i);
            System.out.println(elemento);
        }
    }
}
 import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Elemento 1");
        miLista.add("Elemento 2");
        miLista.add("Elemento 3");

        for (String elemento : miLista) {
            System.out.println(elemento);
        }
    }
}       */
 
for(Lote inmueble : inmueble){
    System.out.println("El idPadron es : " + inmueble.getIdPadron()+"\n"+ "Su Avaluo : "+inmueble.getAvaluoxmt() 
    +"\n " +"La superficie es de: "  + inmueble.getSuperficie() +" " +" metros cuadrados"+"\n " + "Tiene domicilio en: " + inmueble.getDomicilio() );
}        
        
    }
    public void registrar(Lote lote){
        inmueble.add(lote); // añado el lote al inmueble
        lote.inscripto = this; // 
        Escritura escritura = new Escritura(lote.idPadron,lote.superficie,lote.toString()); 
            //creo la escritura
        
        
    }
    public void Registro(){
        
    }
   
}
