import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //peguei informação da tela
                Integer primeiro = Integer.valueOf( txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf( txtSegundoValor.getText());

                //Processei
               Integer soma = primeiro + segundo;

               //Mandei pra tela o resultado
               txtResultado.setText(soma.toString());

            }
        });

    }

    public static void main(String[] args) {

    JFrame frame = new JFrame("Minha Calculadora");
    frame.setContentPane(new Calculadora().panelMain);
    //frame.pack();
    frame.setSize(1200, 1200);
    frame.setVisible(true);

    }

}
