import java.util.Scanner;

public class DesafioTwo {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        Soma robbie = new Soma();

        System.out.println("Digite dois numeros para somar");
        int numeroOne = dado.nextInt();
        int numeroTwo = dado.nextInt();
        robbie.setNumeroOne(numeroOne);
        robbie.setNumeroTwo(numeroTwo);
        robbie.maiorMenor();

    }


}
