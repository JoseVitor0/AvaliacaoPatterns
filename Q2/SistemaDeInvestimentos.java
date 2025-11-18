package Q2;

public class SistemaDeInvestimentos {
    public static void main(String[] args) {
        AnalisadorDeInvestimentos analisador = new AnalisadorDeInvestimentos();
        double valorDoCliente = 10000.00;

        analisador.setEstrategia(new RiscoConservador());
        analisador.realizarAnalise(valorDoCliente);

        analisador.setEstrategia(new RiscoAgressivo());
        analisador.realizarAnalise(valorDoCliente);

        analisador.setEstrategia(new RiscoModerado());
        analisador.realizarAnalise(valorDoCliente);
    }
}
