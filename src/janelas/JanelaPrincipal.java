/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import janelas.JanelaListaAlunos;
import janelas.JanelaCadastroAlunos;
import java.util.ArrayList;
import trabalholinguagem3.Aluno;
import trabalholinguagem3.Componente;
import trabalholinguagem3.Placa;
import trabalholinguagem3.Robo;

/**
 *
 * @author Rafa
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private ArrayList<Aluno> alunos;
    private ArrayList<Componente> componentes;
    private ArrayList<Robo> robos;
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        this.alunos = new ArrayList();
        this.componentes = new ArrayList();
        this.robos = new ArrayList();
        this.addAlunosTeste();
        this.addComponentesTeste();
        initComponents();
        this.setVisible(true);
    }

    private void addAlunosTeste(){
        String[] nomes = {"Joao", "Alice", "Juca", "Inacio", "Jack", "Kate", "Hurley", "Sawyer", "Richard", "Jacob" };
        for (int i = 0; i < 10; i++) {
            this.alunos.add(new Aluno(nomes[i], i, 'M', i+"", i, "CC"));
        }
    }
    private void addComponentesTeste(){
        for (int i = 0; i < 10; i++) {
            this.componentes.add(new Componente("Componente " + i, "Tipo " + i, "Modelo " + i, "Descrição do componente atual " + i));
        }
        
        
        boolean t = false;
        for (int i = 0; i < 10; i++) {
            if(t){
                this.componentes.add(new Placa("Arduino", "UNO", "Descrição arduino UNO", "ATMEGA", 15, 5));
                t = false;
            }
            else{
                this.componentes.add(new Placa("Raspberry pi", "UNO", "Descrição arduino UNO", "ATMEGA", 15, 5));
                t = true;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cadastroComponente = new javax.swing.JButton();
        DEBUG = new javax.swing.JButton();
        botaoCadastroRobo = new javax.swing.JButton();
        botaoCadastroPlaca = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Cadastrar Aluno");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Lista Alunos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        cadastroComponente.setText("Cadastrar Componente");
        cadastroComponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroComponenteMouseClicked(evt);
            }
        });

        DEBUG.setText("Debug");
        DEBUG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEBUGMouseClicked(evt);
            }
        });

        botaoCadastroRobo.setText("Cadastrar Robo");
        botaoCadastroRobo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastroRoboMouseClicked(evt);
            }
        });

        botaoCadastroPlaca.setText("Cadastrar Placa");
        botaoCadastroPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastroPlacaMouseClicked(evt);
            }
        });

        jButton3.setText("Lista Componentes");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DEBUG, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroComponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadastroRobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadastroPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(cadastroComponente)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroRobo)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroPlaca)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(DEBUG)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JanelaCadastroAlunos cadastro = new JanelaCadastroAlunos(this.alunos);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void DEBUGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEBUGMouseClicked
        try{
            System.out.println("Quantidade de alunos: " + this.alunos.size());
            System.out.println("Quantidade de componentes: " + this.componentes.size());
                        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DEBUGMouseClicked

   
    
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JanelaListaAlunos listaAlunos = new JanelaListaAlunos(this.alunos);
    }//GEN-LAST:event_jButton2MouseClicked

    private void cadastroComponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroComponenteMouseClicked
        // TODO add your handling code here:
        JanelaCadastroComponentes cadastroItems = new JanelaCadastroComponentes(this.componentes);  
    }//GEN-LAST:event_cadastroComponenteMouseClicked

    private void botaoCadastroRoboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastroRoboMouseClicked
        JanelaCadastroRobo cr = new JanelaCadastroRobo(this.componentes, this.robos);
    }//GEN-LAST:event_botaoCadastroRoboMouseClicked

    private void botaoCadastroPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastroPlacaMouseClicked
        JanelaCadastroPlacas cp = new JanelaCadastroPlacas(this.componentes);
    }//GEN-LAST:event_botaoCadastroPlacaMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JanelaListaComponentes jlc = new JanelaListaComponentes(this.componentes);
    }//GEN-LAST:event_jButton3MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEBUG;
    private javax.swing.JButton botaoCadastroPlaca;
    private javax.swing.JButton botaoCadastroRobo;
    private javax.swing.JButton cadastroComponente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
