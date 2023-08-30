package Inmueble;

public abstract class Edificio {
    protected float avaluoXmtr; 
      public float avaluo;  
      
    public Edificio(float avaluoXmtr, float avaluo ){
        this.avaluoXmtr = avaluoXmtr; 
        this.avaluo = avaluo; 
    }
    //get and set 

    public float getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(float avaluo) {
        this.avaluo = avaluo;
    }
    
    // otros metodos 
    public void valuar(){
        
    }
    public void demoler(){
        
    }
    
    
}
