package janelas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import trabalholinguagem3.Componente;


public class ListaComponentes extends javax.swing.JFrame {
    
    private final ArrayList<Componente> componentes;
    private String[] nomes;
    private ArrayList<Componente> componentesAdicionados;
    DefaultListModel<String> model;
    private ArrayList<Componente> retornoComponentes;
    
    public ListaComponentes(ArrayList<Componente> componentes, ArrayList<Componente> retornoComponentes) {
        this.retornoComponentes = retornoComponentes;
        this.componentes = componentes;
        this.componentesAdicionados = new ArrayList();
        model = new DefaultListModel<>();
        this.nomes = new String[this.componentes.size()];
        for (int i = 0; i < this.componentes.size(); i++) {
            this.nomes[i] = this.componentes.get(i).getNome();
        }
        this.sortStringBubble(nomes);
        initComponents();
        this.setVisible(true);
    }
    
    private void sortStringBubble(String x[]) {
        int j;
        boolean flag = true;
        String aux;
        Componente a;
        while (flag) {
            flag = false;
            for (j = 0; j < x.length - 1; j++) {
                if (x[j].compareToIgnoreCase(x[j + 1]) > 0) {
                    aux = x[j];
                    a = componentes.get(j);
                    x[j] = x[j + 1];
                    componentes.set(j, componentes.get(j + 1));
                    x[j + 1] = aux;
                    componentes.set(j + 1, a);
                    flag = true;
                }
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComponentesAdicionar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaComponentesAdicionados = listaComponentesAdicionados = new javax.swing.JList<>(this.model);
        botaoConcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.listaComponentesAdicionar  = new JList(this.nomes);
        listaComponentesAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaComponentesAdicionarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaComponentesAdicionar);

        listaComponentesAdicionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaComponentesAdicionadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaComponentesAdicionados);

        botaoConcluir.setText("Concluir");
        botaoConcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConcluirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Seleção de componentes");

        jLabel2.setText("Componentes disponívels");

        jLabel3.setText("Componentes selecionados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(botaoConcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botaoConcluir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaComponentesAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaComponentesAdicionarMouseClicked
        this.componentesAdicionados.add(this.componentes.get(this.listaComponentesAdicionar.getAnchorSelectionIndex()));
        this.retornoComponentes = this.componentesAdicionados;
        System.out.println(this.componentesAdicionados.size());
        String[] comp = new String[this.componentesAdicionados.size()];
        int j = 0;
        for (Componente c : this.componentesAdicionados) {
            comp[j] = c.getNome();
            j++;
        }
        this.addComponentesListaAdicionados(comp);
    }//GEN-LAST:event_listaComponentesAdicionarMouseClicked

    private void listaComponentesAdicionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaComponentesAdicionadosMouseClicked
        this.componentesAdicionados.remove(this.listaComponentesAdicionados.getAnchorSelectionIndex());
        this.model.remove(this.listaComponentesAdicionados.getAnchorSelectionIndex());
        this.retornoComponentes = this.componentesAdicionados;
    }//GEN-LAST:event_listaComponentesAdicionadosMouseClicked

    private void botaoConcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConcluirMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoConcluirMouseClicked

    private void addComponentesListaAdicionados(String[] comp){
        this.model.clear();
        for ( int i = 0; i < comp.length; i++ ){
          this.model.addElement( comp[i] );
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaComponentesAdicionados;
    private javax.swing.JList<String> listaComponentesAdicionar;
    // End of variables declaration//GEN-END:variables
}
