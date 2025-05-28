package Ejercicio_8_3.UI;

import Ejercicio_8_3.Figuras.Piramide;

public class VentanaPiramide extends javax.swing.JFrame {
    public VentanaPiramide() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        baseField = new javax.swing.JTextField();
        alturaField = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        volumenField = new javax.swing.JLabel();
        superficieField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apotemaField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pirámide");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText(" Altura (cms)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText(" Base (cms)");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        volumenField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volumenField.setText("Volumen (cm3): ");

        superficieField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        superficieField.setText("Superficie (cm3): ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(" Apotema (cms)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(volumenField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(baseField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                        .addComponent(alturaField)))
                                        .addComponent(superficieField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                        .addComponent(apotemaField1))))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(baseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(alturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(apotemaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(btnCalcular)
                                .addGap(28, 28, 28)
                                .addComponent(volumenField)
                                .addGap(18, 18, 18)
                                .addComponent(superficieField)
                                .addGap(38, 38, 38))
        );

        pack();
    }

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {
        double altura = Double.valueOf(alturaField.getText());
        double apotema = Double.valueOf(apotemaField1.getText());
        double base = Double.valueOf(baseField.getText());
        Piramide piramide = new Piramide(altura, apotema, base);


        volumenField.setText("Volumen (cm3): " + piramide.getVolumen());
        superficieField.setText("Superficie (cm3): " + piramide.getSuperficie());
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField alturaField;
    private javax.swing.JTextField apotemaField1;
    private javax.swing.JTextField baseField;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel superficieField;
    private javax.swing.JLabel volumenField;
    // End of variables declaration
}
