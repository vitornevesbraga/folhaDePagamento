public class ColaboradorProducao extends Colaborador{
    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(int matricula, String nome) {
        super(matricula, nome);
    }

    public double calcularProdutividade(){
        return quantidadePecas * valorPorPeca;
    }

    public double calcularSalarioFinal(){
        return getSalarioBase() + calcularProdutividade();
    }
}
