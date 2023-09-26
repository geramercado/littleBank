package Banco;

public class CuentaBancaria {

    private double saldo;
    private String nCuenta;

    CuentaBancaria(double saldo, String numeroDeCuenta){
        if(numeroDeCuenta.length() == 10 && numeroDeCuenta.substring(0,1).matches("[1-9]")){
            if(numeroDeCuenta.substring(9,10).matches("[1-9]")) {
                this.nCuenta = numeroDeCuenta;
            }

        }else{
            System.out.println("El numero de cuenta debe de ser de 10 digitos");
        }
        this.saldo = saldo;
    }


    public String retiro(double cantidad){
        /*
        saldo inicial $100
        cantidad a retirar $30
        saldo final $70
         */
        saldo = saldo - cantidad;
        return "Se ha retirado: "+cantidad+", resultando la cantidad de .- "+saldo+" .";
    }

    public String deposito(double cantidad){

        saldo = saldo + cantidad;
        return "Se han depositado: "+cantidad+", resultando .- "+saldo+" de saldo.";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getnCuenta() {
        // cadena de 10 digitos aleatorios nunca debe de terminar en cero, nunca debe iniciar en 0
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    @Override
    public String toString(){

        return "Saldo: "+saldo+", Número de cuenta: "+nCuenta;
    }

}
