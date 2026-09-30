
import java.util.ArrayList;
import java.util.List;

public class CreditoPessoal extends Credito {

    @Override
    public double calcularJuros() {
        return this.juros = ((3.5 / 100) * this.valorSolicitado);
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("Documentos Exigidos"));
        
        docs.add("Documento de Identidade");
        docs.add("Comprovante de Renda");
        
        return docs;
    }

}
