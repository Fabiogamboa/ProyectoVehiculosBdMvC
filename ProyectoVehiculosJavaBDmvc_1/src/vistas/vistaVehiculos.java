package vistas;

import java.util.ArrayList;
import controladores.controladorVehiculo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class vistaVehiculos extends javax.swing.JFrame {
    private final controladorVehiculo objVehiculo;
    private final resultadosVehi objMuestra;
    private final int datoCedula;
    public vistaVehiculos(int datoCedula) {
        initComponents();
        this.datoCedula = datoCedula;
        objVehiculo = new controladorVehiculo();
        objMuestra = new resultadosVehi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcGas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        placax = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seleccionMarca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gasolina = new javax.swing.JRadioButton();
        diesel = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        hibrido = new javax.swing.JRadioButton();
        datoAd1 = new javax.swing.JCheckBox();
        datoAd2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(153, 255, 51));
        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setText("Registro vehículos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Placa");

        seleccionMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Tesla", "Honda", "Chevrolet" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Marca");

        opcGas.add(gasolina);
        gasolina.setText("Gasolina");

        opcGas.add(diesel);
        diesel.setText("Diesel");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Combustible");

        opcGas.add(hibrido);
        hibrido.setText("Híbrido");

        datoAd1.setText("Aire acondicionado");

        datoAd2.setText("Vidrios eléctriccos");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Características");

        jButton1.setText("Registrar Vehículo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Mostrar info");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(placax, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)
                                    .addComponent(seleccionMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gasolina)
                                        .addComponent(diesel)
                                        .addComponent(hibrido))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(datoAd1)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton2)
                                            .addComponent(datoAd2))))
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(placax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gasolina)
                    .addComponent(datoAd1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datoAd2)
                    .addComponent(diesel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hibrido)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ArrayList<String> datosAcum = new ArrayList<>();

        String datitoPlaca = placax.getText();
        String datoSel = (String) seleccionMarca.getSelectedItem();

        boolean dieselData = diesel.isSelected();
        boolean gasolinaData = gasolina.isSelected();
        boolean hibridoData = hibrido.isSelected();

        boolean datoadicional1 = datoAd1.isSelected();
        boolean datoadicional2 = datoAd2.isSelected();

        if (datitoPlaca.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ingrese la placa del vehiculo, eso que bro xd");
            return;
        }
        if (!dieselData && !gasolinaData && !hibridoData) {
            JOptionPane.showMessageDialog(null, "Elija qué tipo de combustible usa :v");
            return;
        }

        String caracteristicas = "";
        if (datoadicional1 && datoadicional2) {
            caracteristicas = "Aire - vidrios";
        } else if (datoadicional1) {
            caracteristicas = "Aire";
        } else if (datoadicional2) {
            caracteristicas = "Vidrios";
        } else {
            caracteristicas = "Ninguno";
        }

        String combustible = "";
        if (dieselData) {
            combustible = "Diesel";
        } else if (gasolinaData) {
            combustible = "Gasolina";
        } else if (hibridoData) {
            combustible = "Híbrido";
        }
        
        datosAcum.add(datitoPlaca);
        datosAcum.add(caracteristicas);
        datosAcum.add(combustible);
        datosAcum.add(datoSel);
        datosAcum.add(String.valueOf(datoCedula));
        try {
            objVehiculo.guardarDatos(datosAcum);
        } catch (SQLException ex) {
            Logger.getLogger(vistaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al guardar los datitosgogo");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        objMuestra.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox datoAd1;
    private javax.swing.JCheckBox datoAd2;
    private javax.swing.JRadioButton diesel;
    private javax.swing.JRadioButton gasolina;
    private javax.swing.JRadioButton hibrido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup opcGas;
    private javax.swing.JTextField placax;
    private javax.swing.JComboBox<String> seleccionMarca;
    // End of variables declaration//GEN-END:variables
}
