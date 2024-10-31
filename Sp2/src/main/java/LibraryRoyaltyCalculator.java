public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        // Create an author with a name
        Author author = new Author("Sussi Bech");

        // Create books (PrintedBook and AudioBook) with various details
        PrintedBook comicBook = new PrintedBook("Comic Book", "TE", 140, 72);
        PrintedBook childrenBook = new PrintedBook("Children's Book", "BI", 100, 50);
        AudioBook fictionAudio = new AudioBook("Fiction Audio", "SKØN", 10, 400);

        // Add titles to the author
        author.addTitle(comicBook);
        author.addTitle(childrenBook);
        author.addTitle(fictionAudio);

        // Calculate and display the total pay
        System.out.print(author.getName()+": "+ author.calculateTotalPay()+ "kr.");
    }
}
