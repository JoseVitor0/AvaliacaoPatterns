package Q1;
class FabricaRelatorioEmergencial implements FabricaDeRelatorios {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}
