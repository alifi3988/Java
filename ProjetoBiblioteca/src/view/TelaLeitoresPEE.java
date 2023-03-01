
package view;

import classes.Leitor;
import classes.Mensagens;
import classes.VerificadorString;
import classes.bancodados.DesativacaoDados;
import classes.bancodados.RecuperacaoDados;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaLeitoresPEE extends javax.swing.JInternalFrame {


    public TelaLeitoresPEE() {
        initComponents();   
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGroupPesquisa = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        PainelPEE = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbCPF = new javax.swing.JRadioButton();
        rbRG = new javax.swing.JRadioButton();
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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbNome)
                .addGap(38, 38, 38)
                .addComponent(rbCPF)
                .addGap(38, 38, 38)
                .addComponent(rbRG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(rbCPF)
                    .addComponent(rbRG))
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
        txtDado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDadoKeyTyped(evt);
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
                "ID Leitor", "Nome", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        btnImpressao.setText("Verificar os dados completo");
        btnImpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressaoActionPerformed(evt);
            }
        });

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
                .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnPesquisar)))
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPEELayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PainelPEELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelPEELayout.createSequentialGroup()
                                .addComponent(btnImpressao)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
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

        //botão para editar
        if(tblLeitores.getSelectedRowCount() == 1){
            editarDadosSelecionado(tblLeitores.getSelectedRow());
            
            //criando o modelo da tabela
            DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

            //Zerando as linhas da tabela
            modelo.setNumRows(0);
            
            
        }else{
            new Mensagens().mensagemAlerta("Para realizar a edição, deve selecionar somente uma única linha.");
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        MostrarDadosTable();
    }//GEN-LAST:event_btnPesquisarActionPerformed

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

        MostrarDadosTable();
    }//GEN-LAST:event_txtDadoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
 
        //refazer essa parte *******************************************
        //pegando as linhas selecionadas
        
        ///se foi selecionada uma linha somente
        if(tblLeitores.getSelectedRowCount() == 1){
            
            //pegando a linha selecionada
            if(desativarDadosSelecionados(tblLeitores.getSelectedRow())){
                new Mensagens().mensagemInformativa("Dados excluídos com sucesso!");
            }else{
                new Mensagens().mensagemAlerta("Erro ao excluir os dados!");
            }

        //se for selecionado mais de uma linha
        }else if(tblLeitores.getSelectedRowCount() > 1){
            
            if(desativarDadosSelecionados2(tblLeitores.getSelectedRows())){
                new Mensagens().mensagemInformativa("Dados foram excluídos com sucesso!");
            }else{
                new Mensagens().mensagemAlerta("Erro ao excluir os dados!");
            }
            
        }else{
            new Mensagens().mensagemAlerta("Erro, verifique!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtDadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDadoKeyTyped
     
    }//GEN-LAST:event_txtDadoKeyTyped

    private void btnImpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressaoActionPerformed
        //mostrar os dados do usuário selecionado
        
        if(tblLeitores.getSelectedRowCount() == 1){
            mostrarDadosSelecionado(tblLeitores.getSelectedRow());
        }else{
            new Mensagens().mensagemAlerta("Selecione somente uma linha. O Contrário, aconselho que vai a parte de relatórios.");
        }
        
        
        
        
        
    }//GEN-LAST:event_btnImpressaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPEE;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroupPesquisa;
    private javax.swing.JButton btnImpressao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbRG;
    private javax.swing.JTable tblLeitores;
    private javax.swing.JTextField txtDado;
    // End of variables declaration//GEN-END:variables

 public void trazerDados(List<Leitor> leitoresRecuperados){
        
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

        //Zerando as linhas
        modelo.setNumRows(0);
                
        //chamndo o arquivo txt para ser lido, e colocar na tabela os valores
        //Arquivo arquivoTxt = new Arquivo();
        //leitores = arquivoTxt.lerArquivo("ArquivoLeitores");
        
        //realizando se a lista está vazia
        if(leitoresRecuperados.isEmpty()){
            new Mensagens().mensagemAlerta("Não houve dados a serem recuperados.");
        }else{
            try{
                for (Leitor l : leitoresRecuperados) {
                    modelo.addRow(new Object[]{
                        l.getId_leitor(),
                        l.getNome(),
                        l.getCpf(),
                        l.getTelefone()
                    });
                  }
            }catch(Exception e){
                new Mensagens().mensagemAlerta("Houve erro na recuperação dos dados!");
            }
        }  
    }
 
 public void MostrarDadosTable(){
        String valor = "";
        String dados = txtDado.getText();
        
        if(!rbCPF.isSelected() && !rbNome.isSelected() && !rbRG.isSelected()){
            new Mensagens().mensagemAlerta("Selecione uma das opções ao lado.");
        }else if(!new VerificadorString().verificarHaSql(dados) || dados.isEmpty()){
            new Mensagens().mensagemErro("Verifique as informações apresentadas!");
        }else{
            if(rbCPF.isSelected()){
                valor = "cpf"; 
            }
            else if(rbNome.isSelected()){
                valor = "nome";
            }
            else if(rbRG.isSelected()){
                valor = "rg";
            }
            //fazendo a busca no Banco de dados
            List<Leitor> dadosLeitores = new ArrayList<>();
            dadosLeitores = RecuperacaoDados.receuparacaoDadosLeitores(valor, dados);
            
            trazerDados(dadosLeitores);
            
        }
 }
 
 public Boolean desativarDadosSelecionados(int linhaSelecionada){
        
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();
        
        //chamndo o arquivo txt para ser lido, e colocar na tabela os valores
        //Arquivo arquivoTxt = new Arquivo();
        //leitores = arquivoTxt.lerArquivo("ArquivoLeitores");
        
        //realizando se a lista está vazia

        try{            
            //pegando a primeira linha e primeira coluna (Id_leitor)
            Object obj = modelo.getValueAt(linhaSelecionada, 0);

            if(new DesativacaoDados().desativarDados(Integer.parseInt(obj+""))){
                MostrarDadosTable();
            }
            
        }catch(NumberFormatException e){
            new Mensagens().mensagemAlerta(e.getMessage());
            return false;
        }
        return true;
    }
 
 public Boolean desativarDadosSelecionados2(int linhasSelecionadas[]){
        
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();
        
        for(int i = linhasSelecionadas.length; i > 0;i--){

            if(i-1 >= 0){
                try{            
                   //pegando a primeira linha e primeira coluna (Id_leitor)
                   Object obj = modelo.getValueAt((i-1), 0);
                   new DesativacaoDados().desativarDados(Integer.parseInt(obj+""));

                }catch(NumberFormatException e){
                   new Mensagens().mensagemAlerta(e.getMessage());
                   return false;
                }
            }
        }
        MostrarDadosTable();
        return true;
    }  
 
 public Boolean editarDadosSelecionado(int linhaSelecionada){
     
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

        
        try{            
            //pegando a primeira linha e primeira coluna (Id_leitor)
            Object obj = modelo.getValueAt(linhaSelecionada, 0);

            //chamando a tela de Cadastro de Leitor, para realizar a edição
            //trazendo os dados através do ID do usuário
            List<Leitor> leitorRecuperado = new ArrayList<>(
                    RecuperacaoDados.receuparacaoDadosLeitores(
                            "id_leitor", 
                            obj.toString())
            );
            
            for(Leitor l: leitorRecuperado){
                TelaLeitorEditar editarLeitor = new TelaLeitorEditar(l);
                editarLeitor.setVisible(true);
                URL url = this.getClass().getResource("/images/icone_menu.png"); 
                Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url); 
                editarLeitor.setIconImage(iconeTitulo);
            }
            
            
        }catch(NumberFormatException e){
            new Mensagens().mensagemAlerta(e.getMessage());
            return false;
        }
        return true;
 }
 public Boolean mostrarDadosSelecionado(int linhaSelecionada){
     
        //criando o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblLeitores.getModel();

        
        try{            
            //pegando a primeira linha e primeira coluna (Id_leitor)
            Object obj = modelo.getValueAt(linhaSelecionada, 0);

            //chamando a tela de Cadastro de Leitor, para realizar a edição
            //trazendo os dados através do ID do usuário
            List<Leitor> leitorRecuperado = new ArrayList<>(
                    RecuperacaoDados.receuparacaoDadosLeitores(
                            "id_leitor", 
                            obj.toString())
            );
            
            for(Leitor l: leitorRecuperado){
                new Mensagens().mensagemLeitorDados(l);
                
            }
            
            
        }catch(NumberFormatException e){
            new Mensagens().mensagemAlerta(e.getMessage());
            return false;
        }
        return true;
 }
 
}


