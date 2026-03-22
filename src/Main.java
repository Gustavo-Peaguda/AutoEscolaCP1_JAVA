public class Main {
    public static void main(String[] args) {

        AutoEscola autoEscola = new AutoEscola();

        // criar instrutor e veiculo
        Instrutor instrutor = new Instrutor();
        instrutor.nome = "Roberto Silva";
        instrutor.experiencia = 10;
        instrutor.categoria = "A/B";

        Veiculo veiculo = new Veiculo();
        veiculo.modelo = "Fiat Mobi";
        veiculo.placa = "ABC-1234";
        veiculo.tipo = "Carro";

        System.out.println("======= SISTEMA AUTOESCOLA INICIALIZADO =======");

        // aluno 1: Gustavo (faz tudo certo)
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gustavo Peaguda";
        aluno1.idade = 19;
        aluno1.tipoVeiculo = "Carro";
        autoEscola.aluno1 = aluno1;

        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();

        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();

        System.out.println("\nAluno: " + aluno1.nome);
        aluno1.realizarExame();


        // aluno 2: Enzo (cancela Aula)
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Enzo";
        aluno2.idade = 18;
        aluno2.tipoVeiculo = "Moto";
        autoEscola.aluno2 = aluno2;

        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.cancelarAulaTeorica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.cancelarAulaPratica();

        System.out.println("\nAluno: " + aluno2.nome);
        aluno2.realizarExame();


        // aluno 3: Felipe (esqueceu as aulas práticas)
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Felipe Cerazi";
        aluno3.idade = 20;
        aluno3.tipoVeiculo = "Carro";
        autoEscola.aluno3 = aluno3;

        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();

        System.out.println("\nAluno: " + aluno3.nome);
        aluno3.realizarExame();


        // aluno 4: Lorenzo (faz aulas extras)
        Aluno aluno4 = new Aluno();
        aluno4.nome = "Lorenzo Coque";
        aluno4.idade = 21;
        aluno4.tipoVeiculo = "Carro";
        autoEscola.aluno4 = aluno4;

        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();

        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();

        System.out.println("\nAluno: " + aluno4.nome);
        aluno4.realizarExame();


        // resumo final da autoEscola
        System.out.println("\n=========================================");
        System.out.println("        RELATORIO FINAL        ");
        System.out.println("=========================================");
        System.out.println("Instrutor Responsavel: " + instrutor.nome);
        System.out.println("Veiculo Utilizado: " + veiculo.modelo + " (" + veiculo.placa + ")");

        autoEscola.exibirResumo();
    }
}