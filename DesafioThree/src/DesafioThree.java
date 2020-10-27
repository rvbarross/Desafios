import java.util.Scanner;

public class DesafioThree {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ProdutoMax proM = new ProdutoMax();

        System.out.println("digite o tamanho do vetor:");
        proM.setTamanho(dado.nextInt());
        for(int i = 0; i < proM.getTamanho(); i++){
            System.out.println("Digite o "+(i+1)+" valor: ");
            int numero = dado.nextInt();
            proM.setNumeros(numero);
        }
        proM.produtoMaximo();


    }
}
