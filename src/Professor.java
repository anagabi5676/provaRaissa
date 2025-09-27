class Professor extends Pessoa {
    String disciplina;

    @Override
    void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade + " anos e leciono " + disciplina);
    }
}
