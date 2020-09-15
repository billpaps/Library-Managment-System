import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User{

    private int numAdmins = 0;
    static ArrayList<Librarian> Librarians_list = new ArrayList<Librarian>();

    public Admin(String name, String job){
        super(name, job);
    }

    public Admin(String name){
        super(name);
    }


    protected void add_Librarian(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Name : ");
        String new_name= myObj.next();

        Librarian Librarian = new Librarian(new_name, "Librarian");
        Librarians_list.add(Librarian);
    }

    protected void view_Librarians(){
        int count = 1;
        System.out.println("----------- " + Librarians_list.size() + " Librarians -------------");
        for(Librarian i: Librarians_list) {
            System.out.println(count + ". " + i.name);
            count++;
        }
    }

    protected void delete_Librarians(){
        int num;
        view_Librarians();
        System.out.println("\n Which one will be deleted? ");
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();
        Librarians_list.remove(num-1);
    }

}