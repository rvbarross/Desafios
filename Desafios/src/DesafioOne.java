import java.util.Scanner;

public class DesafioOne {
    public static void main(String[] args) {
        Cotação Bob = new Cotação();
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite quantas cotações");
        int tamanho = dado.nextInt();
        Bob.setTamanho(tamanho);
        int process;
        String cotação;
        int confirmedZero = 0;
        int confirmed = 0;
        int confirmedTwo = 0;



        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite a "+(i+1)+" cotação");
            cotação = dado.next();
            System.out.println("Digite 1 para Salvar ou 2 para Não Salvar");
            process = dado.nextInt();
            if(process == 1){
                Bob.setTitulo(cotação);
                confirmedZero = 0;
            }else{
                i--;
                confirmedZero = 1;
            }
            Bob.getTitulo();

            if(confirmedZero == 0){

                System.out.println("Deseja Remover ou Substituir algum item? 1-Remover 2-Substituir 3-Não,Sair");
                int decisão = dado.nextInt();
                if(decisão == 1){
                    while(confirmed == 0){
                        System.out.print("Qual item? ");
                        Bob.getTitulo();
                        Bob.removeTitulo(dado.nextInt() - 1);
                        System.out.println("Deseja remover mais algum item? 1-sim 2-não");
                        if(dado.nextInt() == 2){
                            confirmed = 1;
                        }

                    }


                }else if(decisão == 2){
                        while (confirmedTwo == 0){
                            System.out.println("Deseja substituir qual item?");
                            Bob.getTitulo();
                            int k = dado.nextInt() - 1;
                            System.out.println("Digite o novo titulo: ");
                            Bob.substituirTitulo(k,dado.next());
                            System.out.println("Deseja substituir mais algum item? 1-sim 2-não");
                            if(dado.nextInt() == 2){
                                confirmedTwo = 1;
                            }
                        }
                    }


            }



        }
        Bob.getTitulo();







    }
}
