import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianPanel extends JFrame implements ActionListener {

    JFrame f;
    JButton addBook, viewBook, issueBook, viewIssuedBooks, returnBook;

    public LibrarianPanel(){

        f = new JFrame();
        addBook = new JButton("Add Book");
        viewBook = new JButton("View Book");
        issueBook = new JButton("Issue Book");
        viewIssuedBooks = new JButton("View Issued Books");
        returnBook = new JButton("Remove Book");

        addBook.setBounds(50,100,100,40);
        viewBook.setBounds(50,170,100,40);
        issueBook.setBounds(50,240,100,40);
        viewIssuedBooks.setBounds(50,310,100,40);
        returnBook.setBounds(50,380,100,40);

        f.add(addBook);
        f.add(viewBook);
        f.add(issueBook);
        f.add(viewIssuedBooks);
        f.add(returnBook);

        addBook.addActionListener(this);

        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setLocationRelativeTo(null);
        f.setVisible(true);//making the frame visible

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addBook)
        {
            new addBookPanel();
            f.setVisible(false);
        }
        else if (e.getSource() == viewBook)
        {

        }
        else if(e.getSource() == issueBook)
        {

        }
        else if(e.getSource() == viewIssuedBooks)
        {

        }
        else if(e.getSource() == returnBook)
        {

        }

    }

}
