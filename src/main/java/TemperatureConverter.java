
import java.awt.Color;
import java.util.Scanner;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author william.li Challenge 3
 */
public class TemperatureConverter extends javax.swing.JFrame {

    /**
     * Creates new form TemperatureConverter
     */
    public TemperatureConverter() {
        initComponents();

        setTitle("Temperature Converter");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        addDocumentListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        converterPanel = new javax.swing.JPanel();
        celsiusSymbol = new javax.swing.JLabel();
        fahrenheitSymbol = new javax.swing.JLabel();
        celsiusField = new javax.swing.JTextField();
        fahrenheitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        converterPanel.setLayout(new java.awt.GridLayout(2, 2, 40, 20));

        celsiusSymbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celsiusSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        celsiusSymbol.setText("°C");
        converterPanel.add(celsiusSymbol);

        fahrenheitSymbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fahrenheitSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fahrenheitSymbol.setText("°F");
        converterPanel.add(fahrenheitSymbol);

        celsiusField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celsiusField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        celsiusField.setPreferredSize(new java.awt.Dimension(120, 31));
        converterPanel.add(celsiusField);

        fahrenheitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fahrenheitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fahrenheitLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        converterPanel.add(fahrenheitLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(converterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(converterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }

    private void addDocumentListener() {
        celsiusField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                convertCelsiusToFahrenheit();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                convertCelsiusToFahrenheit();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

        });
    }

    public void convertCelsiusToFahrenheit() {
        fahrenheitLabel.setForeground(Color.black);

        String celsiusText = celsiusField.getText();
        
        if (celsiusText.isEmpty()) {
            fahrenheitLabel.setText("");
            return;
        }

        try {
            double celsius = Double.parseDouble(celsiusText);
            double fahrenheit = (9 / 5) * celsius + 32;
            fahrenheitLabel.setText(String.valueOf(fahrenheit));
        } catch (NumberFormatException e) {
            fahrenheitLabel.setText("Invalid input");
            fahrenheitLabel.setForeground(Color.red);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celsiusField;
    private javax.swing.JLabel celsiusSymbol;
    private javax.swing.JPanel converterPanel;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JLabel fahrenheitSymbol;
    // End of variables declaration//GEN-END:variables
}
