import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();


        /*
        Author author = new Author();
        author.setName("Halide Edip Adıvar");
        author.setBirthday(LocalDate.parse("1964-04-02"));
        author.setCountry("İstanbul");
        entityManager.persist(author);

        Author author1 = new Author();
        author1.setName("P.J Parrish");
        author1.setBirthday(LocalDate.parse("1970-08-12"));
        author1.setCountry("Paris");
        entityManager.persist(author1);

        Author author2 = new Author();
        author2.setName("Halit Ziya Uşaklıgil");
        author2.setBirthday(LocalDate.parse("1960-01-30"));
        author2.setCountry("İzmir");
        entityManager.persist(author2);

        Publisher publisher = new Publisher();
        publisher.setName("Yayınevi");
        publisher.setEstablishmentYear(1985);
        publisher.setAddress("Ankara");
        entityManager.persist(publisher);

        Publisher publisher1 = new Publisher();
        publisher1.setName("Kitapevi");
        publisher1.setEstablishmentYear(1995);
        publisher1.setAddress("Adana");
        entityManager.persist(publisher1);



        Book book = new Book();
        book.setName("Sinekli Bakkal");
        book.setPublicationYear(2000);
        book.setStock(200);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager.persist(book);

        Book book1 = new Book();
        book1.setName("Ölüm Şarkısı");
        book1.setPublicationYear(2003);
        book1.setStock(50);
        book1.setAuthor(author1);
        book1.setPublisher(publisher);
        entityManager.persist(book1);

        Book book2 = new Book();
        book2.setName("Aşk-ı Memnu");
        book2.setPublicationYear(1994);
        book2.setStock(75);
        book2.setAuthor(author2);
        book2.setPublisher(publisher1);
        entityManager.persist(book2);

        BookBorrowwing bookBorrowwing = new BookBorrowwing();
        bookBorrowwing.setBorrowerName("Cantuğ Gezginci");
        bookBorrowwing.setBorrowingDate(LocalDate.parse("2023-10-19"));
        bookBorrowwing.setBook(book);
        entityManager.persist(bookBorrowwing);

        BookBorrowwing bookBorrowwing1 = new BookBorrowwing();
        bookBorrowwing1.setBorrowerName("Cantuğ Gezginci");
        bookBorrowwing1.setBorrowingDate(LocalDate.parse("2023-09-19"));
        bookBorrowwing1.setBook(book1);
        entityManager.persist(bookBorrowwing1);

        BookBorrowwing bookBorrowwing2 = new BookBorrowwing();
        bookBorrowwing2.setBorrowerName("Aytuğ Gezginci");
        bookBorrowwing2.setBorrowingDate(LocalDate.parse("2023-11-29"));
        bookBorrowwing2.setBook(book1);
        entityManager.persist(bookBorrowwing2);

        Category category1 = new Category();
        category1.setName("Siyasi");
        category1.setDescription("Siyasi Konular");
        Category category2 = new Category();
        category2.setName("Kültürel");
        category2.setDescription("Kültürel Konular");
        Category category3 = new Category();
        category3.setName("Gizem");
        category3.setDescription("Dedektiflik Konuları");
        Category category4 = new Category();
        category4.setName("Yasak Aşk");
        category4.setDescription("Aşk Konuları");
        Category category5 = new Category();
        category5.setName("Entrika");
        category5.setDescription("Entrika konuları");

        entityManager.persist(category1);
        entityManager.persist(category2);
        entityManager.persist(category3);
        entityManager.persist(category4);
        entityManager.persist(category5);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);
        book.setCategoryList(categoryList);

        List<Category> categoryList1 = new ArrayList<>();
        categoryList1.add(category3);
        book1.setCategoryList(categoryList1);

        List<Category> categoryList2 = new ArrayList<>();
        categoryList2.add(category4);
        categoryList2.add(category5);
        book2.setCategoryList(categoryList2);

         */

        BookBorrowwing borrowwing = entityManager.find(BookBorrowwing.class , 1);
        borrowwing.setReturnDate(LocalDate.parse("2023-11-19"));
        entityManager.persist(borrowwing);

        BookBorrowwing borrowwing1 = entityManager.find(BookBorrowwing.class , 2);
        borrowwing1.setReturnDate(LocalDate.now());
        entityManager.persist(borrowwing1);









        //Book book = entityManager.find(Book.class , 2);
        //entityManager.remove(book);











        transaction.commit();
    }
}
