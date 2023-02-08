public class Main {

    public static void main(String[] args) {
        Client client1 = new Client(new FirstVersionFactory());
        Client client2 = new Client(new SecondVersionFactory());

        //cliente compro la edición 1 del libro
        Book bookCliente1 =client1.version.createBook("El retrato de Dorian Gray");
        Poster posterCliente1=client1.version.createPoster();
        System.out.println(bookCliente1.bookVersion()+" "+ bookCliente1.numberOfPagina()+";"+posterCliente1.versionPoster());

        //cliente compro la edición 2 del libro
        Book bookCliente2 = client2.version.createBook("El retrato de Dorian Gray");
        Poster posterCliente2 = client2.version.createPoster();
        System.out.println(bookCliente2.bookVersion()+" "+ bookCliente2.numberOfPagina()+"; "+posterCliente2.versionPoster());

    }
}
