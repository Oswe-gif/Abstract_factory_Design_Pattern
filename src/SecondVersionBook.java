public class SecondVersionBook implements Book {
    private String bookTitle;

    public SecondVersionBook(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String bookVersion() {
        return "La version del libro es la numero 2";
    }

    @Override
    public String numberOfPagina() {
        return "La cantidad de hojas son 150";
    }
}
