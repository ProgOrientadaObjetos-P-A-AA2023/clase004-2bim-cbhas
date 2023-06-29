package paquete03;

public class TransporteTransVia {
    
    private String cooperativaViaTransvia;
    public double tarifa;
    
    public void establecerCooperativaTransvia(String cVT) {
        cooperativaViaTransvia = cVT;
    }
    
    public void establecerTarifa() {
        tarifa = 20 + 10;
    }
    
    public String obtenerCooperativaTransvia() {
        return cooperativaViaTransvia;
    }
    
    public double obtenerTarifa() {
        return tarifa;
    }
    
}
