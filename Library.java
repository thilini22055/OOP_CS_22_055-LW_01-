import java.util.ArrayList;
public class Library {
    private ArrayList<BorrowableItems> borrowableItemsList = new ArrayList<>();
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).getTitle().equalsIgnoreCase(title)) {
                ((Book) item).setAvailable(false);
            }
        }
    }
    public void listAvailableItems() {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                item.displayInfo();
            }
        }
    }
    public void displayLibraryInfo() {
        int count = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                count++;
            }
        }
        System.out.println("Total available items: " + count);
    }
}

