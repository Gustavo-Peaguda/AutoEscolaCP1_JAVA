public class AutoEscola {
    public Aluno aluno1;
    public Aluno aluno2;
    public Aluno aluno3;
    public Aluno aluno4;


    public void exibirResumo() {
        System.out.println("\n=== RESUMO DA AUTOESCOLA ===");

        if (aluno1 != null) {
            System.out.println("Aluno: " + aluno1.nome + " | Teoricas: " + aluno1.aulasTeoricas + " | Praticas: " + aluno1.aulasPraticas + " | Aprovado: " + aluno1.aprovado);
        }
        if (aluno2 != null) {
            System.out.println("Aluno: " + aluno2.nome + " | Teoricas: " + aluno2.aulasTeoricas + " | Praticas: " + aluno2.aulasPraticas + " | Aprovado: " + aluno2.aprovado);
        }
        if (aluno3 != null) {
            System.out.println("Aluno: " + aluno3.nome + " | Teoricas: " + aluno3.aulasTeoricas + " | Praticas: " + aluno3.aulasPraticas + " | Aprovado: " + aluno3.aprovado);
        }
        if (aluno4 != null) {
            System.out.println("Aluno: " + aluno4.nome + " | Teoricas: " + aluno4.aulasTeoricas + " | Praticas: " + aluno4.aulasPraticas + " | Aprovado: " + aluno4.aprovado);
        }
    }
}