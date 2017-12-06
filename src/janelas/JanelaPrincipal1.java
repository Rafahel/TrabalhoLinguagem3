/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import janelas.JanelaListaAlunos;
import janelas.JanelaCadastroAlunos;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import classes.Aluno;
import classes.Componente;
import classes.Emprestimo;
import classes.Placa;
import classes.Robo;

/**
 *
 * @author Rafa
 */
public class JanelaPrincipal1 extends javax.swing.JFrame {
    
    private ArrayList<Aluno> alunos;
    private ArrayList<Componente> componentes;
    private ArrayList<Robo> robos;
    private ArrayList<Emprestimo> emprestimos;
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal1() {
        this.alunos = new ArrayList();
        this.componentes = new ArrayList();
        this.robos = new ArrayList();
        this.emprestimos = new ArrayList();
        this.addAlunosTeste();
        this.addComponentesTeste();
        initComponents();
        this.DEBUG.setVisible(false);
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

        jButtonCadastrarAluno = new javax.swing.JButton();
        this.jButtonCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student-of-stick-man-sitting-on-a-chair-on-class-desk.png")));
        jButtonListaAlunos = new javax.swing.JButton();
        this.jButtonListaAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pessoas.png")));

        jButtonCadastroComponente = new javax.swing.JButton();
        this.jButtonCadastroComponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente.png")));

        DEBUG = new javax.swing.JButton();
        jButtonCadastroRobo = new javax.swing.JButton();
        this.jButtonCadastroRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robot.png")));

        jButtonCadastroPlaca = new javax.swing.JButton();
        this.jButtonCadastroPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/processor.png")));

        jButtonListaComponentes = new javax.swing.JButton();
        this.jButtonListaComponentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list.png")));

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonCadastrarAluno.setText("          Cadastrar Aluno");
        jButtonCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastrarAlunoMouseClicked(evt);
            }
        });

        jButtonListaAlunos.setText("          Lista Alunos");
        jButtonListaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonListaAlunosMouseClicked(evt);
            }
        });

        jButtonCadastroComponente.setText("  Cadastrar Componente");
        jButtonCadastroComponente.setActionCommand("         Cadastrar Componente");
        jButtonCadastroComponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastroComponenteMouseClicked(evt);
            }
        });

        DEBUG.setText("Debug");
        DEBUG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEBUGMouseClicked(evt);
            }
        });

        jButtonCadastroRobo.setText("Cadastrar Robo");
        jButtonCadastroRobo.setActionCommand("          Cadastrar Robo");
        jButtonCadastroRobo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastroRoboMouseClicked(evt);
            }
        });

        jButtonCadastroPlaca.setText("Cadastrar Placa");
        jButtonCadastroPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastroPlacaMouseClicked(evt);
            }
        });

        jButtonListaComponentes.setText("          Lista Componentes");
        jButtonListaComponentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonListaComponentesMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("LABORATORIO SISTEMAS DIGITAIS");

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(DEBUG, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastroComponente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonListaAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastroRobo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastroPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonListaComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonCadastroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListaComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DEBUG)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarAlunoMouseClicked
        // TODO add your handling code here:
        JanelaCadastroAlunos cadastro = new JanelaCadastroAlunos(this.alunos);
        
    }//GEN-LAST:event_jButtonCadastrarAlunoMouseClicked

    private void DEBUGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEBUGMouseClicked
        try{
            System.out.println("Quantidade de alunos: " + this.alunos.size());
            System.out.println("Quantidade de componentes: " + this.componentes.size());
                        
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DEBUGMouseClicked

   
    
    
    private void jButtonListaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListaAlunosMouseClicked
        JanelaListaAlunos listaAlunos = new JanelaListaAlunos(this.alunos);
    }//GEN-LAST:event_jButtonListaAlunosMouseClicked

    private void jButtonCadastroComponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastroComponenteMouseClicked
        // TODO add your handling code here:
        JanelaCadastroComponentes cadastroItems = new JanelaCadastroComponentes(this.componentes);  
    }//GEN-LAST:event_jButtonCadastroComponenteMouseClicked

    private void jButtonCadastroRoboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastroRoboMouseClicked
        JanelaCadastroRobo cr = new JanelaCadastroRobo(this.componentes, this.robos);
    }//GEN-LAST:event_jButtonCadastroRoboMouseClicked

    private void jButtonCadastroPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastroPlacaMouseClicked
        JanelaCadastroPlacas cp = new JanelaCadastroPlacas(this.componentes);
    }//GEN-LAST:event_jButtonCadastroPlacaMouseClicked

    private void jButtonListaComponentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListaComponentesMouseClicked
        JanelaListaComponentes jlc = new JanelaListaComponentes(this.componentes);
    }//GEN-LAST:event_jButtonListaComponentesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JanelaEmprestimo je =  new JanelaEmprestimo(this.alunos, this.componentes, this.robos, this.emprestimos);
        
    }//GEN-LAST:event_jButton1MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEBUG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrarAluno;
    private javax.swing.JButton jButtonCadastroComponente;
    private javax.swing.JButton jButtonCadastroPlaca;
    private javax.swing.JButton jButtonCadastroRobo;
    private javax.swing.JButton jButtonListaAlunos;
    private javax.swing.JButton jButtonListaComponentes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
