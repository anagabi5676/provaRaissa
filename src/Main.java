public class Main {
    public static void main(String[] args) {
        // Questão 1
        Carro carro = new Carro();
        carro.marca = "Fiesta";
        carro.ano = 2017;
        carro.exibirDados();

        // Questão 2
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Raissa";
        pessoa.idade = 20;
        pessoa.apresentar();

        // Questão 3
        Produto p1 = new Produto();
        p1.nome = "Tenis";
        p1.preco = 600;

        Produto p2 = new Produto();
        p2.nome = "Bolsa";
        p2.preco = 250;

        System.out.println("Produto 1: " + p1.nome + " - R$" + p1.preco);
        System.out.println("Produto 2: " + p2.nome + " - R$" + p2.preco);

        // Questão 4
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Raissa";
        conta.depositar(6700);
        conta.sacar(700);
        System.out.println("Saldo atual: " + conta.saldo);

        // Questão 5
        Animal animal = new Animal();
        animal.nome = "Kessy";
        animal.idade = 8;
        animal.fazerSom();

        // Questão 6
        Aluno aluno = new Aluno();
        aluno.nome = "Raissa";
        aluno.idade = 20;
        aluno.matricula = "40028922";
        aluno.apresentar();

        // Questão 7
        Cachorro dog = new Cachorro();
        dog.nome = "Lua";
        dog.fazerSom();

        Gato cat = new Gato();
        cat.nome = "Pompom";
        cat.fazerSom();

        // Questão 8
        Professor prof = new Professor();
        prof.nome = "Zanini";
        prof.idade = 78;
        prof.disciplina = "Engenharia de Software";
        prof.apresentar();

        // Questão 9
        Funcionario f = new Funcionario();
        f.nome = "Carlos";
        f.salario = 2000;
        System.out.println("Bônus do funcionário: R$" + f.calcularBonus());

        Gerente g = new Gerente();
        g.nome = "Raissa";
        g.salario = 12000;
        System.out.println("Bônus do gerente: R$" + g.calcularBonus());
    }
}
