package Q2;

class RiscoModerado implements CalculoRisco {
    @Override
    public void calcular(double valorInvestido) {
        System.out.println("[Moderado] Balanceando renda fixa e variável...");
        System.out.println("Resultado: Risco MÉDIO. Carteira híbrida recomendada.");
    }
}
