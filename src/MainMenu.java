/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
import java.awt.GraphicsConfiguration;
import javafx.util.Pair;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setResizable(false);
        defaultListModel = new DefaultListModel();
        enteredEdgesList.setModel(defaultListModel);
    }
    private Graph graph;


    public MainMenu(GraphicsConfiguration gc) {
        super(gc);
    }

    DefaultListModel defaultListModel;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numberOfNodesTextfield = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        drawGraphButton = new javax.swing.JButton();
        fromNodeComboBox = new javax.swing.JComboBox();
        toNodeComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        enteredEdgesList = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weightTextfield = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number of Nodes");

        jLabel2.setText("Enter edges");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("From");

        jLabel4.setText("To");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        drawGraphButton.setText("Proceed");
        drawGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawGraphButtonActionPerformed(evt);
            }
        });

        toNodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toNodeComboBoxActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(enteredEdgesList);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edges");

        jLabel6.setText("Weight");

        weightTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextfieldActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addGap(56, 56, 56)
                                .addComponent(fromNodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(numberOfNodesTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65)
                                .addComponent(toNodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drawGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numberOfNodesTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterButton))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(fromNodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toNodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(weightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawGraphButton)
                        .addGap(45, 45, 45))))
        );

        setSize(new java.awt.Dimension(693, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        try
        {
            int numberOfNodes = Integer.parseInt(numberOfNodesTextfield.getText());
            if (numberOfNodes<=0)
                throw new NumberFormatException();
            else if (numberOfNodes>14)
                throw new Exception();
            numberOfNodesTextfield.setEditable(false);
            enterButton.setEnabled(false);
            graph = new Graph(numberOfNodes);
            for(int i = 1;i <= graph.getNumberOfNodes();i++)
            {
                fromNodeComboBox.addItem(i);
                toNodeComboBox.addItem(i);
            }
        }
        catch (NumberFormatException e)
        {
            numberOfNodesTextfield.setText(null);
            JOptionPane.showMessageDialog(this, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e)
        {
            numberOfNodesTextfield.setText(null);
            JOptionPane.showMessageDialog(this, "Maximum Number Of Nodes is 14", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       try {
            int weight = Integer.parseInt(weightTextfield.getText());
            if (weight < 0) {
                throw new NumberFormatException();           
            }
            Pair<Node, Node> connection = new Pair<>(graph.getNodesList().get(fromNodeComboBox.getSelectedIndex()), graph.getNodesList().get(toNodeComboBox.getSelectedIndex()));
            if (graph.check(connection)) {
                graph.addEdge(connection.getKey(), connection.getValue(), Integer.parseInt(weightTextfield.getText()));
                String listItem = "From: " + Integer.toString(connection.getKey().ID) + " To: " + Integer.toString(connection.getValue().ID) + " Weight: " + weightTextfield.getText();
                defaultListModel.addElement(listItem);
                enteredEdgesList.setModel(defaultListModel);
            }
            else throw new NumberFormatException();
        }
        catch (NumberFormatException e) {
            weightTextfield.setText(null);
            JOptionPane.showMessageDialog(this, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
       weightTextfield.setText(null);
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void drawGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawGraphButtonActionPerformed
        this.dispose();
        DrawingScreen drawScreen = new DrawingScreen(graph);
    }//GEN-LAST:event_drawGraphButtonActionPerformed

    private void toNodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toNodeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toNodeComboBoxActionPerformed

    private void weightTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextfieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        defaultListModel = new DefaultListModel();
        defaultListModel.removeAllElements();
        enteredEdgesList.setModel(defaultListModel);
        toNodeComboBox.removeAllItems();
        fromNodeComboBox.removeAllItems();
        numberOfNodesTextfield.setEditable(true);
        numberOfNodesTextfield.setText(null);
        enterButton.setEnabled(true);
        graph = new Graph(0);
    }//GEN-LAST:event_resetButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton drawGraphButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JList enteredEdgesList;
    private javax.swing.JComboBox fromNodeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfNodesTextfield;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox toNodeComboBox;
    private javax.swing.JTextField weightTextfield;
    // End of variables declaration//GEN-END:variables
}
