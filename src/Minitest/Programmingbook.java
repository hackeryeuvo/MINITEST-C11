package Minitest;

public class Programmingbook extends Book {
    String language;
    String framework;

    public Programmingbook(int id, String name, int price, String author, String language, String framework) {
        super(id, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public Programmingbook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public Programmingbook() {
    }

    public String getLanguage(String language) {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Programmingbook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
