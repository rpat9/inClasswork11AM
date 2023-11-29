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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * This is how to create a simple userinterface with buttons, labels etc.
 */

public class ExampleFrame extends JFrame implements ActionListener {

  private JTextField txtText;
  private JButton buttonClose;

  public void setUpMenu() {
    JMenuBar bar = new JMenuBar();
    setJMenuBar(bar);

    JMenu menuFile = new JMenu("File");
    bar.add(menuFile);

    JMenuItem miSayHi = new JMenuItem("Say Hi");
    menuFile.add(miSayHi);

    JMenuItem miExit = new JMenuItem("Exit");
    menuFile.add(miExit);

    JMenu menuHelp = new JMenu("Help");
    bar.add(menuHelp);

    JMenuItem miAbout = new JMenuItem("About");
    menuHelp.add(miAbout);

    miSayHi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hi!");
      }
    });

    miExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

  }

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

    buttonClose = new JButton("Close");
    buttonClose.addActionListener(this);
    panSouth.add(buttonClose);

    JPanel panCenter = new JPanel();
    panCenter.setLayout(new FlowLayout());
    JLabel lblText = new JLabel("Enter text: ");
    txtText = new JTextField(20);
    txtText.addActionListener(this);
    panCenter.add(lblText);
    panCenter.add(txtText);
    c.add(panCenter, BorderLayout.CENTER);

    setUpMenu();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == txtText) {
      JOptionPane.showMessageDialog(null, "You clicked enter in the textfield");
    } else if (e.getSource() == buttonClose) {
      System.exit(0);
    } else {
      JOptionPane.showMessageDialog(null, txtText.getText());
    }
  }

  public ExampleFrame() {
    setUpGUI();
  }

}
