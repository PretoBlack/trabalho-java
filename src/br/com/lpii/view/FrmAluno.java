/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.AlunoDAO;
import br.com.lpii.dao.PropostaDAO;
import br.com.lpii.model.Aluno;
import br.com.lpii.model.Proposta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class FrmAluno extends javax.swing.JFrame {

    private Aluno aluno;
    private Proposta proposta;

    /**
     * Método construtor
     */
    public FrmAluno() {
        initComponents();
        label_proposta.setEnabled(false);
        txt_proposta.setEnabled(false);
        gerenciaCampos("block");
        gerenciaBotoes(true, false, false, false);

    }

    /**
     * Método para gerenciar campos bloquear - block | desbloquear unblock
     * limpar - clean
     */
    public void gerenciaCampos(String action) {
        switch (action) {
            case "block":
                txt_matricula.setEnabled(false);
                txt_nome.setEnabled(false);
                txt_cpf.setEnabled(false);
                txt_email.setEnabled(false);
                txt_celular.setEnabled(false);
                txt_senha.setEnabled(false);
                txt_confirmaSenha.setEnabled(false);
                break;
            case "unblock":
                txt_matricula.setEnabled(true);
                txt_nome.setEnabled(true);
                txt_cpf.setEnabled(true);
                txt_email.setEnabled(true);
                txt_celular.setEnabled(true);
                txt_senha.setEnabled(true);
                txt_confirmaSenha.setEnabled(true);
                break;
            case "clean":
                txt_matricula.setText("");
                txt_nome.setText("");
                txt_cpf.setText("");
                txt_email.setText("");
                txt_celular.setText("");
                txt_pesquisar.setText("");
                txt_senha.setText("");
                txt_confirmaSenha.setText("");
                break;
        }
    }

    // Função para verificar se todos os campos estão preenchidos
    public boolean temCamposVazios() {

        if (txt_matricula.getText().trim().equals("")
                || txt_nome.getText().trim().equals("")
                || txt_cpf.getText().equals("    .     .     -   ")
                || txt_email.getText().trim().equals("")
                || txt_celular.getText().equals("(    )       -     ")
                || String.valueOf(txt_senha.getPassword()).trim().equals("")
                || String.valueOf(txt_confirmaSenha.getPassword()).trim().equals("")) {

            JOptionPane.showMessageDialog(null, "Todos os campos precisam estar preenchidos");
            return true;

        }

        return false;

    }

    /**
     * Métodos para gerenciar botões
     */
    public void gerenciaBotoes(boolean novo, boolean salvar, boolean editar, boolean excluir) {
        btn_novo.setEnabled(novo);
        btn_salvar.setEnabled(salvar);
        btn_editar.setEnabled(editar);
        btn_excluir.setEnabled(excluir);
    }

    /**
     * Método para garantir que não vá número no campo matrícula
     */
    public void ValidaNumero(JTextField matrícula) {
        long valor;
        if (matrícula.getText().length() != 0) {
            try {
                valor = Long.parseLong(matrícula.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Campo matrícula só aceita números", "Informação", JOptionPane.INFORMATION_MESSAGE);
                matrícula.grabFocus();
                txt_matricula.setText("");
            }
        }
    }

    /**
     * Método responsável por carregar dados para tabela alunos
     */
    public void toList() {
        // Instancia objeto DAO
        AlunoDAO dao = new AlunoDAO();
        // Armazena em uma lista o retorno do método listarAlunos
        List<Aluno> lista = dao.listarAlunos();
        // Cria o DefaultTableModel para armazenar os dados que serão exibidos na tabela
        DefaultTableModel dados = (DefaultTableModel) tbl_aluno.getModel();
        // limpa dados da tabela
        dados.setNumRows(0);

        // cada ocorrência em lista irá para um objeto aluno
        for (Aluno a : lista) {
            // E agora será adicionado a lista na tabela. Linha a linha
            dados.addRow(new Object[]{
                a.getMatricula(),
                a.getNome(),
                a.getCpf(),
                a.getEmail(),
                a.getTelefone(),
                a.getProposta()
            });
        }

    }

    public void ativaInfComplementares() {
        label_proposta.setText("Situação do Tema do TC: ");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_proposta = new javax.swing.JTextField();
        label_proposta = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        txt_confirmaSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_pesquisar = new javax.swing.JTextField();
        btn_consulta_pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_aluno = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");
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
        jLabel1.setText("Cadastro de Aluno:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 51));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Matrícula*:");

        txt_matricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_matricula.setForeground(new java.awt.Color(0, 102, 51));
        txt_matricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_matriculaFocusLost(evt);
            }
        });

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(0, 102, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Nome*:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Email*:");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 102, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Celular*:");

        txt_celular.setForeground(new java.awt.Color(0, 102, 51));
        try {
            txt_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("( ## ) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("CPF*:");

        txt_cpf.setForeground(new java.awt.Color(0, 102, 51));
        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### . ### . ### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imformações Complementares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        label_proposta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_proposta.setForeground(new java.awt.Color(0, 102, 51));
        label_proposta.setText("Situação do Tema do TC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label_proposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_proposta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_proposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_proposta))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txt_senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_senha.setForeground(new java.awt.Color(0, 102, 51));

        txt_confirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_confirmaSenha.setForeground(new java.awt.Color(0, 102, 51));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Senha*:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Confirmar senha*:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("* Campos obrigatórios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 300, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do aluno", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txt_pesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pesquisar.setForeground(new java.awt.Color(153, 153, 153));
        txt_pesquisar.setText("Digite uma matrícula ou nome");
        txt_pesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pesquisarFocusLost(evt);
            }
        });

        btn_consulta_pesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_consulta_pesquisar.setForeground(new java.awt.Color(0, 102, 51));
        btn_consulta_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btn_consulta_pesquisar.setText("Pesquisar");
        btn_consulta_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consulta_pesquisarActionPerformed(evt);
            }
        });

        tbl_aluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_aluno.setForeground(new java.awt.Color(0, 153, 51));
        tbl_aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "CPF", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_aluno.setGridColor(new java.awt.Color(153, 153, 153));
        tbl_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_aluno);
        if (tbl_aluno.getColumnModel().getColumnCount() > 0) {
            tbl_aluno.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_aluno.getColumnModel().getColumn(1).setPreferredWidth(140);
            tbl_aluno.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbl_aluno.getColumnModel().getColumn(3).setPreferredWidth(140);
            tbl_aluno.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consulta_pesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consulta_pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        jTabbedPane1.addTab("Consulta de alunos", jPanel4);

        btn_novo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(0, 102, 51));
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(0, 102, 51));
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(0, 102, 51));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(0, 102, 51));
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_editar, btn_excluir, btn_novo, btn_salvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_editar)
                    .addComponent(btn_excluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_editar, btn_excluir, btn_novo, btn_salvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // Verifica se há algum campo não preenchido
        if (!temCamposVazios()) {

            // lógica Verificará se usuário existe no banco de dados
            // Se sim será invocado método para edição
            // caso contrário será realizado novo cadastro
            /**
             * Instancia objeto da classe AlunoDao Já é aberta a conexão a
             * partir do construtor
             */
            AlunoDAO dao = new AlunoDAO();

            // Verifica se já exite o ID
            if (dao.verificaAluno(Integer.parseInt(txt_matricula.getText()))) {

                // Se o ID existe, confirme que o usuário quer alterar o cliente
                int edita = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja alterar o aluno " + txt_matricula.getText() + "?");

                // Se sim realiza a edição
                if (edita == 0) {

                    // verifica se a senha e a confirmação são iguais
                    if (String.valueOf(txt_senha.getPassword()).equals(String.valueOf(txt_confirmaSenha.getPassword()))) {

                        /**
                         * Ação responsável por Editar Aluno alterar dados no
                         * objeto aluno
                         */
                        Aluno aluno = new Aluno();

                        aluno.setMatricula(Integer.parseInt(txt_matricula.getText()));
                        aluno.setNome(txt_nome.getText());
                        aluno.setCpf(txt_cpf.getText());
                        aluno.setEmail(txt_email.getText());
                        aluno.setTelefone(txt_celular.getText());
                        aluno.setSenha(String.valueOf(txt_senha.getPassword()));

                        /**
                         * Método que irá salvar o obj Aluno no banco de dados
                         */
                        dao.alterarAluno(aluno);

                        /**
                         * Atualiza table aluno após a edição
                         */
                        toList();

                        // limpa campos e gerencia botões
                        gerenciaCampos("block");
                        gerenciaCampos("clean");
                        gerenciaBotoes(true, false, false, false);

                    } else {

                        JOptionPane.showMessageDialog(null, "Senhas não conferem!");
                    }

                }

            } else {

                // verifica se a senha e a confirmação são iguais
                if (String.valueOf(txt_senha.getPassword()).equals(String.valueOf(txt_confirmaSenha.getPassword()))) {

                    // Ação responsável por salvar no banco de dados
                    /**
                     * insere dados no objeto aluno
                     */
                    Aluno aluno = new Aluno();
                    aluno.setMatricula(Integer.parseInt(txt_matricula.getText()));
                    aluno.setNome(txt_nome.getText());
                    aluno.setCpf(txt_cpf.getText());
                    aluno.setEmail(txt_email.getText());
                    aluno.setTelefone(txt_celular.getText());
                    aluno.setSenha(String.valueOf(txt_senha.getPassword()));
                    /**
                     * Método que irá salbar o obj Aluno no banco de dados
                     */
                    dao.cadastrarAluno(aluno);

                    /**
                     * Limpa os campos do formulário
                     */
                    gerenciaCampos("clean");
                    gerenciaCampos("block");
                    gerenciaBotoes(true, false, false, false);

                } else {

                    JOptionPane.showMessageDialog(null, "Senhas não conferem!");
                }

            }

            FrmLoading loading = new FrmLoading();
            loading.setLabel("Carregando propostas...");
            loading.setVisible(true);

            Thread t = new Thread() {
                public void run() {
                    // Lista todoas as propostas do professor
                    toList();
                    loading.dispose();
                    // direciona para a lista de alunos após atualizar
                    jTabbedPane1.setSelectedIndex(1);
                }

            };

            t.start();

        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // Caso esteja na aba da lista, direciona para aba do formulário
        if (jTabbedPane1.getSelectedIndex() == 1) jTabbedPane1.setSelectedIndex(0);
        // Libera os campos para preenchimento dos dados do aluno
        gerenciaCampos("unblock");
        gerenciaCampos("clean");
        // libera o botão salvar e obloqueia os demais
        gerenciaBotoes(true, true, false, false);
        // Foco no campo matrícula
        txt_matricula.requestFocus();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void tbl_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alunoMouseClicked

        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando Aluno...");
        loading.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                // Verifica se foi disparado duplo click sobre uma linha da tabela
                if (evt.getClickCount() == 2) {

                    // Comando para carregar para outra aba
                    jTabbedPane1.setSelectedIndex(0);

                }

                // Pega os dados e envia para o formulário de clientes
                String matricula = tbl_aluno.getValueAt(tbl_aluno.getSelectedRow(), 0).toString();

                AlunoDAO dao = new AlunoDAO();

                Aluno aluno = dao.getAluno(Integer.parseInt(matricula));
                PropostaDAO daoP = new PropostaDAO();
                proposta = daoP.getPropostaAluno(aluno);

                aluno.setProposta(proposta);

                txt_matricula.setText(String.valueOf(aluno.getMatricula()));
                txt_nome.setText(aluno.getNome());
                txt_cpf.setText(aluno.getCpf());
                txt_email.setText(aluno.getEmail());
                txt_celular.setText(aluno.getTelefone());
                txt_senha.setText(aluno.getSenha());
                txt_confirmaSenha.setText(aluno.getSenha());
                txt_proposta.setText(
                        (aluno.getProposta().getPropostaStatus() == null) ? "Não selecionado" : aluno.getProposta().getPropostaStatus()
                );

                gerenciaBotoes(true, false, true, true);
                loading.dispose();

                // Comando para carregar para outra aba
                jTabbedPane1.setSelectedIndex(0);

            }

        };

        t.start();


    }//GEN-LAST:event_tbl_alunoMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        // Verifica se botão está sendo pressionado na aba dados ou busca
        if (jTabbedPane1.getSelectedIndex() == 1) {
            // se na aba busca apenas direciona para a aba dados
            jTabbedPane1.setSelectedIndex(0);
            gerenciaCampos("unblock");
            gerenciaBotoes(true, true, false, true);
        } else if (jTabbedPane1.getSelectedIndex() == 0 && !txt_nome.isEnabled()) {

            // Libera campos e botões
            gerenciaCampos("unblock");
            gerenciaBotoes(true, true, false, true);
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        /**
         * Ação responsável por excluir Aluno insere dados no objeto aluno
         */
        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(txt_matricula.getText()));

        /**
         * Instancia objeto da classe AlunoDao Já é aberta a conexão a partir do
         * construtor
         */
        AlunoDAO dao = new AlunoDAO();

        /**
         * Método que irá salbar o obj Aluno no banco de dados
         */
        dao.excluirAluno(aluno);

        /**
         * Atualiza table aluno após a edição
         */
        toList();
        gerenciaCampos("clean");
        // Comando para carregar para outra aba
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void txt_matriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_matriculaFocusLost
        ValidaNumero(txt_matricula);

    }//GEN-LAST:event_txt_matriculaFocusLost

    private void btn_consulta_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consulta_pesquisarActionPerformed
        // Crio o parâmetro que será utilizado na busca
        String param = "%" + txt_pesquisar.getText() + "%";

        // Instancia objeto DAO
        AlunoDAO dao = new AlunoDAO();
        // Armazena em uma lista o retorno do método listarAlunos
        List<Aluno> lista = dao.buscaAlunos(param);
        // Cria o DefaultTableModel para armazenar os dados que serão exibidos na tabela
        DefaultTableModel dados = (DefaultTableModel) tbl_aluno.getModel();
        // limpa dados da tabela
        dados.setNumRows(0);

        // cada ocorrência em lista irá para um objeto aluno
        for (Aluno a : lista) {
            // E agora será adicionado a lista na tabela. Linha a linha
            dados.addRow(new Object[]{
                a.getMatricula(),
                a.getNome(),
                a.getCpf(),
                a.getEmail(),
                a.getTelefone(),
                a.getProposta()
            });
        }
    }//GEN-LAST:event_btn_consulta_pesquisarActionPerformed

    private void txt_pesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pesquisarFocusGained
        if (!txt_pesquisar.getText().equals("") && txt_pesquisar.getText().equals("Digite uma matrícula ou nome")) {
            txt_pesquisar.setText("");
        }
    }//GEN-LAST:event_txt_pesquisarFocusGained

    private void txt_pesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pesquisarFocusLost
        if (txt_pesquisar.getText().equals("")) {
            txt_pesquisar.setText("Digite uma matrícula ou nome");
            toList();
        }
    }//GEN-LAST:event_txt_pesquisarFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /**
         * Evento responsável por carregar os dados para a tabela de aluno. O
         * método é disparado no momento em que o formulário é ativado
         */

        toList();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulta_pesquisar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_proposta;
    private javax.swing.JTable tbl_aluno;
    private javax.swing.JFormattedTextField txt_celular;
    private javax.swing.JPasswordField txt_confirmaSenha;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_proposta;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
