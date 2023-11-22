public class BookService {
    @Injected
    public BookRepository bookRepository;

    public void join() {
        System.out.println("Service join");
        bookRepository.rent();
    }
}