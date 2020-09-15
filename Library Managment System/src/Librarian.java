import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends User{

    ArrayList<Book> Book_list = new ArrayList<Book>();

    public Librarian(String name, String job){
        super(name, job);
    }

    public Librarian(String name){
        super(name);
    }

    public void add_book(String name, String pages, String subject){
        Book book = new Book(name, pages, subject);
        Book_list.add(book);
    }

    public void view_books(){
        int count = 1;
        System.out.println("----------- " + Book_list.size() + " Librarians -------------");
        for(Book i: Book_list) {
            System.out.println(count + ". " + i.name);
            count++;
        }
    }

    public void issue_book(){
        int num;
        view_availiable_books();
        System.out.print("\n Which one will be issued? ");
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();

        System.out.println("This book is already borrowed. Choose another one");
    }

    public void view_issued_books() {
        int count = 0;
        for(Book i: Book_list) {
            if(i.issued)  {
                System.out.println(count + ". " + i.name);
            }
        }
    }

    public void view_availiable_books(){
        int count = 0;
        for(Book i: Book_list) {
            if(!i.issued)  {
                System.out.println(count + ". " + i.name);
            }
        }
    }

    public void return_book(String name){
        for(Book i: Book_list) {
            if(i.name == name) {
                System.out.println("Thank you for returning!");
                i.setIssued(false);
            }
        }
    }


}
