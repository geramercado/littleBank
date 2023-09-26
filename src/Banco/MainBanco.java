package Banco;

public class MainBanco {

    public static void main(String[] args){

        VentanaBanco ventana = new VentanaBanco();
        ventana.setVisible(true);

        FilaBanco fila1 = new FilaBanco();

        CuentaBancaria cuenta1 = new CuentaBancaria(0,"1111111111");
        Cliente cliente1 = new Cliente(cuenta1,"VIP", "Gerardo", "4661856722");
        fila1.add(cliente1);

        CuentaBancaria cuenta2 = new CuentaBancaria(0,"2222222222");
        Cliente cliente2 = new Cliente(cuenta2,"Estándar", "Aaron", "4661856622");
        fila1.add(cliente2);
        System.out.println(fila1.toString());


    }

}
