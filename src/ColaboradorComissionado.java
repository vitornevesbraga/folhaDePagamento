
public class ColaboradorComissionado extends Colaborador{
    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(int matricula, String nome) {
        super(matricula, nome);
    }


    public double calcularComissao(){
        return valorVendas * percentualComissao / 100;
    }

    public double calcularSalarioFinal(){
        return getSalarioBase() + calcularComissao();
    }
}
