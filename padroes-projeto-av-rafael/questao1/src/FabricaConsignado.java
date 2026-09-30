public class FabricaConsignado extends FabricaCredito {

    @Override
    public Credito criadorCredito() {
        return new CreditoConsignado();
    }

}
