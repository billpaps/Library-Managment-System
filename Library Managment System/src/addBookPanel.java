import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addBookPanel implements ActionListener{

    private static Librarian librarianExecutioner;

    JFrame f;
    JTextArea bookTitle, bookPages, bookSubject;
    JButton submit;

    public addBookPanel() {

        f = new JFrame();

        bookTitle = new JTextArea(1, 30);
        bookPages = new JTextArea(1, 30);
        bookSubject = new JTextArea(1, 30);

        submit = new JButton("Submit");
        submit.setBounds(50, 250, 100, 30);

        bookTitle.setBounds(50,100,100,20);
        bookPages.setBounds(50,150,100,20);
        bookSubject.setBounds(50,200,100,20);

        f.add(bookTitle);
        f.add(bookPages);
        f.add(bookSubject);
        f.add(submit);

        submit.addActionListener(this);

        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setLocationRelativeTo(null);
        f.setVisible(true);//making the frame visible

    }

    public void actionPerformed(ActionEvent e) {
        librarianExecutioner.add_book(bookTitle.getName(), bookPages.getName(), bookSubject.getName());
    }

}
