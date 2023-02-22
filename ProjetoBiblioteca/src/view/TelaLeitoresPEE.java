
package view;

import classes.Arquivo;
import classes.Leitor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaLeitoresPEE extends javax.swing.JInternalFrame {


    public TelaLeitoresPEE() {
        initComponents();   
    }
    
    public void trazerDados(){
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

        //Zerando as linhas
        modelo.setNumRows(0);
       
        //estanciando uma lista de leitores para ser add
        ArrayList<Leitor> leitores;
        
        //chamndo o arquivo txt para ser lido, e colocar na tabela os valores
        Arquivo arquivoTxt = new Arquivo();
        leitores = arquivoTxt.lerArquivo("ArquivoLeitores");
        
        //criando uma stream para verificar os dados cadastrados
        leitores.stream().forEach(pessoa -> System.out.println(pessoa.toString()));
        
        //realizando se a lista está vazia
        if(leitores.isEmpty()){
            modelo.addRow(new Object[]{
            "Sem informaçãoes", "Sem informaçãoes","Sem informaçãoes", "Sem informaçãoes"});
        }else{
            try{
                for (Leitor l : leitores) {
                    modelo.addRow(new Object[]{
                        l.getNome(),
                        l.getCpf(),
                        l.getDataNascimento(),
                        l.getTelefone()
                    });
                }
            }catch(Exception e){
                System.out.println("Erro: " + e.getMessage() );
            }
        }
    }
 
    public void trazerDados(String dados, String tipoDado){
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

        //Zerando as linhas
        modelo.setNumRows(0);
       
        //estanciando uma lista de leitores para ser add
        ArrayList<Leitor> leitores;
        
        //chamndo o arquivo txt para ser lido, e colocar na tabela os valores
        Arquivo arquivoTxt = new Arquivo();
        leitores = arquivoTxt.lerArquivo("ArquivoLeitores");
        
        //criando uma stream para verificar os dados cadastrados
        leitores.stream().forEach(pessoa -> System.out.println(pessoa.toString()));
        
        //realizando se a lista está vazia
        if(leitores.isEmpty()){
            modelo.addRow(new Object[]{
            "Sem informaçãoes", "Sem informaçãoes","Sem informaçãoes", "Sem informaçãoes"});
        }else{
            try{
                if(null != tipoDado)switch (tipoDado) {
                    case "nome" -> {
                        for (Leitor l : leitores) {
                            if(l.getNome().contains(dados)){
                                modelo.addRow(new Object[]{
                                    l.getNome(),
                                    l.getCpf(),
                                    l.getDataNascimento(),
                                    l.getTelefone()
                                });
                            }
                        }
                    }
                    case "cpf" -> {
                        for (Leitor l : leitores) {
                            if(l.getCpf().contains(dados)){
                                modelo.addRow(new Object[]{
                                    l.getNome(),
                                    l.getCpf(),
                                    l.getDataNascimento(),
                                    l.getTelefone()
                                });
                            }
                        }
                    }
                    case "rg" -> {
                        for (Leitor l : leitores) {
                            if(l.getRg().contains(dados)){
                                modelo.addRow(new Object[]{
                                    l.getNome(),
                                    l.getCpf(),
                                    l.getDataNascimento(),
                                    l.getTelefone()
                                });
                            }
                        }
                    }
                    case "todos" -> {
                        for (Leitor l : leitores) {
                            modelo.addRow(new Object[]{
                                l.getNome(),
                                l.getCpf(),
                                l.getDataNascimento(),
                                l.getTelefone()
                            });
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Erro: " + e.getMessage() );
            }
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGroupPesquisa = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        PainelPEE = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbCPF = new javax.swing.JRadioButton();
        rbRG = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDado = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeitores = new javax.swing.JTable();
        btnImpressao = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Impressão / Pesquisa / Editar");
        setToolTipText("Página dos Leitores");
        setName("Página do Leitor"); // NOI18N
        setRequestFocusEnabled(false);
        setVisible(true);

        PainelPEE.setBackground(new java.awt.Color(255, 255, 255));
        PainelPEE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PainelPEE.setPreferredSize(new java.awt.Dimension(651, 482));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o modo de pesquisa:"));

        rbNome.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupPesquisa.add(rbNome);
        rbNome.setText("Por nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        rbCPF.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupPesquisa.add(rbCPF);
        rbCPF.setText("CPF");
        rbCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCPFActionPerformed(evt);
            }
        });

        rbRG.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupPesquisa.add(rbRG);
        rbRG.setText("RG");
        rbRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRGActionPerformed(evt);
            }
        });

        rbTodos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupPesquisa.add(rbTodos);
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbTodosInputMethodTextChanged(evt);
            }
        });
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbNome)
                .addGap(38, 38, 38)
                .addComponent(rbCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbRG)
                .addGap(49, 49, 49)
                .addComponent(rbTodos)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(rbCPF)
                    .addComponent(rbRG)
                    .addComponent(rbTodos))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Realize a busca de acordo com as orientações:");

        jLabel4.setText("Informe de acordo com o selecionado:");

        txtDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDadoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblLeitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Data Nasc.", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLeitores.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblLeitoresComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(tblLeitores);

        btnImpressao.setText("Realizar impressão");

        btnEditar.setText("Editar Dados");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir/Desativar");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPEELayout = new javax.swing.GroupLayout(PainelPEE);
        PainelPEE.setLayout(PainelPEELayout);
        PainelPEELayout.setHorizontalGroup(
            PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPEELayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnPesquisar))
                        .addGap(32, 32, 32))))
            .addGroup(PainelPEELayout.createSequentialGroup()
                .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelPEELayout.createSequentialGroup()
                                .addComponent(btnImpressao)
                                .addGap(24, 24, 24)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PainelPEELayout.setVerticalGroup(
            PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPEELayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImpressao)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPEE, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPEE, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Página do Leitor");
        getAccessibleContext().setAccessibleDescription("Página do Leitor");

        setBounds(0, 0, 690, 543);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //essa será melhor com o banco de dados
        //visto que no momento estou utilizando arquivo txt e ArrayList
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        String valor = "";
        String dados = txtDado.getText();
        
        if(rbCPF.isSelected()){
            valor = "cpf";
        }else if(rbNome.isSelected()){
            valor = "nome";
        }else if(rbRG.isSelected()){
            valor = "rg";
        }else if(rbTodos.isSelected()){
            valor = "todos";
        }
        trazerDados(dados, valor);
 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        
        //verificando de qual está selecionado
        
        if(rbTodos.isSelected()){
            //chamando para realizar o preenchimento da tabela
            txtDado.enable(false);
            trazerDados();
           
        }
        
        
        
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbTodosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbTodosInputMethodTextChanged

    }//GEN-LAST:event_rbTodosInputMethodTextChanged

    private void tblLeitoresComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblLeitoresComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLeitoresComponentShown

    private void rbRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRGActionPerformed

        txtDado.enable(true);
    }//GEN-LAST:event_rbRGActionPerformed

    private void rbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPFActionPerformed
        txtDado.enable(true);
    }//GEN-LAST:event_rbCPFActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        txtDado.enable(true);
    }//GEN-LAST:event_rbNomeActionPerformed

    private void txtDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDadoActionPerformed
        
    }//GEN-LAST:event_txtDadoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        //essa será melhor com o banco de dados
        //visto que no momento estou utilizando arquivo txt e ArrayList
        
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPEE;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroupPesquisa;
    private javax.swing.JButton btnImpressao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbRG;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tblLeitores;
    private javax.swing.JTextField txtDado;
    // End of variables declaration//GEN-END:variables
}
