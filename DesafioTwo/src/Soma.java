public class Soma {
    private int numeroOne = 0;
    private int numeroTwo = 0;
    private int maior ;

    public void setNumeroOne(int numeroOne) {
        this.numeroOne = numeroOne;
    }

    public void setNumeroTwo(int numeroTwo) {
        this.numeroTwo = numeroTwo;
    }

    public int getNumeroOne() {
        return numeroOne;
    }

    public int getNumeroTwo() {
        return numeroTwo;
    }

    public void maiorMenor(){
        for(int i = this.numeroOne; i > this.numeroTwo;i++){
            this.maior = this.numeroOne;
        }
        for(int i = this.numeroTwo; i > this.numeroOne;i++){
            this.maior = this.numeroTwo;
        }
        System.out.println(this.maior);
    }
}
