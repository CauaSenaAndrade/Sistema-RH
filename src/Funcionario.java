public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void aplicarAumento(double valor) {
        this.salario = this.salario + (this.salario * (valor / 100));
    }
}