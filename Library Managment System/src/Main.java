public class Main {

    public static void main(String[] args) {

        MainMenu start = new MainMenu();
        Admin admin_test = new Admin("Bill Youzofski", "admin");

        admin_test.add_Librarian();
        admin_test.add_Librarian();
        admin_test.add_Librarian();
        admin_test.add_Librarian();
        admin_test.add_Librarian();

        admin_test.view_Librarians();
    }
}
