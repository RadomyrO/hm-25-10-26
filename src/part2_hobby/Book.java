package part2_hobby;

// Part 2. Hobby class - book
public class Book {
    // 2.1. Private props
    private String title;
    private String author;
    private int pages;
    private int pagesRead;
    private double price;

    // 2.2. Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.pagesRead = 0;
        this.price = 0;
    }

    // 2.1. Getters/setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public int getPagesRead() { return pagesRead; }
    public void setPagesRead(int pagesRead) {
        // can't read more than book has
        this.pagesRead = Math.min(pagesRead, pages);
    }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // 2.3. Logic methods
    public double progress() {
        return pages == 0 ? 0 : pagesRead * 100.0 / pages;
    }

    public int pagesLeft() {
        return pages - pagesRead;
    }

    public double pricePerPage() {
        return pages == 0 ? 0 : price / pages;
    }

    public String description() {
        return String.format("\"%s\" by %s | %d pages, read %d (%.1f%%), left %d | price %.2f (%.3f per page)",
                title, author, pages, pagesRead, progress(), pagesLeft(), price, pricePerPage());
    }
}
