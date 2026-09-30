
import java.util.ArrayList;
import java.util.List;

public class CreditoConsignado extends Credito {

    @Override
    public double calcularJuros() {
        return this.juros = ((1.8 / 100) * this.valorSolicitado);
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("Documentos Exigidos"));
        
        docs.add("Contracheque");
        docs.add("Extrato de Benefício");
        
        return docs;
    }

}
