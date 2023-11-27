package FunWithUserInterfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 * This is how to create a simple userinterface with buttons, labels etc.
 */

public class ExampleFrame extends JFrame implements ActionListener {

  public void setUpGUI() {
    setTitle("Example User Interface");
    setBounds(100, 100, 400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container c = getContentPane();
    c.setLayout(new BorderLayout());

    JPanel panSouth = new JPanel();
    panSouth.setLayout(new FlowLayout());

    JButton btnOK = new JButton("Press Me!");
    btnOK.addActionListener(this);
    panSouth.add(btnOK, BorderLayout.SOUTH);

    c.add(panSouth, BorderLayout.SOUTH);

    JPanel panCenter = new JPanel();
    panCenter.setLayout(new FlowLayout());
    JLabel lblText = new JLabel("Enter text: ");
    JTextField txtText = new JTextField(20);
    panCenter.add(lblText);
    panCenter.add(txtText);
    c.add(panCenter, BorderLayout.CENTER);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null, "You clicked the button!");
  }

  public ExampleFrame() {
    setUpGUI();
  }

}
