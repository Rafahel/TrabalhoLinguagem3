/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import classes.Aluno;
import classes.Componente;
import classes.Emprestimo;
import classes.Robo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Rafa
 */
public class JanelaEmprestimo extends javax.swing.JFrame {

    private ArrayList<Aluno> alunos;
    private ArrayList<Componente> componentes;
    private ArrayList<Robo> robos;
    private ArrayList<Emprestimo> emprestimos;
    private String[] compNomes;
    private String[] roboNomes;
    private ArrayList<Componente> componentesAdicionados;
    private ArrayList<Componente> componentesEmprestados;
    private ArrayList<Robo> robosEmprestados;
    DefaultListModel<String> modelA;
    DefaultListModel<String> modelB;
    public JanelaEmprestimo(ArrayList<Aluno> alunos, ArrayList<Componente> componentes, ArrayList<Robo> robos, ArrayList<Emprestimo> emprestimos ) {
        this.alunos = alunos;
        this.componentes = componentes;
        this.robos = robos;
        this.emprestimos = emprestimos;
        this.compNomes = new String[this.componentes.size()];
        this.roboNomes = new String[this.componentes.size()];
        this.componentesAdicionados = new ArrayList();
        this.modelA = new DefaultListModel<>();
        this.modelB = new DefaultListModel<>();
        this.componentesEmprestados = new ArrayList();
        this.robosEmprestados = new ArrayList();
        inicializaStrings();
        this.sortStringBubble(compNomes, compNomes);
        initComponents();
        this.setVisible(true);
    }

    private void inicializaStrings(){
        for (int i = 0; i < componentes.size(); i++) {
            this.compNomes[i] = this.componentes.get(i).getNome();
            
        }
        for (int i = 0; i < robos.size(); i++) {
            this.roboNomes[i] = this.robos.get(i).getNome();
            
        }
    }
    private void sortStringBubble(String x[], String y[]) { // ARRUMAR BUG ARRAYLIST
        int j;
        boolean flag = true;
        String aux;
        Componente componente;
        while (flag) {
            flag = false;
            for (j = 0; j < x.length - 1; j++) {
                if (x[j].compareToIgnoreCase(x[j + 1]) > 0) {
                    aux = x[j];
                    componente = this.componentes.get(j);
                    x[j] = x[j + 1];
                    this.componentes.set(j, this.componentes.get(j + 1));
                    x[j + 1] = aux;
                    this.componentes.set(j + 1, componente);
                    flag = true;
                }
            }
        }
        flag = true;
        aux = null;
        Robo robo;
        while (flag) {
            flag = false;
            for (j = 0; j < y.length - 1; j++) {
                if (y[j].compareToIgnoreCase(y[j + 1]) > 0) {
                    aux = y[j];
                    robo = this.robos.get(j);
                    y[j] = y[j + 1];
                    this.robos.set(j, this.robos.get(j + 1));
                    y[j + 1] = aux;
                    this.robos.set(j + 1, robo);
                    flag = true;
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jListComponentes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListRobos = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEmprestados = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jListComponentes  = new JList(this.compNomes);
        jListComponentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListComponentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListComponentesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListComponentes);

        this.jListRobos  = new JList(this.roboNomes);
        jListRobos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListRobosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jListRobos);

        jListEmprestados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListEmprestados);

        jButton1.setText("Realizar emprestimo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Aluno:");

        jLabel2.setText("Componentes");

        jLabel3.setText("Robos");

        jLabel4.setText("Emprestados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jButton1)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel2)
                .addGap(169, 169, 169)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListComponentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListComponentesMouseClicked
        try{
            System.out.println(this.componentes.size());
            this.componentesEmprestados.add(this.componentes.get(this.jListComponentes.getAnchorSelectionIndex()));
            this.componentesAdicionados.add(this.componentes.get(this.jListComponentes.getAnchorSelectionIndex()));
            System.out.println("Adicionado " + this.componentes.get(this.jListComponentes.getAnchorSelectionIndex()).getNome());
            System.out.println(this.componentesAdicionados.size());
            String[] comp = new String[this.componentesAdicionados.size()];
            int j = 0;
            for (Componente c : this.componentesAdicionados) {
                comp[j] = c.getNome();
                j++;
                System.out.println("s");
            }
            
            this.modelA.clear();
            System.out.println(comp.length);
            
            for( int i = 0; i < comp.length ; i++ ){
                
              this.modelA.addElement( comp[i] );
                
            }
            this.jListEmprestados.setModel(modelA);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro tamanho array");
        }
    }//GEN-LAST:event_jListComponentesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
            Aluno a = null;
            boolean encontrado = false;
            for (Aluno aluno : alunos) {
                if(aluno.getNome().equals(this.jTextFieldNomeAluno.getText())){
                    a = aluno;
                    encontrado = true;
                    break;
                }
            }
            if(encontrado)
                this.emprestimos.add(new Emprestimo(a, this.componentesEmprestados, this.robosEmprestados, "Data", false ));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jListRobosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListRobosMouseClicked
         try{
            System.out.println(this.componentes.size());
            this.robosEmprestados.add(this.robos.get(this.jListRobos.getAnchorSelectionIndex()));
            
            
           
            String[] comp = new String[this.robosEmprestados.size()];
            int j = 0;
            for (Robo r : this.robosEmprestados) {
                comp[j] = r.getNome();
                j++;
                
            }
            
            this.modelB.clear();
                       
            for( int i = 0; i < comp.length ; i++ ){
                
              this.modelB.addElement( comp[i] );
                
            }
            this.jListEmprestados.setModel(modelB);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro tamanho array");
        }
    }//GEN-LAST:event_jListRobosMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListComponentes;
    private javax.swing.JList<String> jListEmprestados;
    private javax.swing.JList<String> jListRobos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldNomeAluno;
    // End of variables declaration//GEN-END:variables
}
