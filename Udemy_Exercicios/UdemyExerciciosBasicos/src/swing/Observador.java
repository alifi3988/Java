/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alifi
 */
public class Observador {
    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout()); //
        janela.setLocationRelativeTo(null); //centralizar na tela
        
        JButton botao = new JButton("Clicar");
        janela.add(botao);
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Evento ocorreu!");

            }
        });
        
        janela.setVisible(true);
        
    }
    
}
