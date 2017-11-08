/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholinguagem3;

import javax.swing.JFrame;

/**
 *
 * @author Rafa
 */
public class JanelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCadastro
     */
    private Aluno aluno;
    private final JanelaPrincipal jan;
    public JanelaCadastro(JanelaPrincipal j) {
        this.jan = j;
        initComponents();
        this.setVisible(true);
        System.out.println("cosntrutor");
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldIdade = new javax.swing.JTextField();
        textFieldMatricula = new javax.swing.JTextField();
        textFieldSemestre = new javax.swing.JTextField();
        textFieldNome = new javax.swing.JTextField();
        checkMasculino = new javax.swing.JCheckBox();
        checkFeminino = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        checkComputacao = new javax.swing.JCheckBox();
        checkSistemas = new javax.swing.JCheckBox();
        botaoCadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Idade");

        jLabel3.setText("Sexo");

        jLabel4.setText("Matricula");

        jLabel5.setText("Semestre");

        checkMasculino.setSelected(true);
        checkMasculino.setText("Masculino");

        checkFeminino.setText("Feminino");

        jLabel6.setText("Curso");

        checkComputacao.setSelected(true);
        checkComputacao.setText("Ciencia da computação");
        checkComputacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkComputacaoMouseClicked(evt);
            }
        });

        checkSistemas.setText("Sistemas de Informação");
        checkSistemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkSistemasMouseClicked(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Cadastro de Alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkComputacao)
                    .addComponent(checkSistemas))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCadastrar)
                        .addGap(174, 174, 174))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldIdade)
                            .addComponent(textFieldMatricula)
                            .addComponent(textFieldSemestre)
                            .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkFeminino)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkMasculino)
                    .addComponent(checkFeminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkComputacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkSistemas)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkComputacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkComputacaoMouseClicked
        // TODO add your handling code here:
        if(checkSistemas.isSelected())
            checkSistemas.setSelected(false);
    }//GEN-LAST:event_checkComputacaoMouseClicked

    private void checkSistemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkSistemasMouseClicked
        // TODO add your handling code here:
        if(checkComputacao.isSelected())
            checkComputacao.setSelected(false);
    }//GEN-LAST:event_checkSistemasMouseClicked

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
        // TODO add your handling code here:
        
        try{
//            String nome = textFieldNome.getText();
//            int idade = Integer.parseInt(textFieldIdade.getText());
//            char sexo;
//            if(checkMasculino.isSelected())
//                sexo = 'M';
//            else
//                sexo = 'F';
//            String matricula = textFieldMatricula.getText();
//            int semestre = Integer.parseInt(textFieldSemestre.getText());
//            String curso;
//            if(checkComputacao.isSelected())
//                curso = "Ciencia da Computacao";
//            else
//                curso = "Sistemas de Informacao";
//            this.aluno = new Aluno(nome,  idade, sexo, "01", 7, "CC");
              this.aluno = new Aluno("1",  1, '1', "01", 7, "CC");
              jan.recebeAluno(this.aluno);
        }catch (NumberFormatException e){
//            System.out.println(e.getMessage());
              System.out.println("NumberFormat");
        }catch(Exception e){
//            System.out.println(e.getMessage());
              System.out.println("Erro...");
        }
        
        
    }//GEN-LAST:event_botaoCadastrarMouseClicked

    public Aluno retornaAluno(){
        return this.aluno;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JanelaCadastro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JCheckBox checkComputacao;
    private javax.swing.JCheckBox checkFeminino;
    private javax.swing.JCheckBox checkMasculino;
    private javax.swing.JCheckBox checkSistemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textFieldIdade;
    private javax.swing.JTextField textFieldMatricula;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldSemestre;
    // End of variables declaration//GEN-END:variables
}
