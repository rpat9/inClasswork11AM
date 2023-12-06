package FunWithUserInterfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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

  public void setupMenu() {
    JMenuBar bar = new JMenuBar();
    setJMenuBar(bar);
    JMenu mnuFile = new JMenu("File");
    bar.add(mnuFile);
    JMenuItem miSayHi = new JMenuItem("Say Hi!");
    mnuFile.add(miSayHi);
    miSayHi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hi!");
      }
    });
    JMenuItem miSave = new JMenuItem("Save");
    mnuFile.add(miSave);
    miSave.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
          File f = chooser.getSelectedFile();
          try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            pw.println(txtText.getText());
            pw.close();
            JOptionPane.showMessageDialog(null, "File was saved.");
          } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Could not save.");
          }
        }
      }
    });
    JMenuItem miExit = new JMenuItem("Exit");
    miExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    mnuFile.add(miExit);
    JMenu mnuHelp = new JMenu("Help");
    bar.add(mnuHelp);
    JMenuItem miAbout = new JMenuItem("About");
    miAbout.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "The greatest thing ever!");
      }
    });
    mnuHelp.add(miAbout);
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

    setupMenu();
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
