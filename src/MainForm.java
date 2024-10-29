import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtNome;
    private JLabel lblNome;
    private JButton validarButton;
    private JPanel mainPanel;
    private JLabel txtResultado;

    public MainForm(){

        validarButton.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                              //Obter nome do input
                                              String nomeDigitado = txtNome.getText();

                                              txtResultado.setText(nomeDigitado);
                                            }
                                        }
        );


    }
    public static void main(String[] args) {
        //cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ajusta a minha TV e o tamanho do painel
        //frame.pack();
       frame.setSize(500,500);
        //Ligar a TV
        frame.setVisible(true);

    }

}
