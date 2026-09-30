public class FabricaPessoal extends FabricaCredito {

    @Override
    public Credito criadorCredito() {
        return new CreditoPessoal();
    }

}
