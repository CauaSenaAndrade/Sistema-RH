public class Main {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Cauã", "123.456.789-00", 2000.0);
        System.out.println("Funcionario: " + f1.nome);
        System.out.println("Salario antigo: R$ " + f1.salario);
        f1.aplicarAumento(10);
        System.out.println("Salario com 10%: R$ " + f1.salario);

        System.out.println("-----------------------------------");

        Gerente g1 = new Gerente("Ana Gerente", "987.654.321-11", 5000.0, "admin123");
        System.out.println("Gerente: " + g1.nome);
        System.out.println("Salario antigo: R$ " + g1.salario);
        g1.aplicarAumento(10);
        System.out.println("Salario com 10% (+2% bonus): R$ " + g1.salario);
        
        System.out.println("Senha correta? " + g1.verificarSenha("admin123"));
    }
}