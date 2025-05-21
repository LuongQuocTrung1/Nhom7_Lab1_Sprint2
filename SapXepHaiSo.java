package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SapXepHaiSo {

    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultLabel;

    public SapXepHaiSo() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame("Sắp Xếp 2 Số Tăng Dần");
        frame.setBounds(100, 100, 450, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lbl1 = new JLabel("Số thứ nhất:");
        lbl1.setBounds(30, 30, 100, 25);
        frame.getContentPane().add(lbl1);

        textField1 = new JTextField();
        textField1.setBounds(130, 30, 100, 25);
        frame.getContentPane().add(textField1);

        JLabel lbl2 = new JLabel("Số thứ hai:");
        lbl2.setBounds(30, 70, 100, 25);
        frame.getContentPane().add(lbl2);

        textField2 = new JTextField();
        textField2.setBounds(130, 70, 100, 25);
        frame.getContentPane().add(textField2);

        JButton btnSort = new JButton("Sắp xếp");
        btnSort.setBounds(130, 110, 100, 30);
        frame.getContentPane().add(btnSort);

        resultLabel = new JLabel("Kết quả: ");
        resultLabel.setBounds(30, 160, 300, 25);
        frame.getContentPane().add(resultLabel);

        btnSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());

                    if (a < b) {
                        resultLabel.setText("Kết quả: " + a + ", " + b);
                    } else {
                        resultLabel.setText("Kết quả: " + b + ", " + a);
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SapXepHaiSo());
    }
}
