public class FirstVersionFactory implements Editionfactory {
    @Override
    public Book createBook(String title) {
        return new FirstVersionBook(title);
    }

    @Override
    public Poster createPoster() {
        return new FirstVersionPoster();
    }
}
