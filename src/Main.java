public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "Portable music player", "MP3-001", 49.99f, 3600);
        Book book = new Book("Java Programming", "Introduction to Java programming", "BOOK-001", 29.99f, "John Doe", 400, "Programming");

        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}
