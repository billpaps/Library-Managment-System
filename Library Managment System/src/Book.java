public class Book {

    String name;
    String pages;
    String subject;
    boolean issued;



    public Book(String name, String pages, String subject) {
        this.name = name;
        this.pages = pages;
        this.subject = subject;
        this.issued = false;
    }

    public void setIssued(boolean issued)
    {
        this.issued = issued;
    }
}
