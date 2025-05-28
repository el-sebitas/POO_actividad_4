package Ejercicio_8_3.UI;

public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnCilindro = new javax.swing.JButton();
        btnEsfera = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");

        btnCilindro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCilindro.setText("Cilindro");
        btnCilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCilindroMouseClicked(evt);
            }
        });

        btnEsfera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEsfera.setText("Esfera");
        btnEsfera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEsferaMouseClicked(evt);
            }
        });

        btnPiramide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPiramide.setText("Pirámide");
        btnPiramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiramideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCilindro)
                                        .addComponent(btnEsfera)
                                        .addComponent(btnPiramide))
                                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCilindroMouseClicked(java.awt.event.MouseEvent evt) {
        VentanaCilindro ventanaCilindro = new VentanaCilindro();
        ventanaCilindro.setVisible(true);
    }

    private void btnEsferaMouseClicked(java.awt.event.MouseEvent evt) {
        VentanaEsfera ventanaEsfera = new VentanaEsfera();
        ventanaEsfera.setVisible(true);
    }

    private void btnPiramideMouseClicked(java.awt.event.MouseEvent evt) {
        VentanaPiramide ventanaPiramide = new VentanaPiramide();
        ventanaPiramide.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnEsfera;
    private javax.swing.JButton btnPiramide;
    // End of variables declaration
}

