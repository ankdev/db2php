/*
 * Copyright (C) 2008 Andreas Schnaiter
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.afraid.poison.db2php;

import java.io.File;
import java.util.Vector;
import java.util.prefs.Preferences;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;
import org.afraid.poison.common.ui.InputVerifierHandler;
import org.afraid.poison.common.ui.InputVerifierPattern;
import org.afraid.poison.db2php.generator.databaselayer.DatabaseLayer;
import org.openide.WizardDescriptor;
import org.openide.util.NbPreferences;

public final class PhpClassVisualPanel2 extends JPanel {

	private WizardDescriptor wizard;
	private InputVerifierPattern inputVerifierClassName;

	/** Creates new form PhpClassVisualPanel2 */
	public PhpClassVisualPanel2(WizardDescriptor wizard) {
		initComponents();
		setWizard(wizard);
		readSettings();

	}

	@Override
	public String getName() {
		return "Options";
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        databaseLayerSelection = new javax.swing.JComboBox();
        generateChecksSelection = new javax.swing.JCheckBox();
        trackModificationsSelection = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        classNamePrefix = new javax.swing.JTextField();
        classNamePrefix.setInputVerifier(getInputVerifierClassName());
        jLabel4 = new javax.swing.JLabel();
        classNameSuffix = new javax.swing.JTextField();
        classNameSuffix.setInputVerifier(getInputVerifierClassName());
        jLabel5 = new javax.swing.JLabel();
        identifierQuoteString = new javax.swing.JComboBox();
        fluentInterfaceSelection = new javax.swing.JCheckBox();
        fileSelectionPanel = new org.afraid.poison.db2php.FileSelectionPanel();
        camelCaseFairy = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ezcSupportSelection = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.jLabel1.text_2")); // NOI18N

        databaseLayerSelection.setModel(getAvailableDatabaseLayers());

        org.openide.awt.Mnemonics.setLocalizedText(generateChecksSelection, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.generateChecksSelection.text")); // NOI18N
        generateChecksSelection.setEnabled(false);

        trackModificationsSelection.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(trackModificationsSelection, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.trackModificationsSelection.text")); // NOI18N
        trackModificationsSelection.setToolTipText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.trackModificationsSelection.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.jLabel3.text")); // NOI18N

        classNamePrefix.setText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.classNamePrefix.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.jLabel4.text")); // NOI18N

        classNameSuffix.setText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.classNameSuffix.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.jLabel5.text")); // NOI18N

        identifierQuoteString.setModel(new javax.swing.DefaultComboBoxModel(DatabaseLayer.DEFAULT_QUOTE_STRINGS));
        identifierQuoteString.setToolTipText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.identifierQuoteString.toolTipText")); // NOI18N

        fluentInterfaceSelection.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(fluentInterfaceSelection, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.fluentInterfaceSelection.text")); // NOI18N
        fluentInterfaceSelection.setToolTipText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.fluentInterfaceSelection.toolTipText")); // NOI18N

        camelCaseFairy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<disabled>", "en", "de", "deen" }));
        camelCaseFairy.setToolTipText(org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.camelCaseFairy.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.jLabel2.text_2")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ezcSupportSelection, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel2.class, "PhpClassVisualPanel2.ezcSupportSelection.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fileSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(identifierQuoteString, 0, 130, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classNameSuffix, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classNamePrefix, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(databaseLayerSelection, 0, 166, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(camelCaseFairy, 0, 162, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ezcSupportSelection)
                            .addComponent(fluentInterfaceSelection)
                            .addComponent(generateChecksSelection)
                            .addComponent(trackModificationsSelection))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(databaseLayerSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateChecksSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(classNamePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trackModificationsSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(classNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fluentInterfaceSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(identifierQuoteString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ezcSupportSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camelCaseFairy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(fileSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox camelCaseFairy;
    private javax.swing.JTextField classNamePrefix;
    private javax.swing.JTextField classNameSuffix;
    private javax.swing.JComboBox databaseLayerSelection;
    private javax.swing.JCheckBox ezcSupportSelection;
    private org.afraid.poison.db2php.FileSelectionPanel fileSelectionPanel;
    private javax.swing.JCheckBox fluentInterfaceSelection;
    private javax.swing.JCheckBox generateChecksSelection;
    private javax.swing.JComboBox identifierQuoteString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox trackModificationsSelection;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the wizard
	 */
	public WizardDescriptor getWizard() {
		return wizard;
	}

	/**
	 * @param wizard the wizard to set
	 */
	public void setWizard(WizardDescriptor wizard) {
		this.wizard=wizard;
		getFileSelectionPanel().setWizard(wizard);
	}

	/**
	 * @return the directory
	 */
	public synchronized File getDirectory() {
		return getFileSelectionPanel().getDirectory();
	}

	public ComboBoxModel getAvailableDatabaseLayers() {
		ComboBoxModel dbLayerModel=new DefaultComboBoxModel(new Vector<Object>(DatabaseLayer.AVAILABLE));
		dbLayerModel.setSelectedItem(DatabaseLayer.PDO);
		return dbLayerModel;
	}

	/**
	 * @return the classNamePrefix
	 */
	public javax.swing.JTextField getClassNamePrefix() {
		return classNamePrefix;
	}

	/**
	 * @return the classNameSuffix
	 */
	public javax.swing.JTextField getClassNameSuffix() {
		return classNameSuffix;
	}

	/**
	 * @return the databaseLayerSelection
	 */
	public javax.swing.JComboBox getDatabaseLayerSelection() {
		return databaseLayerSelection;
	}

	/**
	 * @return the trackModificationsSelection
	 */
	public javax.swing.JCheckBox getTrackModificationsSelection() {
		return trackModificationsSelection;
	}

	/**
	 * @return the generateChecksSelection
	 */
	public javax.swing.JCheckBox getGenerateChecksSelection() {
		return generateChecksSelection;
	}

	/**
	 * @return the identifierQuoteString
	 */
	public javax.swing.JComboBox getIdentifierQuoteString() {
		return identifierQuoteString;
	}

	/**
	 * @return the fluentInterfaceSelection
	 */
	public javax.swing.JCheckBox getFluentInterfaceSelection() {
		return fluentInterfaceSelection;
	}

	public JCheckBox getEzcSupportSelection() {
		return ezcSupportSelection;
	}


	public void readSettings() {
		Preferences pref=NbPreferences.forModule(getClass());
		String setting=pref.get("DatabaseLayer", null);
		if (null!=setting) {
			for (DatabaseLayer databaseLayer : DatabaseLayer.AVAILABLE) {
				if (databaseLayer.getDbTypeName().equals(setting)) {
					getDatabaseLayerSelection().setSelectedItem(databaseLayer);
					break;
				}
			}
		}
		getClassNamePrefix().setText(pref.get("ClassNamePrefix", ""));
		getClassNameSuffix().setText(pref.get("ClassNameSuffix", "Model"));
		setting=pref.get("IdentifierQuoteString", DatabaseLayer.DEFAULT_QUOTE_STRINGS[1]);
		getIdentifierQuoteString().setSelectedItem(setting);
		getGenerateChecksSelection().setSelected(pref.getBoolean("TypeChecks", false));
		getTrackModificationsSelection().setSelected(pref.getBoolean("TrackModifications", true));
		getFluentInterfaceSelection().setSelected(pref.getBoolean("FluentInterface", true));
		getEzcSupportSelection().setSelected(pref.getBoolean("EzcSupport", false));
		getCamelCaseFairy().setSelectedItem(pref.get("CamelCaseFairy", "<disabled>"));

	}

	public void storeSettings() {
		Preferences pref=NbPreferences.forModule(getClass());
		pref.put("DatabaseLayer", ((DatabaseLayer) getDatabaseLayerSelection().getSelectedItem()).getDbTypeName());
		pref.put("ClassNamePrefix", getClassNamePrefix().getText());
		pref.put("ClassNameSuffix", getClassNameSuffix().getText());
		pref.put("IdentifierQuoteString", getIdentifierQuoteString().getSelectedItem().toString());
		pref.putBoolean("TypeChecks", getGenerateChecksSelection().isSelected());
		pref.putBoolean("TrackModifications", getTrackModificationsSelection().isSelected());
		pref.putBoolean("FluentInterface", getFluentInterfaceSelection().isSelected());
		pref.putBoolean("EzcSupport", getEzcSupportSelection().isSelected());
		pref.put("CamelCaseFairy", getCamelCaseFairy().getSelectedItem().toString());

	}

	/**
	 * @return the inputVerifierClassName
	 */
	public synchronized InputVerifierPattern getInputVerifierClassName() {
		if (null==inputVerifierClassName) {
			inputVerifierClassName=new InputVerifierPattern();
			inputVerifierClassName.setPattern("^[a-zA-z0-9_]*$");
			inputVerifierClassName.setPostAction(new InputVerifierHandler() {

				@Override
				public boolean performPostValidationAction(JComponent input, boolean valid) {
					if (!(input instanceof JTextComponent)) {
						return valid;
					}
					JTextComponent textComponent=(JTextComponent) input;
					if (!valid) {
						textComponent.setText(textComponent.getText().replaceAll("[^a-zA-z0-9_]+", ""));
					}
					return valid;
				}
			});
		}
		return inputVerifierClassName;
	}

	/**
	 * @param inputVerifierClassName the inputVerifierClassName to set
	 */
	public void setInputVerifierClassName(InputVerifierPattern inputVerifierClassName) {
		this.inputVerifierClassName=inputVerifierClassName;
	}

	/**
	 * @return the fileSelectionPanel
	 */
	private FileSelectionPanel getFileSelectionPanel() {
		return fileSelectionPanel;
	}

	/**
	 * @return the camelCaseFairy
	 */
	public javax.swing.JComboBox getCamelCaseFairy() {
		return camelCaseFairy;
	}

	/*
	@Override
	public boolean isValid() {
	return true; //null!=getDirectory() && getDirectory().isDirectory() && getDirectory().canWrite();
	}
	 */
}

