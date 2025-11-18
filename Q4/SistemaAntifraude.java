package Q4;

public class SistemaAntifraude {
    public static void main(String[] args) {
        VerificadorAntifraude v1_Valor = new AnaliseDeValor();
        VerificadorAntifraude v2_Local = new AnaliseGeolocalizacao();
        VerificadorAntifraude v3_Hist = new AnaliseHistorico();

        v1_Valor.setProximo(v2_Local);
        v2_Local.setProximo(v3_Hist);

        System.out.println("Teste 1: Transação Válida");
        Transacao t1 = new Transacao(500, "Brasil", false);
        v1_Valor.verificar(t1);

        System.out.println("\nTeste 2: Transação Suspeita (Localização)");
        Transacao t2 = new Transacao(500, "Exterior", false);
        v1_Valor.verificar(t2);
    }
}
