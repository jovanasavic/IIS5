package wb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgKvadrat extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtDuzinaStranice;
	private JComboBox cbxBojaIvice;
	public int x;
	public int duzinaStranice;
	public String bojaIvice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgKvadrat dialog = new DlgKvadrat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgKvadrat() {
		setModal(true);
		setBounds(100, 100, 310, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblX = new JLabel("X koordinata ta\u010Dke gore levo");
			GridBagConstraints gbc_lblX = new GridBagConstraints();
			gbc_lblX.anchor = GridBagConstraints.WEST;
			gbc_lblX.insets = new Insets(0, 0, 5, 5);
			gbc_lblX.gridx = 0;
			gbc_lblX.gridy = 0;
			contentPanel.add(lblX, gbc_lblX);
		}
		{
			txtX = new JTextField();
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.insets = new Insets(0, 0, 5, 0);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 1;
			gbc_txtX.gridy = 0;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			JLabel lblDuzinaStranice = new JLabel("Du\u017Eina stranice");
			GridBagConstraints gbc_lblDuzinaStranice = new GridBagConstraints();
			gbc_lblDuzinaStranice.anchor = GridBagConstraints.WEST;
			gbc_lblDuzinaStranice.insets = new Insets(0, 0, 5, 5);
			gbc_lblDuzinaStranice.gridx = 0;
			gbc_lblDuzinaStranice.gridy = 1;
			contentPanel.add(lblDuzinaStranice, gbc_lblDuzinaStranice);
		}
		{
			txtDuzinaStranice = new JTextField();
			GridBagConstraints gbc_txtDuzinaStranice = new GridBagConstraints();
			gbc_txtDuzinaStranice.insets = new Insets(0, 0, 5, 0);
			gbc_txtDuzinaStranice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDuzinaStranice.gridx = 1;
			gbc_txtDuzinaStranice.gridy = 1;
			contentPanel.add(txtDuzinaStranice, gbc_txtDuzinaStranice);
			txtDuzinaStranice.setColumns(10);
		}
		{
			JLabel lblBojaIvice = new JLabel("Boja ivice");
			GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
			gbc_lblBojaIvice.anchor = GridBagConstraints.WEST;
			gbc_lblBojaIvice.insets = new Insets(0, 0, 0, 5);
			gbc_lblBojaIvice.gridx = 0;
			gbc_lblBojaIvice.gridy = 2;
			contentPanel.add(lblBojaIvice, gbc_lblBojaIvice);
		}
		{
			cbxBojaIvice = new JComboBox();
			cbxBojaIvice.setModel(new DefaultComboBoxModel(new String[] {"Bela", "Crna", "Plava", "Zelena", "Zuta", "Pink", "Crvena"}));
			cbxBojaIvice.setSelectedIndex(1);
			GridBagConstraints gbc_cbxBojaIvice = new GridBagConstraints();
			gbc_cbxBojaIvice.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbxBojaIvice.gridx = 1;
			gbc_cbxBojaIvice.gridy = 2;
			contentPanel.add(cbxBojaIvice, gbc_cbxBojaIvice);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Potvrdi");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						x = Integer.parseInt(txtX.getText());
						duzinaStranice = Integer.parseInt(txtDuzinaStranice.getText());
						bojaIvice = cbxBojaIvice.getSelectedItem().toString();
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Odustani");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
