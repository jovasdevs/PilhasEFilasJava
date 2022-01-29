package br.com.jovasdevs.atribuicaoreferencia;

public class AtribuicaoReferencia {
    public static void main(String[] args) {

        //TIPOS PRIMITIVOS
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + " intB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + " intB= " + intB);


        //TIPOS OBJETOS
        NovoObj objA = new NovoObj(1);
        NovoObj objB = objA;
        System.out.println("objA= "+ objA+"  objB= "+objA);
        objA.setNum(2);
        System.out.println("objA= "+ objA+"  objB= "+objA);

    }


}
