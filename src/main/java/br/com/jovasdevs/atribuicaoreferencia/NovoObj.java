package br.com.jovasdevs.atribuicaoreferencia;

public class NovoObj {

    Integer num;

    // CONSTRUTOR
    public NovoObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
