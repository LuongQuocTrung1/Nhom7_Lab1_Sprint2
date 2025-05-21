package BTTH;

import javax.swing.*;
import java.awt.event.*;

public class SoMax extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTimMax;

    public SoMax() {
        setTitle("Tìm số lớn nhất giữa hai số");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(150, 30, 200, 25);
        add(txtSo1);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(150, 70, 200, 25);
        add(txtSo2);

        btnTimMax = new JButton("Tìm Max");
        btnTimMax.setBounds(150, 110, 100, 30);
        add(btnTimMax);

        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(150, 160, 200, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnTimMax.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double max = Math.max(so1, so2);
                    txtKetQua.setText("Max = " + max);
                } catch (Exception ex) {
                    txtKetQua.setText("Lỗi: Nhập không hợp lệ!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new SoMax().setVisible(true);
    }
}

