/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.util.ArrayList;
import javax.swing.JList;
import classes.Aluno;

/**
 *
 * @author Rafa
 */
public class JanelaListaAlunos extends javax.swing.JFrame {

    /**
     * Creates new form JanelaListaAlunos
     */
    private ArrayList<Aluno> alunos;
    private ArrayList<Aluno> alunosBusca;
    private String[] nomes;

    public JanelaListaAlunos(ArrayList<Aluno> a) {
        this.alunos = a;

        this.nomes = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            this.nomes[i] = a.get(i).getNome();
        }
        this.sortStringBubble(nomes);
        initComponents();
        this.setVisible(true);
    }

    private void sortStringBubble(String x[]) { // ARRUMAR BUG ARRAYLIST
        int j;
        boolean flag = true;
        String aux;
        Aluno a;
        while (flag) {
            flag = false;
            for (j = 0; j < x.length - 1; j++) {
                if (x[j].compareToIgnoreCase(x[j + 1]) > 0) {
                    aux = x[j];
                    a = alunos.get(j);
                    x[j] = x[j + 1];
                    alunos.set(j, alunos.get(j + 1));
                    x[j + 1] = aux;
                    alunos.set(j + 1, a);
                    flag = true;
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaAlunos = new javax.swing.JList<>();
        jButtonBuscarNome = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonBuscarMatricula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListBusca = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        this.listaAlunos = new JList(this.nomes);
        listaAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaAlunos);
        listaAlunos.getAccessibleContext().setAccessibleName("");

        jButtonBuscarNome.setText("Buscar");
        jButtonBuscarNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarNomeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por nome");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por Matricula");

        jButtonBuscarMatricula.setText("Buscar");
        jButtonBuscarMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMatriculaMouseClicked(evt);
            }
        });

        jListBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        this.jListBusca.setVisible(false);
        jListBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListBuscaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListBusca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarNome)
                            .addComponent(jButtonBuscarMatricula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButtonBuscarNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarMatricula))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAlunosMouseClicked
        System.out.println(this.listaAlunos.getAnchorSelectionIndex());
        JanelaAlunoInfo alunoInfo = new JanelaAlunoInfo(this.alunos.get(this.listaAlunos.getAnchorSelectionIndex()));
        alunoInfo.mostraJanela();
    }//GEN-LAST:event_listaAlunosMouseClicked

    private void jButtonBuscarNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarNomeMouseClicked

        ArrayList<String> listastr = new ArrayList();
        this.alunosBusca = new ArrayList();
        for (Aluno a : this.alunos) {
            if (a.getNome().contains(this.jTextFieldNome.getText())) {
                listastr.add(a.getNome());
                this.alunosBusca.add(a);
            }
        }
        String[] nomes = listastr.toArray(new String[listastr.size()]);
        this.jListBusca.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() {
                return nomes.length;
            }

            public String getElementAt(int i) {
                return nomes[i];
            }
        });
        this.jListBusca.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarNomeMouseClicked

    private void jListBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBuscaMouseClicked
        // Seleciona aluno na lista e abre janela com informações sobre o aluno cadastrado.
        System.out.println(this.listaAlunos.getAnchorSelectionIndex());
        JanelaAlunoInfo alunoInfo = new JanelaAlunoInfo(this.alunosBusca.get(this.jListBusca.getAnchorSelectionIndex()));
        alunoInfo.mostraJanela();
    }//GEN-LAST:event_jListBuscaMouseClicked

    private void jButtonBuscarMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMatriculaMouseClicked
        // TODO add your handling code here:
        JanelaAlunoInfo alunoInfo;
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula().equals(this.jTextFieldMatricula.getText())) {
                alunoInfo = new JanelaAlunoInfo(aluno);
                break;
            }
        }
    }//GEN-LAST:event_jButtonBuscarMatriculaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMatricula;
    private javax.swing.JButton jButtonBuscarNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListBusca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JList<String> listaAlunos;
    // End of variables declaration//GEN-END:variables

}
