package br.com.cod3r.calc.visao;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton{
    
    public Botao(String texto, Color corTecla) {
        setText(texto);
        setOpaque(true);
        setBackground(corTecla);
        setFont(new Font("courir", Font.PLAIN, 25));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(new Color(49,49,49)));
        
    }

    void addActionListener(Teclado aThis, String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
