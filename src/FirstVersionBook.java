public class FirstVersionBook implements Book {
    private String bookTitle;

    public FirstVersionBook(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String bookVersion() {
        return "La version del libro es la numero 1";
    }

    @Override
    public String numberOfPagina() {
        return "La cantidad de hojas son 100";
    }

}
