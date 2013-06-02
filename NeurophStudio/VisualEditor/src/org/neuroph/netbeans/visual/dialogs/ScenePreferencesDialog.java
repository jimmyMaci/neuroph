/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.visual.dialogs;

import java.awt.Frame;
import org.neuroph.netbeans.visual.widgets.NeuralNetworkScene;

/**
 *
 * @author Maja
 */
public class ScenePreferencesDialog extends javax.swing.JDialog {

    NeuralNetworkScene scene;
    /**
     * Creates new form ScenePreferencesDialog
     */
    public ScenePreferencesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ScenePreferencesDialog(NeuralNetworkScene scene, Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.scene = scene;
        checkBoxShowConnections.setSelected(scene.getScenePreferences().isShowConnections());
        checkBoxShowActivationSize.setSelected(scene.getScenePreferences().isShowActivationSize());
        checkBoxShowActivationColor.setSelected(scene.getScenePreferences().isShowActivationColor());
        checkBoxActivationLevels.setSelected(scene.getScenePreferences().isShowActivationLevels());
        checkBoxConnectionWeights.setSelected(scene.getScenePreferences().isShowConnectionWeights());
        checkBoxWeightHighlighting.setSelected(scene.getScenePreferences().isWeightHighlighting());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonOK = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        panelNeuron = new javax.swing.JPanel();
        checkBoxShowActivationSize = new javax.swing.JCheckBox();
        checkBoxShowActivationColor = new javax.swing.JCheckBox();
        checkBoxActivationLevels = new javax.swing.JCheckBox();
        panelConnection = new javax.swing.JPanel();
        checkBoxShowConnections = new javax.swing.JCheckBox();
        checkBoxConnectionWeights = new javax.swing.JCheckBox();
        checkBoxWeightHighlighting = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.title")); // NOI18N
        setIconImages(null);

        org.openide.awt.Mnemonics.setLocalizedText(buttonOK, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.buttonOK.text")); // NOI18N
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(buttonCancel, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.buttonCancel.text")); // NOI18N
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        panelNeuron.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.panelNeuron.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxShowActivationSize, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxShowActivationSize.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxShowActivationColor, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxShowActivationColor.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxActivationLevels, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxActivationLevels.text")); // NOI18N

        javax.swing.GroupLayout panelNeuronLayout = new javax.swing.GroupLayout(panelNeuron);
        panelNeuron.setLayout(panelNeuronLayout);
        panelNeuronLayout.setHorizontalGroup(
            panelNeuronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeuronLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNeuronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxShowActivationColor)
                    .addComponent(checkBoxActivationLevels)
                    .addComponent(checkBoxShowActivationSize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNeuronLayout.setVerticalGroup(
            panelNeuronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeuronLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxActivationLevels)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxShowActivationSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxShowActivationColor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelConnection.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.panelConnection.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxShowConnections, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxShowConnections.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxConnectionWeights, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxConnectionWeights.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkBoxWeightHighlighting, org.openide.util.NbBundle.getMessage(ScenePreferencesDialog.class, "ScenePreferencesDialog.checkBoxWeightHighlighting.text")); // NOI18N

        javax.swing.GroupLayout panelConnectionLayout = new javax.swing.GroupLayout(panelConnection);
        panelConnection.setLayout(panelConnectionLayout);
        panelConnectionLayout.setHorizontalGroup(
            panelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxShowConnections)
                    .addComponent(checkBoxConnectionWeights)
                    .addComponent(checkBoxWeightHighlighting))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConnectionLayout.setVerticalGroup(
            panelConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxShowConnections)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxConnectionWeights)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(checkBoxWeightHighlighting))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelNeuron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(buttonOK)
                        .addGap(29, 29, 29)
                        .addComponent(buttonCancel)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNeuron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        this.dispose();
        scene.showActivationSize(checkBoxShowActivationSize.isSelected());
        scene.showActivationColor(checkBoxShowActivationColor.isSelected());
        scene.showConnections(checkBoxShowConnections.isSelected());
        scene.showActivationLevel(checkBoxActivationLevels.isSelected());
        scene.showConnectionWeights(checkBoxConnectionWeights.isSelected());
        scene.weightHighlighting(checkBoxWeightHighlighting.isSelected());
    }//GEN-LAST:event_buttonOKActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ScenePreferencesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScenePreferencesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScenePreferencesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScenePreferencesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScenePreferencesDialog dialog = new ScenePreferencesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonOK;
    private javax.swing.JCheckBox checkBoxActivationLevels;
    private javax.swing.JCheckBox checkBoxConnectionWeights;
    private javax.swing.JCheckBox checkBoxShowActivationColor;
    private javax.swing.JCheckBox checkBoxShowActivationSize;
    private javax.swing.JCheckBox checkBoxShowConnections;
    private javax.swing.JCheckBox checkBoxWeightHighlighting;
    private javax.swing.JPanel panelConnection;
    private javax.swing.JPanel panelNeuron;
    // End of variables declaration//GEN-END:variables
}
