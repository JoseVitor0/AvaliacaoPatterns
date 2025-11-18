package Q1;
class RelatorioDiario implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("[Diário] Coletando dados das últimas 24 horas");
    }

    @Override
    public void gerar() {
        System.out.println("[Diário] Gerando PDF com métricas de rotina.");
    }
}