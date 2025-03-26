public class Librarian extends User{
private String employeeNumber;
    @Override
    public void displayDashboard() {
    System.out.println("Librarian Dashboard");
        System.out.println("Name"+getName());
        System.out.println("Employee Number"+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    public Librarian(String employeeNumber,String name, String contactInfo){
        super(name,contactInfo);
        this.employeeNumber=employeeNumber;

    }
    public void addNewBook(Book book){
        System.out.println("Book added");
    };
    public void removeBook(Book book){
        System.out.println("Book removed");
    }
}
