public class Cotação {
    private String titulo[];
    private int tamanho;
    private int position = 0;

    public void setTitulo(String titulo) {
        this.titulo[position] = titulo;
        position++;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        titulo = new String[this.tamanho];
        for(int i = 0; i < this.tamanho; i++){
            this.titulo[i] = "nada";
        }
    }

    public void getTitulo() {
        for(int i = 0; i < this.tamanho; i++){
            System.out.print((i+1)+" "+this.titulo[i]+", ");
        }
        System.out.println("");
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void removeTitulo(int posição){
        this.titulo[posição] = "nada";
        this.getTitulo();

    }

    public void substituirTitulo(int posição, String titulo){
        this.titulo[posição] = titulo;
        this.getTitulo();
    }
}
