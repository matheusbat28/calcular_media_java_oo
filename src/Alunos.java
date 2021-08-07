
import javax.swing.JOptionPane;

public class Alunos {

    String nome;
    float nota1;
    float nota2;
    float media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    private void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float fazerMedia() {
        float media = (getNota1() + getNota2()) / 2;
        setMedia(media);
        return media;
    }

    public String estadoAluno() {
        if (fazerMedia() >= 7) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }

    public String mostraAluno() {
        return "nome " + getNome() + " \n" + "média " + getMedia() + " \n"
                + "estado " + estadoAluno();
    }

    public static void main(String args[]) {

        String quantidade = JOptionPane.
                showInputDialog("isira a quantidae de aluno:");
        int quatidade = Integer.parseInt(quantidade);
        for (int i = 1; i <= quatidade; i++) {

            Alunos aluno = new Alunos();

            aluno.setNome(JOptionPane.showInputDialog("insira o nome:"));
            aluno.setNota1(Float.parseFloat(JOptionPane.
                    showInputDialog("isira a primeira nota do(a) "
                            + aluno.getNome())));
            aluno.setNota2(Float.parseFloat(JOptionPane.
                    showInputDialog("isira a segunda nota do(a) "
                            + aluno.getNome())));

            aluno.fazerMedia();
            aluno.estadoAluno();

            JOptionPane.showInputDialog(aluno.mostraAluno());
        }
    }
}
