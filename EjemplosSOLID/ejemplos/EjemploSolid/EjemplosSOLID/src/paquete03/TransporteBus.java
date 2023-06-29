package paquete03;

public class TransporteBus {
    private String cooperativaBus;
    public double tarifa;
    
    public void establecerCooperativaBus(String n){
        cooperativaBus = n;
    }
    
    public void establecerTarifa(){
        tarifa = 2.00 + 0.20;
    }
    
    public String obtenerCooperativaBus(){
        return cooperativaBus;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
