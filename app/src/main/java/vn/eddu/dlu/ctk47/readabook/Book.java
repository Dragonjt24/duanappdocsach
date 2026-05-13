package vn.eddu.dlu.ctk47.readabook;

public class Book {
    private String title;
    private String author;
    private String image;
    private String category;

    public Book() {

    }
    public Book(String title, String author, String image, String category) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }
}
