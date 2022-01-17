import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VENTANA extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField precio;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextArea resultado;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTANA frame = new VENTANA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VENTANA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(43, 10, 537, 315);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(111, 6, 156, 29);
		panel_3.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre del producto: ");
		panel_1.add(lblNewLabel);
		
		nombre = new JTextField();
		lblNewLabel.setLabelFor(nombre);
		panel_1.add(nombre);
		nombre.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(272, 5, 153, 31);
		panel_3.add(panel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aplica Tasa");
		panel_2.add(chckbxNewCheckBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(111, 91, 156, 29);
		panel_3.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Precio del producto: ");
		panel_4.add(lblNewLabel_2);
		
		precio = new JTextField();
		lblNewLabel_2.setLabelFor(precio);
		panel_4.add(precio);
		precio.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(111, 44, 314, 37);
		panel_3.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo Producto: ");
		panel_5.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		lblNewLabel_3.setLabelFor(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De temporada", "Importado", "Consumo popular", "Duradero", "No duradero"}));
		panel_5.add(comboBox);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(111, 130, 353, 76);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Categor\u00EDa: ");
		lblNewLabel_4.setBounds(10, 10, 45, 13);
		panel_6.add(lblNewLabel_4);
		
		JRadioButton extra = new JRadioButton("Extra");
		lblNewLabel_4.setLabelFor(extra);
		buttonGroup.add(extra);
		extra.setBounds(70, 6, 103, 21);
		panel_6.add(extra);
		
		JRadioButton primera = new JRadioButton("Primera");
		buttonGroup.add(primera);
		primera.setBounds(70, 49, 103, 21);
		panel_6.add(primera);
		
		JRadioButton segunda = new JRadioButton("Segunda");
		buttonGroup.add(segunda);
		segunda.setBounds(213, 6, 103, 21);
		panel_6.add(segunda);
		
		JRadioButton superextra = new JRadioButton("Super Extra");
		buttonGroup.add(superextra);
		superextra.setBounds(213, 49, 103, 21);
		panel_6.add(superextra);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(109, 217, 379, 44);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("IVA: ");
		lblNewLabel_5.setBounds(0, 10, 45, 13);
		panel_7.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("4%");
		lblNewLabel_5.setLabelFor(rdbtnNewRadioButton_4);
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(51, 6, 103, 21);
		panel_7.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("12%");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(156, 6, 103, 21);
		panel_7.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("21%");
		buttonGroup_1.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(261, 6, 103, 21);
		panel_7.add(rdbtnNewRadioButton_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(27, 264, 500, 41);
		panel_3.add(panel_8);
		
		btnNewButton = new JButton("Ver datos introducidos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText("");
				resultado.append("\n " + nombre.getText());
				resultado.append("\n " + comboBox.getSelectedItem());
				resultado.append("\n " + precio.getText());
				if(buttonGroup.getSelection() != null) {
					resultado.append("\n" + buttonGroup.getSelection());
					} else { // no se ha seleccionado
						resultado.append("\n No se ha seleccionado ningún tipo de Producto");
					}
				if(buttonGroup_1.getSelection() != null) {
					resultado.append("\n" + buttonGroup_1.getSelection());
					} else { // no se ha seleccionado
						resultado.append("\n No se ha seleccionado ningún tipo de IVA");
					}
			}
		});
		panel_8.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpiar datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText("");
				nombre.setText("");
				precio.setText("");
			}
		});
		panel_8.add(btnNewButton_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(43, 335, 537, 86);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		resultado = new JTextArea();
		resultado.setBounds(10, 0, 517, 76);
		panel_9.add(resultado);
	}
}
