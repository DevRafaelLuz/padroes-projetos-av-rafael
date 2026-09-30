

public class Cliente {
    public static void main(String[] args) throws Exception {
        FabricaCredito criadorPessoal = new FabricaPessoal();
        Credito pessoal = criadorPessoal.criadorCredito();
        pessoal.juros = 100;
        pessoal.valorSolicitado = 50;
        pessoal.calcularJuros();
        System.out.println(pessoal.juros);
        System.out.println(pessoal.listarDocumentos());

        FabricaCredito criadorImobiliario = new FabricaImobiliario();
        Credito imobiliario = criadorImobiliario.criadorCredito();
        imobiliario.juros = 200;
        imobiliario.valorSolicitado = 20;
        imobiliario.calcularJuros();
        System.out.println(imobiliario.juros);
        System.out.println(imobiliario.listarDocumentos());

        FabricaCredito criadorConsignado = new FabricaConsignado();
        Credito consignado = criadorConsignado.criadorCredito();
        consignado.juros = 150;
        consignado.valorSolicitado = 30;
        consignado.calcularJuros();
        System.out.println(consignado.juros);
        System.out.println(consignado.listarDocumentos());
    }
}
