package br.com.cod3r.calc.visao;
import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Display extends JPanel implements MemoriaObservador{

    //add como diminuir a letra conforme a quantidade
    
    private JLabel label = new JLabel();
    public Display() {
        
        Memoria.getInstancia().adicionarObservador(this);
        
        setBackground(new Color(49,49,49));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("curier", Font.PLAIN, 40));
        
        
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        
        //setando o valor do Label
        label.setText(novoValor);
    }
    

    
    
    
}
