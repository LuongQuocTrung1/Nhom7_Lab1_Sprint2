package BTTH;

import javax.swing.*;
import java.awt.event.*;

public class PTBN extends JFrame {
    private JTextField txtA, txtB, txtKQ;
    private JButton btnGiai;

    public PTBN() {
        setTitle("Giải phương trình bậc nhất: ax + b = 0");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblA = new JLabel("Nhập a:");
        lblA.setBounds(30, 30, 80, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(120, 30, 200, 25);
        add(txtA);

        JLabel lblB = new JLabel("Nhập b:");
        lblB.setBounds(30, 70, 80, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(120, 70, 200, 25);
        add(txtB);

        btnGiai = new JButton("Giải");
        btnGiai.setBounds(150, 110, 80, 30);
        add(btnGiai);

        JLabel lblKQ = new JLabel("Kết quả:");
        lblKQ.setBounds(30, 160, 80, 25);
        add(lblKQ);

        txtKQ = new JTextField();
        txtKQ.setBounds(120, 160, 200, 25);
        txtKQ.setEditable(false);
        add(txtKQ);

        btnGiai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    String kq;

                    if (a == 0) {
                        if (b == 0)
                            kq = "Vô số nghiệm";
                        else
                            kq = "Vô nghiệm";
                    } else {
                        double x = -b / a;
                        kq = "x = " + x;
                    }

                    txtKQ.setText(kq);
                } catch (Exception ex) {
                    txtKQ.setText("Lỗi nhập dữ liệu!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new PTBN().setVisible(true);
    }
}

