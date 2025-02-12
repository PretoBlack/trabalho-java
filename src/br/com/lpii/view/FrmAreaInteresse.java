/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.AreaInteresseDAO;
import br.com.lpii.model.AreaInteresse;
import br.com.lpii.model.Professor;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class FrmAreaInteresse extends javax.swing.JFrame {

    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * Método construtor
     */
    public FrmAreaInteresse() {
        initComponents();

    }

    /**
     * Método para gerenciar campos bloquear - block | desbloquear unblock
     * limpar - clean
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        painel_chk = new javax.swing.JPanel();
        chk_pyton = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chk_js = new javax.swing.JCheckBox();
        chk_java = new javax.swing.JCheckBox();
        chk_php = new javax.swing.JCheckBox();
        chk_cScharp = new javax.swing.JCheckBox();
        chk_html = new javax.swing.JCheckBox();
        chk_css = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        chk_desAndroid = new javax.swing.JCheckBox();
        chk_desIos = new javax.swing.JCheckBox();
        chk_machineLearning = new javax.swing.JCheckBox();
        chk_games = new javax.swing.JCheckBox();
        chk_dataScience = new javax.swing.JCheckBox();
        data_bancoDados = new javax.swing.JCheckBox();
        chk_estDeDados = new javax.swing.JCheckBox();
        chik_c = new javax.swing.JCheckBox();
        btn_salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Áreas de Interesse");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecionar Área de Interesse");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_chk.setBackground(new java.awt.Color(255, 255, 255));

        chk_pyton.setBackground(new java.awt.Color(255, 255, 255));
        chk_pyton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_pyton.setForeground(new java.awt.Color(0, 153, 51));
        chk_pyton.setText("Python");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Linguagens");

        chk_js.setBackground(new java.awt.Color(255, 255, 255));
        chk_js.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_js.setForeground(new java.awt.Color(0, 153, 51));
        chk_js.setText("JavaScript");

        chk_java.setBackground(new java.awt.Color(255, 255, 255));
        chk_java.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_java.setForeground(new java.awt.Color(0, 153, 51));
        chk_java.setText("Java");

        chk_php.setBackground(new java.awt.Color(255, 255, 255));
        chk_php.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_php.setForeground(new java.awt.Color(0, 153, 51));
        chk_php.setText("PHP");

        chk_cScharp.setBackground(new java.awt.Color(255, 255, 255));
        chk_cScharp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_cScharp.setForeground(new java.awt.Color(0, 153, 51));
        chk_cScharp.setText("C#");

        chk_html.setBackground(new java.awt.Color(255, 255, 255));
        chk_html.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_html.setForeground(new java.awt.Color(0, 153, 51));
        chk_html.setText("HTML");

        chk_css.setBackground(new java.awt.Color(255, 255, 255));
        chk_css.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_css.setForeground(new java.awt.Color(0, 153, 51));
        chk_css.setText("CSS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Temas");

        chk_desAndroid.setBackground(new java.awt.Color(255, 255, 255));
        chk_desAndroid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_desAndroid.setForeground(new java.awt.Color(0, 153, 51));
        chk_desAndroid.setText("Desenvolvimento Android");

        chk_desIos.setBackground(new java.awt.Color(255, 255, 255));
        chk_desIos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_desIos.setForeground(new java.awt.Color(0, 153, 51));
        chk_desIos.setText("Desenvolvimento iOS");

        chk_machineLearning.setBackground(new java.awt.Color(255, 255, 255));
        chk_machineLearning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_machineLearning.setForeground(new java.awt.Color(0, 153, 51));
        chk_machineLearning.setText("Machine Learning");

        chk_games.setBackground(new java.awt.Color(255, 255, 255));
        chk_games.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_games.setForeground(new java.awt.Color(0, 153, 51));
        chk_games.setText("Desenvolvimento de Games");

        chk_dataScience.setBackground(new java.awt.Color(255, 255, 255));
        chk_dataScience.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_dataScience.setForeground(new java.awt.Color(0, 153, 51));
        chk_dataScience.setText("Data Science");

        data_bancoDados.setBackground(new java.awt.Color(255, 255, 255));
        data_bancoDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        data_bancoDados.setForeground(new java.awt.Color(0, 153, 51));
        data_bancoDados.setText("Banco de dados");

        chk_estDeDados.setBackground(new java.awt.Color(255, 255, 255));
        chk_estDeDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_estDeDados.setForeground(new java.awt.Color(0, 153, 51));
        chk_estDeDados.setText("Estruturas de dados");

        chik_c.setBackground(new java.awt.Color(255, 255, 255));
        chik_c.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chik_c.setForeground(new java.awt.Color(0, 153, 51));
        chik_c.setText("C");

        btn_salvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(0, 102, 51));
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_chkLayout = new javax.swing.GroupLayout(painel_chk);
        painel_chk.setLayout(painel_chkLayout);
        painel_chkLayout.setHorizontalGroup(
            painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_chkLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_html)
                    .addGroup(painel_chkLayout.createSequentialGroup()
                        .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(painel_chkLayout.createSequentialGroup()
                                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_pyton)
                                    .addComponent(chk_js))
                                .addGap(42, 42, 42)
                                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_css)
                                    .addComponent(chik_c)))
                            .addComponent(chk_java)
                            .addComponent(chk_php)
                            .addComponent(chk_cScharp))
                        .addGap(46, 46, 46)
                        .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(painel_chkLayout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(btn_salvar))
                            .addGroup(painel_chkLayout.createSequentialGroup()
                                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_desAndroid)
                                    .addComponent(chk_desIos)
                                    .addComponent(chk_machineLearning)
                                    .addComponent(chk_estDeDados)
                                    .addComponent(data_bancoDados))
                                .addGap(18, 18, 18)
                                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_dataScience)
                                    .addComponent(chk_games))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_chkLayout.setVerticalGroup(
            painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_chkLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_pyton)
                    .addComponent(chk_css)
                    .addComponent(chk_desAndroid)
                    .addComponent(chk_games))
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_js)
                    .addComponent(chk_desIos)
                    .addComponent(chk_dataScience)
                    .addComponent(chik_c))
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_java)
                    .addComponent(data_bancoDados))
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_php)
                    .addComponent(chk_estDeDados))
                .addGap(18, 18, 18)
                .addGroup(painel_chkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_cScharp)
                    .addComponent(chk_machineLearning))
                .addGap(18, 18, 18)
                .addComponent(chk_html)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel_chk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_chk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        // Cria a lista
        List<AreaInteresse> lista = new ArrayList<>();
        // Instancia 
        AreaInteresseDAO daoAI = new AreaInteresseDAO();

        for (Component c : painel_chk.getComponents()) {

            if (c instanceof JCheckBox) {

                if (((JCheckBox) c).isSelected()) {

                    AreaInteresse ai = new AreaInteresse();
                    ai.setId_area_interesse(getAreaInteresse(((JCheckBox) c).getText()));
                    ai.setProfessor_id(professor.getCodigo());
                    lista.add(ai);
                }

            }

        }

        if (!lista.isEmpty()) {
            daoAI.deletarAreaInteresse(professor);
            daoAI.cadastrarAreaInteresse(lista);
            atualizarCkbox();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione ao menus uma área de interesse.");
        }

    }//GEN-LAST:event_btn_salvarActionPerformed

    
    public void atualizarCkbox() {
        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando Áreas de interesse...");
        loading.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                // Carrega área de interesse do professor

                AreaInteresseDAO dao = new AreaInteresseDAO();

                List<AreaInteresse> lista = dao.PegaAreaInteresseProfessor(professor);

                for (AreaInteresse ai : lista) {

                    for (Component c : painel_chk.getComponents()) {

                        if (c instanceof JCheckBox) {

                            if (((JCheckBox) c).getText().equals(ai.getNome())) {

                                ((JCheckBox) c).setSelected(true);

                            }

                        }

                    }

                }
                loading.dispose();
            }

        };

        t.start();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        atualizarCkbox();


    }//GEN-LAST:event_formWindowOpened

    // Método recebe uma String com a área de interese e retorna seu ID
    public int getAreaInteresse(String areaInteresse) {

        String[] areas = {"Python", "JavaScript", "Java", "PHP", "C#",
            "HTML", "CSS", "C", "Desenvolvimento Android", "Desenvolvimento iOS",
            "Banco de dados", "Estrutura de dados", "Machine Learning",
            "Desenvolvimento de Games", "Data Science"};
        int i;
        for (i = 0; i <= areas.length - 1; i++) {
            if (areas[i] == areaInteresse) {
                break;
            }
        }
        return i+1;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAreaInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAreaInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAreaInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAreaInteresse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAreaInteresse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JCheckBox chik_c;
    private javax.swing.JCheckBox chk_cScharp;
    private javax.swing.JCheckBox chk_css;
    private javax.swing.JCheckBox chk_dataScience;
    private javax.swing.JCheckBox chk_desAndroid;
    private javax.swing.JCheckBox chk_desIos;
    private javax.swing.JCheckBox chk_estDeDados;
    private javax.swing.JCheckBox chk_games;
    private javax.swing.JCheckBox chk_html;
    private javax.swing.JCheckBox chk_java;
    private javax.swing.JCheckBox chk_js;
    private javax.swing.JCheckBox chk_machineLearning;
    private javax.swing.JCheckBox chk_php;
    private javax.swing.JCheckBox chk_pyton;
    private javax.swing.JCheckBox data_bancoDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painel_chk;
    // End of variables declaration//GEN-END:variables
}
