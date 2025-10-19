import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkOutItem(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(book.getTitle() + " has been checked out.");
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    System.out.println("- " + book.getTitle());
                }
            }
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Library Information:");
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    availableCount++;
                }
            }
        }
        System.out.println("Total available items: " + availableCount);
    }
}

