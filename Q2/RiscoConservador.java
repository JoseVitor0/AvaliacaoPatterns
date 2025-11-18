package Q2;

class RiscoConservador implements CalculoRisco {
    @Override
    public void calcular(double valorInvestido) {
        System.out.println("Perfil conservador: Analisando segurança e liquidez...");
        System.out.println("Resultado: Risco baixo. Foco em Tesouro Direto e CDBs.");
    }
}
