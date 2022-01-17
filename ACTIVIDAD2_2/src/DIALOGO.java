import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DIALOGO extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField codigo;
	private JTextField nombre;
	private JTextField gratificacion;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DIALOGO dialog = new DIALOGO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DIALOGO() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("INSERCI\u00D3N DE OFICINA");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(107, 10, 220, 28);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setBounds(33, 47, 375, 153);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.GRAY);
				panel_1.setBounds(10, 10, 355, 37);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					lblNewLabel_1 = new JLabel("C\u00F3digo: ");
					lblNewLabel_1.setBounds(10, 10, 151, 17);
					panel_1.add(lblNewLabel_1);
				}
				{
					codigo = new JTextField();
					lblNewLabel_1.setLabelFor(codigo);
					codigo.setBounds(171, 9, 96, 19);
					panel_1.add(codigo);
					codigo.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.GRAY);
				panel_1.setBounds(10, 57, 355, 37);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					lblNewLabel_2 = new JLabel("Nombre: ");
					lblNewLabel_2.setBounds(10, 10, 109, 17);
					panel_1.add(lblNewLabel_2);
				}
				{
					nombre = new JTextField();
					lblNewLabel_2.setLabelFor(nombre);
					nombre.setBounds(171, 9, 96, 19);
					panel_1.add(nombre);
					nombre.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.GRAY);
				panel_1.setBounds(10, 104, 355, 39);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					lblNewLabel_3 = new JLabel("Gratificaci\u00F3n: ");
					lblNewLabel_3.setBounds(10, 10, 129, 19);
					panel_1.add(lblNewLabel_3);
				}
				{
					gratificacion = new JTextField();
					lblNewLabel_3.setLabelFor(gratificacion);
					gratificacion.setBounds(172, 10, 96, 19);
					panel_1.add(gratificacion);
					gratificacion.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton insertar = new JButton("Insertar");
				insertar.setActionCommand("OK");
				buttonPane.add(insertar);
				getRootPane().setDefaultButton(insertar);
			}
			{
				JButton limpiar = new JButton("Limpiar");
				limpiar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						codigo.setText("");
						nombre.setText("");
						gratificacion.setText("");
					}
				});
				limpiar.setActionCommand("Cancel");
				buttonPane.add(limpiar);
			}
		}
	}

}
