public class FabricaImobiliario extends FabricaCredito {

    @Override
    public Credito criadorCredito() {
        return new CreditoImobiliario();
    }

}
