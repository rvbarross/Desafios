import java.util.ArrayList;

public class ProdutoMax {
   private int numeros[];
   private int tamanho;
   private int position = 0;
   private int ctd = 0;
   private int posição;
   private int maior;
   private int indice;
   private String numero;
   private ArrayList<String> numerosTwo = new ArrayList<>();

    public void setNumeros(int b) {
        this.numeros[position] = b;
        position++;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        this.numeros = new int[tamanho];
    }

    public void getNumeros() {
        for(int j = 0; j < this.tamanho; j++){
            System.out.print(this.numeros[j]+" ");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }


    public void produtoMaximo(){
        for(int j = 0; j < this.tamanho; j++){
            if(this.numeros[j] != 0){
               numero = Integer.toString(this.numeros[j]);
               numerosTwo.add(numero);
            }
            if(this.numeros[j] < 0){
                ctd++;
            }

        }
        //-6 4 -5 8 -10 0 8
        if(ctd % 2 != 0){
            maior = Integer.parseInt(this.numerosTwo.get(0));
            for (int i = 0; i < this.numerosTwo.size(); i++){
                System.out.println("valores: "+this.numerosTwo.get(i));
                if(Integer.parseInt(this.numerosTwo.get(i)) > maior && Integer.parseInt(this.numerosTwo.get(i)) < 0){
                    indice = i;
                }
            }
            numerosTwo.remove(indice);

        }

        System.out.println(numerosTwo.toString());

    }
}
