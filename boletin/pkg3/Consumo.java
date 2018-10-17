package boletin.pkg3;

public class Consumo {
    
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
     public Consumo(){
    
    }
 
    public Consumo(float km, float litros,float vMed,float pGas){
        this.km= km ;
        this.litros= litros ;
        this.vMed= vMed ;
        this.pGas= pGas;
    }
    
    public float getTiempo(){
    float tiempo=(km/vMed);
    return tiempo;
    }
    
    public float consumoMedio(){
    float cantidadlitros= ((litros/km)*100);
    return cantidadlitros;
    }
    
    public float consumoEuros(){
    float euros=  (this.consumoMedio()*pGas);
    return euros;
    }
    
    public float getvMed(){
    return vMed;
    }
    
    
    public void setKms(float kmts){ 
    km= kmts;
    }
   
    public void setLitros(float lts){ 
    litros= lts;
    }
    
    public void setvMed(float v){ 
    vMed= v;
    }
    
    public void setpGas(float pvp){ 
    pGas= pvp;
    }
       
}
