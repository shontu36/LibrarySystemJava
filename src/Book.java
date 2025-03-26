public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(){
        isAvailable=true;
    }
    public Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        isAvailable=true;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable=false;
            return true;
        }
        return false;
    }
    @Override
    public void returnBook(User user) {
        isAvailable=true;
        user.returnBooks();
    }
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayBookDetails();
}
