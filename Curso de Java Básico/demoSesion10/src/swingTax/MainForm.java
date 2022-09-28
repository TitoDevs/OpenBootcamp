package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton buttonCalculateButton;
    private JPanel taxPanel;
    private JTextField price;
    private JTextField tax;
    private JTextField total;


    public MainForm() {
        buttonCalculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(price.getText());
                double t = Double.parseDouble(tax.getText());

                double result = p + (p / 100 * t);
                total.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
    }
}
