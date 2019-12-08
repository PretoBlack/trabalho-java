/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.AreaInteresseDAO;
import br.com.lpii.dao.ProfessorDAO;
import br.com.lpii.dao.PropostaDAO;
import br.com.lpii.model.Professor;
import br.com.lpii.model.Proposta;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Lima
 */
public class FrmSelecionarProfessorBanca extends javax.swing.JFrame {

    private Professor professor;
    private Proposta proposta;
    private int banca;

    /**
     * Creates new form FrmSelecionarProfessorBanca
     */
    public FrmSelecionarProfessorBanca() {
        initComponents();
    }

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getBanca() {
        return banca;
    }

    public void setBanca(int banca) {
        this.banca = banca;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c_professores = new javax.swing.JComboBox<>();
        btn_selecionar = new javax.swing.JButton();
        btn_verOutrosProfessores = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar banca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)), "Professores que possuem interesse no tema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 153, 51));

        c_professores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c_professores.setForeground(new java.awt.Color(0, 153, 51));

        btn_selecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_selecionar.setForeground(new java.awt.Color(0, 153, 51));
        btn_selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        btn_verOutrosProfessores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_verOutrosProfessores.setForeground(new java.awt.Color(0, 153, 51));
        btn_verOutrosProfessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btn_verOutrosProfessores.setText("Ver outros professores");
        btn_verOutrosProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verOutrosProfessoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_verOutrosProfessores))
                    .addComponent(c_professores, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_professores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addComponent(btn_verOutrosProfessores))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_verOutrosProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verOutrosProfessoresActionPerformed
        this.dispose();
        FrmSelecionarTodosrProfessoresBanca tela = new FrmSelecionarTodosrProfessoresBanca();
        tela.setProposta(proposta);
        tela.setProfessor(professor);
        tela.setVisible(true);
    }//GEN-LAST:event_btn_verOutrosProfessoresActionPerformed

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed

        FrmLoading loading = new FrmLoading();
        loading.setLabel("Salvando banca...");
        loading.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                // Salva professor escolhido
                Professor professorNomeBanca = (Professor) c_professores.getSelectedItem();

                // salva professor (nome) no objeto proposta
                if (banca == 1) {
                    proposta.setBanca1Nome(professorNomeBanca.getNome());
                    proposta.setBanca1(professorNomeBanca.getCodigo());
                    
                } else if (banca == 2) {
                    proposta.setBanca2Nome(professorNomeBanca.getNome());
                    proposta.setBanca2(professorNomeBanca.getCodigo());
                    
                }

                PropostaDAO dao = new PropostaDAO();
                ProfessorDAO daoProf = new ProfessorDAO();
                dao.alterarPropostaIncluirBanca(proposta);
                daoProf.addBanca(professorNomeBanca.getCodigo(), professorNomeBanca.getConta_banca());
                loading.dispose();
            }

        };

        t.start();

        this.dispose();
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando professores...");
        loading.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                // Lista todoas as propostas do professor
                AreaInteresseDAO daoAI = new AreaInteresseDAO();

                List<Professor> lista = daoAI.ListaProfessorAreaInteresse(proposta.getPropostaCodAreaInteresse(), professor.getCodigo(), proposta.getBanca1(), proposta.getBanca2());

                for (Professor item : lista) {
                    Professor p = new Professor();
                    p.setNome(item.getNome());
                    p.setCodigo(item.getCodigo());
                    p.setConta_banca(item.getConta_banca());
                    if (p.getConta_banca() < 5) {
                        c_professores.addItem(p);
                    }
                }
                loading.dispose();
            }

        };

        t.start();

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmSelecionarProfessorBanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionarProfessorBanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionarProfessorBanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionarProfessorBanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSelecionarProfessorBanca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton btn_verOutrosProfessores;
    private javax.swing.JComboBox<Professor> c_professores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
