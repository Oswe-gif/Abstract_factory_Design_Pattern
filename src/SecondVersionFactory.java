public class SecondVersionFactory implements Editionfactory {
    @Override
    public Book createBook(String title) {
        return new SecondVersionBook(title);
    }

    @Override
    public Poster createPoster() {
        return new SecondVersionPoster();
    }
}
