package Banco;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBanco extends JFrame {

    JPanel panel = new JPanel();
    JTextArea textArea1;
    JTextArea textArea2;
    JTextArea textArea3;
    JTextField cajaTexto1;
    JTextField cajaTexto01;
    JTextField cajaTexto2;

    public VentanaBanco(){
        this.setSize(450,450);
        setTitle("Autor Gerardo; Banco de GerardoMercado");
        setLocation(600,175);
        ejecutarTodo();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void ejecutarTodo(){
        componentes();
        botones();
        cajasDeTexto();
        etiquetas();
        areasDeTexto();

    }

    private void componentes(){
        this.getContentPane().add(panel);  //agregamos el panel a la ventana
        // panel.setBackground(Color.green);
        panel.setLayout(null);
    }

    private void botones(){
        JButton boton1 = new JButton(); //instancia al constructor de boton
        boton1.setBounds(303,45,95,25);
        boton1.setText("Si");
        panel.add(boton1);

        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilaBanco fila2 = new FilaBanco();
                CuentaBancaria cuenta3 = new CuentaBancaria(50, cajaTexto01.getText());
                Cliente cliente3 = new Cliente(cuenta3,"VIP", cajaTexto1.getText(), "4664510904");
                fila2.add(cliente3);
                System.out.println(fila2.toString());
                textArea3.append(fila2.toString());
            }
        };

        boton1.addActionListener(oyenteDeAccion);

        JButton boton2 = new JButton();
        boton2.setBounds(303, 75,95,25);
        boton2.setText("No");
        panel.add(boton2);

    }

    private void cajasDeTexto(){

        cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(58,40,90,25);
        panel.add(cajaTexto1);

        cajaTexto01 = new JTextField();
        cajaTexto01.setBounds(58,87,200,25);
        panel.add(cajaTexto01);

        cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(168,40,90,25);
        panel.add(cajaTexto2);

    }

    private void areasDeTexto(){
        textArea1 = new JTextArea();
        textArea1.setBounds(60,310,338,50);
        panel.add(textArea1);

        textArea2 = new JTextArea();
        textArea2.setBounds(60,223,338,50);
        panel.add(textArea2);

        textArea3 = new JTextArea();
        textArea3.setBounds(60,140,338,50);
        panel.add(textArea3);
    }

/*
        private void radioBotones(){

            JRadioButton radioBoton1 = new JRadioButton();
            radioBoton1.setBounds(20,250,200,25);
            radioBoton1.setEnabled(true);
            radioBoton1.setText("VIP-Client");
            panel.add(radioBoton1);

        }
*/

    private void etiquetas(){
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(79,4, 80, 50);
        etiqueta1.setText("Cliente");
        etiqueta1.setEnabled(true);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(191,4, 80, 50);
        etiqueta2.setText("Monto");
        etiqueta2.setEnabled(true);
        panel.add(etiqueta2);

        JLabel etiqueta02 = new JLabel();
        etiqueta02.setBounds(60,50, 200, 50);
        etiqueta02.setText("Número de cuenta.");
        etiqueta02.setEnabled(true);
        panel.add(etiqueta02);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(304,4, 100, 50);
        etiqueta3.setText("¿Es cliente VIP?");
        etiqueta3.setEnabled(true);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(60,104, 200, 50);
        etiqueta4.setText("Fila de clientes VIP.");
        etiqueta4.setEnabled(true);
        panel.add(etiqueta4);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setBounds(60,187, 200, 50);
        etiqueta5.setText("Fila de clientes estándar.");
        etiqueta5.setEnabled(true);
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel();
        etiqueta6.setBounds(60,270, 250, 50);
        etiqueta6.setText("Salida de fila con acción de retiro o abono.");
        etiqueta6.setEnabled(true);
        panel.add(etiqueta6);

    }


}
