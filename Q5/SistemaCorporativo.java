package Q5;

public class SistemaCorporativo {
    public static void main(String[] args) {

        LoggerCentral log1 = LoggerCentral.getInstancia();
        log1.registrarLog("O sistema iniciou.");

        LoggerCentral log2 = LoggerCentral.getInstancia();
        log2.registrarLog("Usuário admin logado.");

        if (log1 == log2) {
            System.out.println("\nSucesso: Ambas as variáveis referenciam a mesma instância na memória.");
        } else {
            System.out.println("\nErro: Foram criadas instâncias diferentes.");
        }
    }
}
