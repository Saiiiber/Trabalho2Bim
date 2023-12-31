/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VeccCliente;
import dao.ClienteDAO;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import tools.Util;
import view.pesquisar.JDlgCliente_pesquisar;

/**
 *
 * @author u10549640177
 */
public class JDlgCliente extends javax.swing.JDialog {
    boolean incluir;
    public boolean pesquisar;

    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JFormattedTextField();
        jTxtRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtIdade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTxtDataNasc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtNacionalidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCboEstCivil = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTxtProfissao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtPreferencias = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTxtTelFixo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("email");

        jLabel3.setText("RG");

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cpf");

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jTxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCpfActionPerformed(evt);
            }
        });

        jLabel8.setText("Endereço");

        jLabel2.setText("Nome");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jTxtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRGActionPerformed(evt);
            }
        });

        jLabel4.setText("Apelido");

        jLabel5.setText("Telefone");

        jTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Idade");

        jLabel9.setText("Sexo");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masc", "Femi", "Outro" }));

        jLabel10.setText("DataNasc");

        jLabel11.setText("Nacionalidade");

        jTxtNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNacionalidadeActionPerformed(evt);
            }
        });

        jLabel12.setText("Cep");

        jLabel13.setText("EstCivil");

        jCboEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Viuvo(a)", "Casado(a)", "Divorciado(a)" }));

        jLabel14.setText("Profissão");

        jLabel15.setText("Preferencias");

        jLabel16.setText("Telefone Fixo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jTxtApelido)
                                .addComponent(jTxtTelefone)
                                .addComponent(jTxtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(jLabel12)
                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtTelFixo))
                            .addComponent(jCboEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jTxtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jTxtPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:

        incluir= true;
        Util.habilitar(true,  jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido, jBtnCancelar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limp( jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:

        incluir= false;
        Util.habilitar(true,  jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido, jBtnCancelar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:

        if( Util.pergunta("Excluir", "Excluir?") == YES_NO_OPTION){
            VeccCliente cliente = viewbean();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.delete(cliente);
            Util.msg("Exclusão efetuada");
        }else{
            Util.msg("Exclusão cancelada");

        }
        Util.limp( jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        if (incluir ==true) {
            VeccCliente usuarios = viewbean();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.insert(usuarios);
            Util.habilitar(false, jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido, jBtnCancelar, jBtnCancelar);
            Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
            Util.limp(jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome);
        }else{
            VeccCliente cliente = viewbean();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.update(cliente);
            Util.habilitar(false, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jBtnCancelar, jBtnCancelar);
            Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
            Util.limp(jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome);

        }

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false,  jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido, jBtnCancelar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limp( jTxtTelefone, jTxtTelFixo, jTxtProfissao, jTxtPreferencias ,jTxtNacionalidade, jTxtCep, jCboEstCivil, jTxtEmail, jTxtEndereco, jTxtRG, jTxtCpf, jTxtNome, jCboSexo, jTxtApelido, jBtnCancelar, jBtnCancelar);
        Util.msg("Operação cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgCliente_pesquisar jDlgCliente_pesquisar = new JDlgCliente_pesquisar(null, true);

        jDlgCliente_pesquisar.setTelaAnterior(this);
        jDlgCliente_pesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCpfActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRGActionPerformed

    private void jTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneActionPerformed

    private void jTxtNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNacionalidadeActionPerformed

    
    public VeccCliente viewBean(){
        VeccCliente veccCliente = new VeccCliente();
        veccCliente.setVeccCpf(jTxtCpf.getText());
        veccCliente.setVeccNome(jTxtNome.getText());
        if(jCboSexo.getSelectedIndex() == 0){
        veccCliente.setVeccSexo("M");
        }else{
        veccCliente.setVeccSexo("F");
        }
        veccCliente.setVeccEndereco(jTxtEndereco.getText());
        veccCliente.setVeccIdade(jTxtIdade.getText());    
        veccCliente.setVeccCep(jTxtCep.getText());  
        veccCliente.setVeccTelefone(jTxtTelefone.getText());
        veccCliente.setVeccEmail(jTxtEmail.getText());
        veccCliente.setVeccNacionalidade(jTxtNacionalidade.getText());
        veccCliente.setVeccTelFixo(jTxtTelFixo.getText());
        veccCliente.setVeccProfissao(jTxtProfissao.getText());
        veccCliente.setVeccApelido(jTxtApelido.getText());
        veccCliente.setVeccPreferencias(jTxtPreferencias.getText());
        
        return veccCliente;
        }
        
        
        public VeccCliente beanView(VeccCliente veccCliente){
            
        jTxtCpf.setText(veccCliente.getVeccCpf());
        jTxtNome.setText(veccCliente.getVeccNome());
        if(veccCliente.getVeccSexo().equals("M")){
        jCboSexo.setSelectedIndex(0);
        }else{
        jCboSexo.setSelectedIndex(1);
        }
        jTxtEndereco.setText(veccCliente.getVeccEndereco());
        jTxtCpf.setText(veccCliente.getVeccCpf());
        jTxtCep.setText(veccCliente.getVeccCep());
        jTxtTelefone.setText(veccCliente.getVeccTelefone());
        jTxtPreferencias.setText(veccCliente.getVeccPreferencias());
        jTxtTelFixo.setText(veccCliente.getVeccTelFixo());
        jTxtNacionalidade.setText(veccCliente.getVeccNacionalidade());
        jTxtProfissao.setText(veccCliente.getVeccProfissao());
        jTxtIdade.setText(veccCliente.getVeccIdade());
        jTxtEmail.setText(veccCliente.getVeccEmail());
        //jFmtDataNascimento.setText(clientes.getDataNascimento());
        
        
        //jChbAtivo.setSelected(clientes.getAtivo().equals("S"));//faz direto numa linha
        
        jBtnAlterar.setEnabled(true);
        return veccCliente;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboEstCivil;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtDataNasc;
    private javax.swing.JFormattedTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtIdade;
    private javax.swing.JTextField jTxtNacionalidade;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPreferencias;
    private javax.swing.JTextField jTxtProfissao;
    private javax.swing.JTextField jTxtRG;
    private javax.swing.JTextField jTxtTelFixo;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables

    private VeccCliente viewbean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
