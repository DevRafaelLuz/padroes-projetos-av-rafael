import java.util.List;

public abstract class Credito {
    protected double juros;
    protected double valorSolicitado;

    public abstract double calcularJuros();
    public abstract List<String> listarDocumentos();
}
