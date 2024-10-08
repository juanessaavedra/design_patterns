package patrones_creacionales.prototype.prototype_example;

public class Book implements Cloneable{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //Metodo para clonar un libro
    @Override
    public Book clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
