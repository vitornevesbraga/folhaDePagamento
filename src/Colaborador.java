public class Colaborador {
    private final int matricula;
    private final String nome;
    private final double salarioBase;

    double SALARIO_BASE = 2000;
    public Colaborador(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SALARIO_BASE;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double calcularSalarioFinal(){
        return salarioBase;
    }

    public void exibirDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salarioBase);
    }
}
