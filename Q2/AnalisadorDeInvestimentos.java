package Q2;

class AnalisadorDeInvestimentos {
    private CalculoRisco estrategiaDeCalculo;

    public void setEstrategia(CalculoRisco novaEstrategia) {
        this.estrategiaDeCalculo = novaEstrategia;
    }

    public void realizarAnalise(double valor) {
        if (estrategiaDeCalculo == null) {
            System.out.println("Nenhuma estratégia definida!");
            return;
        }
        estrategiaDeCalculo.calcular(valor);
        System.out.println("*Calculando valor");
    }
}
