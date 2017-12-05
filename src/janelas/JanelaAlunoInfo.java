/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import classes.Aluno;

/**
 *
 * @author Rafa
 */
public class JanelaAlunoInfo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaAlunoInfo
     */
    Aluno aluno;
    public JanelaAlunoInfo(Aluno aluno) {
        this.aluno = aluno;
        initComponents();
        
    }
    
    public void mostraJanela(){
        this.setVisible(true);
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
        jlabelNome = new javax.swing.JLabel();
        jlabelIdade = new javax.swing.JLabel();
        jlabelMatricula = new javax.swing.JLabel();
        jlabelSemestre = new javax.swing.JLabel();
        jlabelSexo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabelCurso = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlabelEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("DADOS DO ALUNO");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Idade:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Curso:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Semestre:");

        jlabelNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelNome.setText("jLabel6");
        jlabelNome.setText(this.aluno.getNome());

        jlabelIdade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelIdade.setText("jLabel7");
        jlabelIdade.setText(Integer.toString(this.aluno.getIdade()));

        jlabelMatricula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelMatricula.setText("jLabel8");
        jlabelMatricula.setText(this.aluno.getMatricula());

        jlabelSemestre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelSemestre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelSemestre.setText("jLabel9");
        jlabelSemestre.setText(Integer.toString(this.aluno.getSemestre()));

        jlabelSexo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelSexo.setText("jLabel10");
        jlabelSexo.setText(Character.toString(this.aluno.getSexo()));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Matricula:");

        jlabelCurso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelCurso.setText("jLabel7");
        jlabelCurso.setText(this.aluno.getCurso());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email:");

        jlabelEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelEmail.setText("jLabel8");
        jlabelEmail.setText(this.aluno.getEmail());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelEmail)
                    .addComponent(jlabelSemestre)
                    .addComponent(jlabelIdade)
                    .addComponent(jlabelNome)
                    .addComponent(jlabelSexo)
                    .addComponent(jlabelMatricula)
                    .addComponent(jlabelCurso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelNome)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlabelIdade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlabelSexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlabelCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlabelSemestre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlabelMatricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jlabelEmail))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlabelCurso;
    private javax.swing.JLabel jlabelEmail;
    private javax.swing.JLabel jlabelIdade;
    private javax.swing.JLabel jlabelMatricula;
    private javax.swing.JLabel jlabelNome;
    private javax.swing.JLabel jlabelSemestre;
    private javax.swing.JLabel jlabelSexo;
    // End of variables declaration//GEN-END:variables
}
