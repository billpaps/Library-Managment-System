import java.util.Scanner;

public class User{

    String name, job_title;

    public User(String name, String job_title) {
        this(name);
        this.job_title = job_title;
        give_job();
    }

    public User(String name) {
        this.name = name;
    }

    public User() { System.out.println("Default constructor"); }


    protected void give_job() {

        int check;

        if (this.job_title != null) {
            return;
        }

        System.out.println("0. Admin \n1. Librarian \n\n");
        Scanner myObj = new Scanner(System.in);
        check = myObj.nextInt();


        if (check == 0) {
            this.job_title = "Admin";
            System.out.println("Hi admin");
            return;
        }

        this.job_title = "Librarian";
        System.out.println("Hi " + this.job_title);
    }

    public String getName() {
        return name;
    }

    public String getJob_title() {
        return job_title;
    }


}
