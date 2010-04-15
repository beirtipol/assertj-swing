/*
 * Created on Apr 14, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.keyboard.mapping;

/**
 * Understands an "About" dialog.
 * 
 * @author Alex Ruiz
 */
public class AboutDialog extends javax.swing.JDialog {

    /** Creates new form AboutDialog */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    aboutLabel = new javax.swing.JLabel();
    closeButton = new javax.swing.JButton();

    setTitle("About");
    setModal(true);
    setName("aboutDialog"); // NOI18N
    setResizable(false);

    aboutLabel.setText("<html>\n<strong>FEST Keyboard Mapping Tool</strong>\n<p>\nCopyright @2010 <a href=\"http://fest.easytesting.org\">FEST</a> (Fixtures for Easy Software Testing)\n</p>\n</html>");
    aboutLabel.setName("aboutLabel"); // NOI18N

    closeButton.setMnemonic('C');
    closeButton.setText("Close");
    closeButton.setName("closeButton"); // NOI18N
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeWindow(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(aboutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGap(127, 127, 127)
            .addComponent(closeButton)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(closeButton)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    aboutLabel.getAccessibleContext().setAccessibleName("aboutLabel");

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void closeWindow(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindow
      setVisible(false);
    }//GEN-LAST:event_closeWindow

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel aboutLabel;
  private javax.swing.JButton closeButton;
  // End of variables declaration//GEN-END:variables

}