package br.com.cod3r.calc.visao;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Calculadora extends JFrame{

    public Calculadora() {
        
        //como estou fazendo a herança da Classe com JFrame, isso ajuda a não ficar colocando JFrame
        
        organizarLayout();
        
        setSize(335, 542); // tamanho da tela
        //setUndecorated(true); //remover a brra de fechar, maximizar e minimizar           
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fechar, sair da aplicação
        setLocationRelativeTo(null); // centralizar a tela
        setVisible(true); // para mostrar uma tela
    }
    private void organizarLayout() {
        setLayout(new BorderLayout());
        
        Display display = new Display();
        display.setPreferredSize(new Dimension(335,150));
        add(display, BorderLayout.NORTH);
        
        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }
 
}
