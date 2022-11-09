package validarcpf;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Layout extends JFrame{
    
    Logica logica = new Logica();

    public Layout() {
        
        organizarLayout();
        setSize(542,200);//definindo o tamanho da tela
        setTitle("Validador de CPF");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //finalizar a aplicação
        setMaximizedBounds(new Rectangle(542,200)); //definindo um valor máximo
        setLocationRelativeTo(null);
        setVisible(true); //mostrar a tela com os componentes   
        
    }
    
    private void organizarLayout(){
        setLayout(new BorderLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //Criando o JPanel
        JPanel panel = new JPanel();

        
        // Criando o JLabel
        JLabel label = new JLabel();
        label.setText("INFORME O CPF");
        
        //Criando o JTextField
        JTextField textBox = new JTextField(20);  
        
        //Criação do Label para mostrar o resultado
        JLabel res = new JLabel("**************");
        

        //crindo os boltões
        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.addActionListener((ActionEvent evt) -> {
            String texto = textBox.getText();
            logica.validar(texto);
            String validacao = Logica.getResultadoFinal();
            res.setText(validacao);
        });
       
        //add no panel
        panel.add(label);
        panel.add(textBox);
        panel.add(btnVerificar);
        panel.add(res);
        //Adicionando o Panel no JFrame
        add(panel);
    }
    
}
