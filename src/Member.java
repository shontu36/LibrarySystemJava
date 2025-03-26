public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROWED_LIMIT=5;
    //int booksborrowed;
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name" + getName());
        //System.out.println("Contact Info" + getContactInfo());
        System.out.println("Books Borrowed" + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROWED_LIMIT;
    }
    public Member(){
        super();
        borrowedBooksCount=0;
        //MAX_BORROWED_LIMIT=5;
    }
    Member(String name, String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount=0;
    }
    public void returnBook(){
        borrowedBooksCount--;
    }
}
