package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class timMin {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel resultLabel;

	public timMin() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame("Tìm Số Nhỏ Nhất");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("Số thứ nhất:");
		lbl1.setBounds(30, 30, 100, 25);
		frame.getContentPane().add(lbl1);

		textField1 = new JTextField();
		textField1.setBounds(140, 30, 100, 25);
		frame.getContentPane().add(textField1);

		JLabel lbl2 = new JLabel("Số thứ hai:");
		lbl2.setBounds(30, 70, 100, 25);
		frame.getContentPane().add(lbl2);

		textField2 = new JTextField();
		textField2.setBounds(140, 70, 100, 25);
		frame.getContentPane().add(textField2);

		JButton btnFindMin = new JButton("Tìm nhỏ nhất");
		btnFindMin.setBounds(140, 110, 120, 30);
		frame.getContentPane().add(btnFindMin);

		resultLabel = new JLabel("Kết quả: ");
		resultLabel.setBounds(30, 160, 300, 25);
		frame.getContentPane().add(resultLabel);

		btnFindMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(textField1.getText());
					double b = Double.parseDouble(textField2.getText());
					double min = Math.min(a, b);
					resultLabel.setText("Kết quả: " + min);
				} catch (NumberFormatException ex) {
					resultLabel.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new timMin());
	}
}
