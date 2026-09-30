
import java.util.ArrayList;
import java.util.List;

public class CreditoImobiliario extends Credito {

    @Override
    public double calcularJuros() {
        return this.juros = ((0.8 / 100) * this.valorSolicitado);
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("Documentos Exigidos"));
        
        docs.add("Matrícula do Imóvel");
        docs.add("Comprovante de Renda");
        
        return docs;
    }

}
