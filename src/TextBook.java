public class TextBook extends Book {
    private String subject;
    private int edition;
    TextBook(String title, String isbn, String author, int edition, String subject){
        super(title,isbn,author);
        this.edition=edition;
        this.subject=subject;
    }
    @Override
    public void displayBookDetails() {
    System.out.println("Subject: "+subject+" Edition: "+edition+"");
    }
}
