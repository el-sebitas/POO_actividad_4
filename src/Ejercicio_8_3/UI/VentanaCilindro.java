package Ejercicio_8_3.UI;

import Ejercicio_8_3.Figuras.Cilindro;

public class VentanaCilindro extends javax.swing.JFrame {
    public VentanaCilindro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radioField = new javax.swing.JTextField();
        alturaField = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        volumenField = new javax.swing.JLabel();
        superficieField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cilindro");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText(" Altura (cms)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText(" Radio (cms)");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        volumenField.setFont(new java.awt.Font("Segoe UI", 1, 14));
        volumenField.setText("Volumen (cm3): ");

        superficieField.setFont(new java.awt.Font("Segoe UI", 1, 14));
        superficieField.setText("Superficie (cm3): ");

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
                                                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                        .addComponent(radioField)
                                                        .addComponent(alturaField)))
                                        .addComponent(superficieField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(alturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(volumenField)
                                .addGap(18, 18, 18)
                                .addComponent(superficieField)
                                .addGap(38, 38, 38))
        );

        pack();
    }

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {
        double altura = Double.valueOf(alturaField.getText());
        double radio = Double.valueOf(radioField.getText());
        Cilindro cilindro = new Cilindro(altura, radio);

        volumenField.setText("Volumen (cm3): " + String.format("%.2f", cilindro.getVolumen()));
        superficieField.setText("Superficie (cm3): " + String.format("%.2f", cilindro.getSuperficie()));
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField alturaField;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField radioField;
    private javax.swing.JLabel superficieField;
    private javax.swing.JLabel volumenField;
    // End of variables declaration
}

