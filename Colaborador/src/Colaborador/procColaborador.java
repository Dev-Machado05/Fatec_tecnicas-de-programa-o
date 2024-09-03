package Colaborador;

public class procColaborador {
    public static void main (String[] args) {
        Colaborador colab = new Colaborador();

        //usando o método set para redefinir os valores de nome e provento
        colab.setNome("Stanford Phines");
        colab.setProvento(5700);

        //usando o método get para receber os valores de nome e provento
        System.out.println(colab.getNome());
        System.out.println(colab.getProvento());
    }
}
