package Banco;

public class Cliente {

    private String tipo;  // cliente de alta prioridad o de baja prioridad
    private String nombre;
    private String telefono;
    private CuentaBancaria cuenta;

    Cliente(CuentaBancaria cuenta, String tipo, String nombre, String telefono){
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return "Tipo: "+tipo+", Nombre: "+nombre+", Telefono: "+telefono+", "+cuenta;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public CuentaBancaria getCuenta() {

        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {

        this.cuenta = cuenta;
    }

}
