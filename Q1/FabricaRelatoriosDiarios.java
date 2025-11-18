package Q1;
class FabricaRelatoriosDiarios implements FabricaDeRelatorios {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}
