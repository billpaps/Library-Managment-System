import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class MainMenu extends JFrame implements ActionListener {

    JFrame f;
    JButton adminButton, librarianButton;


    public MainMenu() {

        f = new JFrame();
        adminButton = new JButton("Admin");  //creating instance of JButton
        librarianButton = new JButton("Librarian");

        adminButton.setBounds(50, 100, 100, 40);  //x axis, y axis, width, height
        librarianButton.setBounds(180, 100, 100, 40);

        adminButton.addActionListener(this);
        librarianButton.addActionListener(this);

        f.add(adminButton);//adding button in JFrame
        f.add(librarianButton);

        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setLocationRelativeTo(null);
        f.setVisible(true);//making the frame visible
    }


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == adminButton) {
            System.out.println("Hello Admin");
            new AdminPanel();
            f.setVisible(false);
        }else {
            System.out.println("Hello Librarian");
            new LibrarianPanel();
            f.setVisible(false);
        }
    }

}
