/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cod3r.calc.visao;

import br.com.cod3r.calc.modelo.Memoria;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alifi
 */
public class Teclado extends JPanel implements ActionListener{
    
    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(99,99,99);
    private final Color COR_LARANJA = new Color(242,163,60);
    private final Color COR_WHITE = new Color(255,255,255);

    public Teclado() {
        
        //com esse pode ter botões ocupando duas colunas
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        
        setLayout(layout);
        //definindo um peso para os elementos (ocupação de casas do teclado)
        c.weightx = 1;
        c.weighty = 1;
        
        c.fill = GridBagConstraints.BOTH; // chamando para que os botões preencham de forma certa e padronizada, ficando alinhados
        
        //setLayout(new GridLayout(6, 4)); // é a forma mais básica de add
        
        //montando o teclado de acordo com as posições x e y
        //adicionando a primeira linha
        adicionarBotao("%", COR_CINZA_CLARO, c, 0, 0);
        adicionarBotao("CE", COR_CINZA_CLARO, c, 0, 1);
        adicionarBotao("C", COR_CINZA_CLARO, c, 0, 2);
        adicionarBotao("⌫", COR_CINZA_CLARO, c, 0, 3);
        
        //adicionando a segunda linha
        adicionarBotao("1/x", COR_CINZA_CLARO, c, 1, 0);
        adicionarBotao("x²", COR_CINZA_CLARO, c, 1, 1);
        adicionarBotao("√x", COR_CINZA_CLARO, c, 1,2);
        adicionarBotao("/", COR_CINZA_CLARO, c, 1, 3);
        
        //adicionando a terceira linha
        adicionarBotao("7", COR_CINZA_ESCURO, c, 2, 0);
        adicionarBotao("8", COR_CINZA_ESCURO, c, 2, 1);
        adicionarBotao("9", COR_CINZA_ESCURO, c, 2, 2);
        adicionarBotao("x", COR_CINZA_CLARO, c, 2, 3);
        
        //adicionando a quarta linha
        adicionarBotao("4", COR_CINZA_ESCURO, c, 3, 0);
        adicionarBotao("5", COR_CINZA_ESCURO, c, 3, 1);
        adicionarBotao("6", COR_CINZA_ESCURO, c, 3, 2);
        adicionarBotao("-", COR_CINZA_CLARO, c, 3, 3);
        
        //adicionando a quinta linha
        adicionarBotao("1", COR_CINZA_ESCURO, c, 4, 0);
        adicionarBotao("2", COR_CINZA_ESCURO, c, 4, 1);
        adicionarBotao("3", COR_CINZA_ESCURO, c, 4, 2);
        adicionarBotao("+", COR_CINZA_CLARO, c, 4, 3);
        
        //adicionando a sexta linha
        adicionarBotao("+/-", COR_CINZA_ESCURO, c, 5, 0);
        adicionarBotao("0", COR_CINZA_ESCURO, c, 5, 1);
        adicionarBotao(",", COR_CINZA_ESCURO, c, 5, 2);
        adicionarBotao("=", COR_CINZA_CLARO, c, 5, 3);
    }

    //função para add botão
    private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int y, int x) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processarComando(botao.getText());
        }
    }
}
