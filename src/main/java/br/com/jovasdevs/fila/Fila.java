package br.com.jovasdevs.fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {

        this.refNoEntradaFila = null;
    }
    public void enqueue(T object){
        No<T> novoNo = new No<>(object); // embutindo o No na class fila
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }


    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }else{
                break;
            }
        }

            return (T) primeiroNo.getObject(); // (T) é um cast.
    }
            return null;
        }
    public boolean isEmpty(){

        return refNoEntradaFila == null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No  noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();

            }else{
                    noAuxiliar.setRefNo(null);
                break;
            }
        }
            return (T) primeiroNo.getObject();
    }
            return null;
    }
    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    break;
                }
            }
        }else{
            stringRetorno += "null";
        }
        return stringRetorno += "null";
    }
}
