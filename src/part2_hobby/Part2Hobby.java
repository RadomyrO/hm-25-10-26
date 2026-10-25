package part2_hobby;

public class Part2Hobby {
    public static void main(String[] args) {
        // 2.4. Create objects
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book b3 = new Book("Dune", "Frank Herbert", 412);

        // set values via setters
        b1.setPagesRead(328);
        b1.setPrice(250);

        b2.setPagesRead(120);
        b2.setPrice(310.5);

        b3.setTitle("Dune (Book 1)");
        b3.setPagesRead(50);
        b3.setPrice(420);

        // output descriptions
        System.out.println(b1.description());
        System.out.println(b2.description());
        System.out.println(b3.description());
    }
}
