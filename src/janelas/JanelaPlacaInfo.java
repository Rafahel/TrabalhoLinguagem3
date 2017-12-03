
package janelas;

import trabalholinguagem3.Placa;

public class JanelaPlacaInfo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaAlunoInfo
     */
    Placa placa;
    public JanelaPlacaInfo(Placa placa) {
        this.placa = placa;
        initComponents();
        this.setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelNome = new javax.swing.JLabel();
        jlabelProcessador = new javax.swing.JLabel();
        jlabelModelo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescricao = new javax.swing.JTextArea();
        this.jTextDescricao.setText(this.placa.getDescricao());
        this.jTextDescricao.setEditable(false);
        jlabelPinosA = new javax.swing.JLabel();
        jlabelModelo3 = new javax.swing.JLabel();
        jlabelModelo4 = new javax.swing.JLabel();
        jlabelPinosD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("DADOS DA PLACA");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modelo");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Processador:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descrição");

        jlabelNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelNome.setText("jLabel6");
        jlabelNome.setText(this.placa.getNome());

        jlabelProcessador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelProcessador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelProcessador.setText("jLabel7");
        jlabelProcessador.setText(this.placa.getProcessador());

        jlabelModelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelModelo.setText("jLabel10");
        jlabelModelo.setText(this.placa.getModelo());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nome:");

        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextDescricao);

        jlabelPinosA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelPinosA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPinosA.setText("jLabel10");
        jlabelPinosA.setText(Integer.toString(this.placa.getPinosAnalogicos()));

        jlabelModelo3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelModelo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelModelo3.setText("Pinos Analogicos:");

        jlabelModelo4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelModelo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelModelo4.setText("Pinos Digitais:");

        jlabelPinosD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlabelPinosD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPinosD.setText("jLabel10");
        jlabelPinosD.setText(Integer.toString(this.placa.getPinosDigitais()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jlabelModelo4)
                            .addComponent(jlabelModelo3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelPinosA)
                            .addComponent(jlabelNome)
                            .addComponent(jlabelPinosD)
                            .addComponent(jlabelModelo)
                            .addComponent(jlabelProcessador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel4)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelNome)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlabelModelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlabelProcessador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelModelo4)
                    .addComponent(jlabelPinosD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelModelo3)
                    .addComponent(jlabelPinosA))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextDescricao;
    private javax.swing.JLabel jlabelModelo;
    private javax.swing.JLabel jlabelModelo3;
    private javax.swing.JLabel jlabelModelo4;
    private javax.swing.JLabel jlabelNome;
    private javax.swing.JLabel jlabelPinosA;
    private javax.swing.JLabel jlabelPinosD;
    private javax.swing.JLabel jlabelProcessador;
    // End of variables declaration//GEN-END:variables
}
