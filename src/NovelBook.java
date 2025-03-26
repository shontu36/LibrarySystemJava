public class NovelBook extends Book {
    private String genre;
    NovelBook(String title, String isbn, String author, String genre){
        super(title,isbn,author);
        this.genre=genre;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Genre: "+genre);
    }
}
