package Q1;

public class SistemaLogistica {

    public static void main(String[] args) {
        FabricaDeRelatorios fabricaDiaria = new FabricaRelatoriosDiarios();
        processarRelatorio(fabricaDiaria);

        FabricaDeRelatorios fabricaEmergencia = new FabricaRelatorioEmergencial();
        processarRelatorio(fabricaEmergencia);
    }

    public static void processarRelatorio(FabricaDeRelatorios fabrica) {
        Relatorio relatorio = fabrica.criarRelatorio();
        relatorio.prepararDados();
        relatorio.gerar();
    }
}