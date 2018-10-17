
package boletin.pkg3;

public class BOLETIN3 {

    public static void main(String[] args) {

        Consumo consumidor1 = new Consumo();
        consumidor1.setLitros(50f);
        consumidor1.setpGas(1.57f);
        
        Consumo consumidor2 = new Consumo(200f,50f,80f,1.57f);
        
        System.out.println("Consumo Medio:" +consumidor2.consumoMedio());
        
        consumidor2.setLitros(70f);
        
        System.out.println("Velocidad Media:" +consumidor2.getvMed());
        
        
    }
    
}
