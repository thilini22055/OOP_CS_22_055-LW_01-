public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        Library library = new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        Student student1 = new Student("Thilini Yashoda");

        library.checkOutItem(book1);
        library.displayLibraryInfo();
        library.listAvailableItems();
    }
}

