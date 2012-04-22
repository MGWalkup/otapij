/**
 * **********************************************************
 * -----BEGIN PGP SIGNED MESSAGE----- Hash: SHA256
 *
 * M O N E Y C H A N G E R
 *
 * Open Transactions: Financial Cryptography and Digital Cash Library, Protocol,
 * API, Server, and GUI
 *
 * -- Anonymous Numbered Accounts. -- Untraceable Digital Cash. -- Triple-Signed
 * Receipts. -- Cheques, Vouchers, Transfers, Inboxes. -- Basket Currencies,
 * Markets, Payment Plans. -- Signed, XML, Ricardian-style Contracts.
 *
 * Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 * EMAIL: FellowTraveler@rayservers.net
 *
 * FINGERPRINT: 9DD5 90EB 9292 4B48 0484 7910 0308 00ED F951 BB8E
 *
 * BITCOIN: 1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 * OFFICIAL PROJECT WIKI: https://github.com/FellowTraveler/Moneychanger
 * https://github.com/FellowTraveler/Open-Transactions/wiki
 *
 * WEBSITE: http://www.OpenTransactions.org/
 *
 * Components and licensing: -- Moneychanger..A Java client
 * GUI.....LICENSE:.....GPLv3 -- OTLib.........A class
 * library.......LICENSE:...LAGPLv3 -- OT-API........A client
 * API..........LICENSE:...LAGPLv3 -- testwallet....Command-line
 * client...LICENSE:...LAGPLv3 -- OT-Server.....Server
 * Application....LICENSE:....AGPLv3
 * Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 * All of the above OT components were designed and written by Fellow Traveler,
 * with the exception of Moneychanger, which was contracted out to Vicky C
 * (livewire_3001@yahoo.com).
 *
 * -----------------------------------------------------
 *
 * LICENSE: This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see: http://www.gnu.org/licenses/
 *
 * If you would like to use this software outside of the free software license,
 * please contact FellowTraveler. (Unfortunately many will run anonymously and
 * untraceably, so who could really stop them?)
 *
 * DISCLAIMER: This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * -----BEGIN PGP SIGNATURE----- Version: GnuPG v1.4.11 (Darwin)
 *
 * iQIcBAEBCAAGBQJOj7gfAAoJEAMIAO35UbuOs3sP/2rrjSdYu/AsXcgLK9/9CP4a
 * lIJfw3KLvybKZjZW5r5j+4xUlCYIqPZSI66PGDChGPMPFcZQN6M4Ddpn9kbctymS
 * sdTXvbdFhpbV6k2wSa1Fz97ygfXJc/7MDTmHYbZ53hVV8AoUBrCHWtVttkQD31o3
 * Pn/qGmy+jOgTvjEXhjEpV66pDkMWze1SiI1MArHUziCYoxItuM45x0EfzwQIqlo3
 * ku2R7rRTtqm47Dgea12psWrjbPS5XRL1Q8Hs38Z1J0JdFlfn6cJYe52Iiluzof6M
 * kCLhy6FH8QfIADfrKkFP48EIhnVquDlkV9AlJ1r217K3cpK2jEjlZUnGBECMAMEo
 * pSXXk1BLNgxsa4yaXCgHY92/MhgtcdCMLkcCq6MWUTGZsLGiWIiQGmO9mwBfNIlY
 * SawlIviuS5DiE/D16A290Byxhha/5e144cIiKm27fSQra8eogUXNfZdZeuv6n69v
 * t8QjeBjoLhe5/KnRNoGLpSXhPphsWLRSJBru77ZU2msHfmkNfcP2UoEUCfNTfTbE
 * XpyRfeyRVowVKeKunV9KUSHgdD5wa6RUeyodAbaHvWrFpIpNkaFIP9OwhRULpjx0
 * arwVNYucbX1qb2I8HBm2u+IRWQTONp74TFFjU0/CVAXu2DeJKY5mL4zDej35c5j9
 * AK+ZirdWhhoHeWR1tAkN =RcXP -----END PGP SIGNATURE-----
 * ************************************************************
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PathDialog.java
 *
 * Created on 4 Apr, 2011, 8:04:41 PM
 */
package com.moneychanger.ui.dialogs;

import com.moneychanger.core.util.Utility;
import com.moneychanger.ui.Load.JavaPaths;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Vicky C and Cameron
 */
public class PathDialog extends javax.swing.JDialog {

    private JFileChooser pathFolderChooser;
    //  private final String selectedPath;
    private JavaPaths _javaPaths;

    /**
     * Creates new form PathDialog
     */
    public PathDialog(java.awt.Frame parent, boolean modal, JavaPaths javaPaths) {
        super(parent, modal);
        this._javaPaths = javaPaths;
        initComponents();
        initValues();
        this.setLocationRelativeTo(null); 
        jButton_Remove.setEnabled(!_javaPaths.isEmpty());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPanel_Paths = new javax.swing.JScrollPane();
        jList_Paths = new javax.swing.JList();
        jButton_Add = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(PathDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jScrollPanel_Paths.setName("jScrollPanel_Paths"); // NOI18N

        jList_Paths.setModel(new DefaultListModel());
        jList_Paths.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Paths.setName("jList_Paths"); // NOI18N
        jScrollPanel_Paths.setViewportView(jList_Paths);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 3, 24);
        getContentPane().add(jScrollPanel_Paths, gridBagConstraints);

        jButton_Add.setText(resourceMap.getString("jButton_Add.text")); // NOI18N
        jButton_Add.setName("jButton_Add"); // NOI18N
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 24, 24, 3);
        getContentPane().add(jButton_Add, gridBagConstraints);

        jButton_Remove.setText(resourceMap.getString("jButton_Remove.text")); // NOI18N
        jButton_Remove.setActionCommand(resourceMap.getString("jButton_Remove.actionCommand")); // NOI18N
        jButton_Remove.setName("jButton_Remove"); // NOI18N
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 24, 3);
        getContentPane().add(jButton_Remove, gridBagConstraints);
        jButton_Remove.getAccessibleContext().setAccessibleName(resourceMap.getString("jButton_Remove.AccessibleContext.accessibleName")); // NOI18N

        jButton_Close.setText(resourceMap.getString("jButton_Close.text")); // NOI18N
        jButton_Close.setName("jButton_Close"); // NOI18N
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 24, 24);
        getContentPane().add(jButton_Close, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed

        int returnVal = pathFolderChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            _javaPaths.addPath(pathFolderChooser.getSelectedFile().getPath());

        } else {
            System.out.println("Cancelled");
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        _javaPaths.removeSelected();
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                PathDialog dialog = new PathDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JList jList_Paths;
    private javax.swing.JScrollPane jScrollPanel_Paths;
    // End of variables declaration//GEN-END:variables

    private void initValues() {
        jList_Paths.setModel(_javaPaths.getAbstractListModel());

        jList_Paths.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                _javaPaths.setSelectedElement(e.getFirstIndex());
            }
        });

        _javaPaths.setRemoveReturnAction(new Utility.ReturnAction() {

            @Override
            public String getAction() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void returnAction(String returnValue) {
                if (null != returnValue) {
                    if (returnValue.contentEquals("Enabled")) {
                        jButton_Remove.setEnabled(Boolean.TRUE);
                    } else {
                        jButton_Remove.setEnabled(Boolean.FALSE);
                    }
                }
            }
        });

        pathFolderChooser = new JFileChooser();
        pathFolderChooser.setCurrentDirectory(new java.io.File("."));
        pathFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);


    }
}
