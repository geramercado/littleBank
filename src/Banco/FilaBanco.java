package Banco;

public class FilaBanco {

    private Cliente[] fila;
    private int index;
    private int movimientoRetiro;
    private int movimientoDeposito;
    private int totalmovimientos;

    FilaBanco(){
        this.index = 0;
        this.movimientoRetiro = 0;
        this.movimientoDeposito = 0;
        this.totalmovimientos = 0;
        this.fila = new Cliente[4];
    }

    public boolean empty(){

        return index == 0;
    }

    public boolean full(){

        return index == fila.length;
    }

    public void add(Cliente cliente){
        if(full()) extend();
        fila[index++] = cliente;
    }

    public void extend(){
        Cliente extendiendoFila[] = new Cliente[fila.length+4];
        for(int i = 0; i < index; i++){
            extendiendoFila[i] = fila[i];
        }
        fila = extendiendoFila;
    }

    public void remove(){
        for(int i = 0; i < index-1; i++){
            fila[i] = fila[i+1];
        }
        index--;
    }

    public int search(String nombre){

        for(int i = 0; i < index; i++){
            if(nombre.equalsIgnoreCase(fila[i].getNombre())){
                System.out.println("Nombre: "+nombre+" en la posición - "+fila[i]);
                return i+1;
            }
        }
        return -1;
    }


    @Override
    public String toString(){
        String cadena = "";
        for(int i = 0; i < index; i++ ){
            cadena += fila[i].toString()+"\n";
        }
        return cadena;
    }


    public Cliente[] getFila() {

        return fila;
    }

    public void setFila(Cliente[] fila) {

        this.fila = fila;
    }

    public int getIndex() {

        return index;
    }

    public void setIndex(int index) {

        this.index = index;
    }

    public int getMovimientoRetiro() {

        return movimientoRetiro;
    }

    public void setMovimientoRetiro(int movimientoRetiro) {

        this.movimientoRetiro = movimientoRetiro;
    }

    public int getMovimientoDeposito() {

        return movimientoDeposito;
    }

    public void setMovimientoDeposito(int movimientoDeposito) {

        this.movimientoDeposito = movimientoDeposito;
    }

    public int getTotalmovimientos() {

        return totalmovimientos;
    }

    public void setTotalmovimientos(int movimientos) {

        this.totalmovimientos = movimientos;
    }

}
