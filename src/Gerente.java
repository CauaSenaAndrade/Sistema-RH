public class Gerente extends Funcionario {
    public String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean verificarSenha(String texto) {
        if (this.senha == texto) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void aplicarAumento(double valor) {
        // Gerente ganha o aumento normal + 2% de bônus
        this.salario = this.salario + (this.salario * ((valor + 2) / 100));
    }
}