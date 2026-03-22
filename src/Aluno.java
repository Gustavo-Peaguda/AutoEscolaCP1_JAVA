public class Aluno {

    public String nome;
    public int idade;
    public String tipoVeiculo;
    public int aulasTeoricas;
    public int aulasPraticas;
    public boolean aprovado;


    public void agendarAulaTeorica() {
        this.aulasTeoricas++;
    }

    public void agendarAulaPratica() {
        this.aulasPraticas++;
    }

    public void cancelarAulaTeorica() {
        if (this.aulasTeoricas > 0) {
            this.aulasTeoricas--;
        } else {
            System.out.println("Nenhuma aula teorica para cancelar.");
        }
    }

    public void cancelarAulaPratica() {
        if (this.aulasPraticas > 0) {
            this.aulasPraticas--;
        } else {
            System.out.println("Nenhuma aula pratica para cancelar.");
        }
    }

    public void realizarExame() {
        if (this.aulasTeoricas >= 5 && this.aulasPraticas >= 5) {

            if (Math.random() > 0.5) {
                this.aprovado = true;
                System.out.println(this.nome + " realizou o exame e foi APROVADO!");
            } else {
                this.aprovado = false;
                System.out.println(this.nome + " realizou o exame e foi REPROVADO.");
            }
        } else {
            System.out.println(this.nome + " nao pode fazer o exame. Faltam aulas.");
        }
    }
}