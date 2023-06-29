package paquete04;

public class TransporteTransvia extends Transporte {

    private String ccoperativaTransvia;

    public String obtenerCcoperativaTransvia() {
        return ccoperativaTransvia;
    }

    public void establecerCcoperativaTransvia(String cT) {
        ccoperativaTransvia = cT;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20 + 0.1;
    }

}
