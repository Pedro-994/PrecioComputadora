/*
diseña un programa auxiliar para una empresa de computadoras 

cuando se vende una pc al cliente se le ofrecen 5 tipos de procesadores,  
5 tipos de ram, 5 discos duros, 3 tipos de tarjeta madre, 5 accesorios
y 6 paqueterias de software   

en base a cada producto y paqueteria se realiza un costo, se le incluye un iva y se da un total 
desglosado uno por uno el IVA es del 7%
 */
package empresacomputadoras;

/**
 *
 * @author pirul
 */
public class ArmaTuCompu extends javax.swing.JFrame {

    /**
     * Creates new form ArmaTuCompu
     */
    public ArmaTuCompu() {
        initComponents();
        txtresumen.setLineWrap(true);
        txtresumen.setWrapStyleWord(true);
        txttotal.setLineWrap(true);
        txttotal.setWrapStyleWord(true);
                // txtresumen.setLineWrap(true);
    }
    
    public int eligeProcesador(){
        
        switch (procesador) {
            case "Ryzen 3 2200g":
                return 0;
            case "Ryzen 5 2400g":
                return 1;
            case "Athlon 240GE":
                return 2;
            default:
                return 3;
        } 
    }
    
    public int  eligeRam(){
        
        switch (ram) {
            case "DDR4 4GB":
                return 0;
            case "DDR4 8GB":
                return 1;
            case "DDR4 16GB":
                return 2;
            case "DDR4 8GB(2X4 DUAL CHANEL)":
                return 3;
            default:
                return 4;
        }
        
    }
    
    public int eligeDisco(){
        
        switch(disco){
            case "Disco Duro Interno 250 GB":
                return 0;
            case "Disco Duro Interno 500 GB":
                return 1;
            case "Disco Duro Interno 1 TB":
                return 2;
            case "SSD 120 GB":
                return 3;
            default:
                return 4;               
        }
    }
    
    public int eligePaqueteria(){
        
        switch(paqueteria){
            case "Paqueteria 1":
                return 0;
            case "Paqueteria 2":
                return 1;
            case "Paqueteria 3":
                return 2;
            case "Paqueteria 4":
                return 3;
            case "Paqueteria 5":
                return 4;
            case "Paqueteria 6":
                return 5;
            default:
                return 6;
                
        }
        
    }
    
    public int eligeMother(){
        
        switch(mother){
            case "GIGABYE AB350M-D3H":
                return 0;
            case "MSI B450M PRO-VDH":
                return 1;
            default:
                return 2;
        }
    }
    
    public void extras(){
        
        if(chkmouse.isSelected())
            costoT = costoT + costo[5][0];
        if(chkteclado.isSelected())
            costoT = costoT + costo[5][1];
        if(chkmonitor.isSelected())
            costoT = costoT + costo[5][2];
        if(chkimpresora.isSelected())
            costoT = costoT + costo[5][3];
        if(jCheckBox5.isSelected())
            costoT = costoT + costo[5][4];
    }
    
    public void seleccionar(){
        
        procesador = cboprocesador.getSelectedItem().toString();
        ram = cboram.getSelectedItem().toString();
        paqueteria = cbopaqueteria.getSelectedItem().toString();
        mother = cbomother.getSelectedItem().toString();
        disco = cbodisco.getSelectedItem().toString();
        
    }
    
    public void resumenCompra(int procesador, int ram,int paqueteria,int disco,int mother){
        
        txtresumen.setText(this.procesador+ "= $"+costo[0][procesador]+"\n"+
                           this.ram+ "= $"+costo[1][ram]+"\n"+this.paqueteria+"= $"+costo[2][paqueteria]
                            +"\n"+this.mother+ "= $"+costo[4][mother]+"\n"+this.disco+"= $"+costo[3][disco]);

    }
    
    public void total(int procesador, int ram,int paqueteria,int disco,int mother){
        
        costoT = costo[0][procesador]+costo[1][ram]+costo[2][paqueteria]+costo[3][disco]+costo[4][mother];
        extras();
        costoI = (float) (costoT*1.07);
        
    }
    
    public String ImprimeTotal(){
        
        return ("Total= $"+costoT+"\n"+"Total+IVA= $"+costoI);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboprocesador = new javax.swing.JComboBox<>();
        cbodisco = new javax.swing.JComboBox<>();
        cboram = new javax.swing.JComboBox<>();
        cbomother = new javax.swing.JComboBox<>();
        cbopaqueteria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkmouse = new javax.swing.JCheckBox();
        chkteclado = new javax.swing.JCheckBox();
        chkmonitor = new javax.swing.JCheckBox();
        chkimpresora = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresumen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttotal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Procesador");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Arma tu Compu Aqui");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Disco Duro");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Memoria Ram");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Motherboard");

        cboprocesador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ryzen 3 2200g", "Ryzen 5 2400g", "Athlon 240GE", "Athlon 200GE" }));

        cbodisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disco Duro Interno 250 GB", "Disco Duro Interno 500 GB", "Disco Duro Interno 1 TB", "SSD 120 GB", "SSD 240 GB" }));

        cboram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR4 4GB", "DDR4 8GB", "DDR4 16GB", "DDR4 8GB(2X4 DUAL CHANEL)", "DDR4 16GB(2X8 DUAL CHANEL)" }));

        cbomother.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GIGABYE AB350M-D3H", "MSI B450M PRO-VDH", "MSI B450 Gaming Plus" }));

        cbopaqueteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Paqueteria 1", "Paqueteria 2", "Paqueteria 3", "Paqueteria 4", "Paqueteria 5", "Paqueteria 6" }));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Paqueteria");

        chkmouse.setText("Mouse");
        chkmouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        chkteclado.setText("Teclado");
        chkteclado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        chkmonitor.setText("Monitor");
        chkmonitor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        chkimpresora.setText("Impresora");
        chkimpresora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jCheckBox5.setText("Audifonos");
        jCheckBox5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkmouse)
                    .addComponent(chkteclado)
                    .addComponent(chkmonitor)
                    .addComponent(chkimpresora)
                    .addComponent(jCheckBox5))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chkmouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkteclado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkmonitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkimpresora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox5)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Accesorios");

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        txtresumen.setColumns(20);
        txtresumen.setRows(5);
        txtresumen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)), "Resumen de compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(txtresumen);

        txttotal.setColumns(20);
        txttotal.setRows(5);
        txttotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 18))); // NOI18N
        jScrollPane2.setViewportView(txttotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbodisco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboram, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbomother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbopaqueteria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbopaqueteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbodisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbomother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        seleccionar();
        resumenCompra(eligeProcesador(),eligeRam(),eligePaqueteria(),eligeDisco(),eligeMother());
        total(eligeProcesador(),eligeRam(),eligePaqueteria(),eligeDisco(),eligeMother());
        txttotal.setText(ImprimeTotal());
        

    }//GEN-LAST:event_btncalcularActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //Procesadores
        costo[0][0]=2000;
        costo[0][1]=3000;
        costo[0][2]=1500;
        costo[0][3]=1300;
        
        //RAM
        costo[1][0]=800;
        costo[1][1]=1600;
        costo[1][2]=2500;
        costo[1][3]=1500;
        costo[1][4]=2600;
        
        //PAQUETERIA
        
        costo[2][0]=700;
        costo[2][1]=1000;
        costo[2][2]=1200;
        costo[2][3]=1300;
        costo[2][4]=1500;
        costo[2][5]=1800;
        costo[2][6]=0;
        
        //DISCO
        costo[3][0]=700;
        costo[3][1]=1000;
        costo[3][2]=2000;
        costo[3][3]=800;
        costo[3][4]=1200;
         
        //MOTHER
        costo[4][0]=2000;
        costo[4][1]=2600;
        costo[4][2]=3500;
        
        //EXTRAS
        
        costo[5][0]=150;
        costo[5][1]=150;
        costo[5][2]=1500;
        costo[5][3]=3500;
        costo[5][4]=800;
         
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArmaTuCompu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmaTuCompu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmaTuCompu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmaTuCompu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArmaTuCompu().setVisible(true);
            }
        });
    }
    
    private static String procesador,ram,paqueteria,mother,disco;
    private static int costoT=0;
    private static float costoI=0;
    private static int [][] costo = new int[6][7];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JComboBox<String> cbodisco;
    private javax.swing.JComboBox<String> cbomother;
    private javax.swing.JComboBox<String> cbopaqueteria;
    private javax.swing.JComboBox<String> cboprocesador;
    private javax.swing.JComboBox<String> cboram;
    private javax.swing.JCheckBox chkimpresora;
    private javax.swing.JCheckBox chkmonitor;
    private javax.swing.JCheckBox chkmouse;
    private javax.swing.JCheckBox chkteclado;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtresumen;
    private javax.swing.JTextArea txttotal;
    // End of variables declaration//GEN-END:variables
}
