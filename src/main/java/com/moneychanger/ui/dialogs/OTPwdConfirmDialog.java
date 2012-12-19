/************************************************************
-----BEGIN PGP SIGNED MESSAGE-----
Hash: SHA256

 *                 M O N E Y C H A N G E R
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net
 *  
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.
 
-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1.4.11 (Darwin)

iQIcBAEBCAAGBQJOj7gfAAoJEAMIAO35UbuOs3sP/2rrjSdYu/AsXcgLK9/9CP4a
lIJfw3KLvybKZjZW5r5j+4xUlCYIqPZSI66PGDChGPMPFcZQN6M4Ddpn9kbctymS
sdTXvbdFhpbV6k2wSa1Fz97ygfXJc/7MDTmHYbZ53hVV8AoUBrCHWtVttkQD31o3
Pn/qGmy+jOgTvjEXhjEpV66pDkMWze1SiI1MArHUziCYoxItuM45x0EfzwQIqlo3
ku2R7rRTtqm47Dgea12psWrjbPS5XRL1Q8Hs38Z1J0JdFlfn6cJYe52Iiluzof6M
kCLhy6FH8QfIADfrKkFP48EIhnVquDlkV9AlJ1r217K3cpK2jEjlZUnGBECMAMEo
pSXXk1BLNgxsa4yaXCgHY92/MhgtcdCMLkcCq6MWUTGZsLGiWIiQGmO9mwBfNIlY
SawlIviuS5DiE/D16A290Byxhha/5e144cIiKm27fSQra8eogUXNfZdZeuv6n69v
t8QjeBjoLhe5/KnRNoGLpSXhPphsWLRSJBru77ZU2msHfmkNfcP2UoEUCfNTfTbE
XpyRfeyRVowVKeKunV9KUSHgdD5wa6RUeyodAbaHvWrFpIpNkaFIP9OwhRULpjx0
arwVNYucbX1qb2I8HBm2u+IRWQTONp74TFFjU0/CVAXu2DeJKY5mL4zDej35c5j9
AK+ZirdWhhoHeWR1tAkN
=RcXP
-----END PGP SIGNATURE-----
 **************************************************************/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OTPwdConfirmDialog.java
 *
 * Created on 4 May, 2011, 8:54:57 PM
 */

package com.moneychanger.ui.dialogs;


import com.moneychanger.core.util.Utility;

import javax.swing.JOptionPane;
import org.opentransactions.jni.core.OTPassword;

/**
 *
 * @author waqqas
 */
public class OTPwdConfirmDialog extends javax.swing.JDialog {

    private static char[] password;
    private static int count;

    /** Creates new form OTPwdConfirmDialog */
    public OTPwdConfirmDialog(java.awt.Frame parent, boolean modal,String passphrase) {
        super(parent, modal);
        initComponents();
        jLabel_password1.setText(passphrase);
        this.setLocationRelativeTo(null);

        count = 0;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel_password1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_password2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton_passwordOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(OTPwdConfirmDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(500, 200));
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel_password1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_password1.setText(resourceMap.getString("jLabel_password1.text")); // NOI18N
        jLabel_password1.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabel_password1.setMinimumSize(new java.awt.Dimension(100, 10));
        jLabel_password1.setName("jLabel_password1"); // NOI18N
        jLabel_password1.setPreferredSize(new java.awt.Dimension(150, 20));
        jLabel_password1.setToolTipText(jLabel_password1.getText());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel_password1, gridBagConstraints);

        jPasswordField1.setMaximumSize(new java.awt.Dimension(200, 30));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPasswordField1.setName(""); // NOI18N
        jPasswordField1.setPreferredSize(new java.awt.Dimension(150, 20));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPasswordField1, gridBagConstraints);

        jLabel_password2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_password2.setText(resourceMap.getString("jLabel_password2.text")); // NOI18N
        jLabel_password2.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabel_password2.setMinimumSize(new java.awt.Dimension(100, 10));
        jLabel_password2.setName("jLabel_password2"); // NOI18N
        jLabel_password2.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel_password2, gridBagConstraints);

        jPasswordField2.setMaximumSize(new java.awt.Dimension(200, 30));
        jPasswordField2.setMinimumSize(new java.awt.Dimension(100, 10));
        jPasswordField2.setName(""); // NOI18N
        jPasswordField2.setPreferredSize(new java.awt.Dimension(150, 20));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPasswordField2, gridBagConstraints);

        jButton_passwordOK.setText(resourceMap.getString("jButton_passwordOK.text")); // NOI18N
        jButton_passwordOK.setName("jButton_passwordOK"); // NOI18N
        jButton_passwordOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_passwordOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jButton_passwordOK, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_passwordOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_passwordOKActionPerformed
        password = jPasswordField1.getPassword();

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < password.length; i++) {
            str1.append(password[i]);
        }

        StringBuilder str = new StringBuilder();
        char[] pwd2 = jPasswordField1.getPassword();
        for (int i = 0; i < pwd2.length; i++) {
            str.append(pwd2[i]);
        }
        if (str.toString().equals(str1.toString())) {
            this.dispose();
        }else{
            count++;
            if(count == 3){
                JOptionPane.showMessageDialog(null, "3 wrong password tries. Exiting......","Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Passwords dont match.","Error",JOptionPane.ERROR_MESSAGE);

        }
}//GEN-LAST:event_jButton_passwordOKActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                OTPwdConfirmDialog dialog = new OTPwdConfirmDialog(new javax.swing.JFrame(), true,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_passwordOK;
    private static javax.swing.JLabel jLabel_password1;
    private javax.swing.JLabel jLabel_password2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
    public static boolean getPassword(OTPassword theOutput) {
        if (null == password)
            return false;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < password.length; i++) {
            str.append(password[i]);
        }
        if (str.length() > 0)
            theOutput.setPassword(str.toString(), str.length());
        // TODO: Security implications of using String here? (Fix.)
        
        return true;        
    }
}
