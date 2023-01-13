package Minitest;

public class Fictionbook extends Book {
    String categeory;

    public Fictionbook(int id, String name, int price, String author, String categeory) {
        super(id, name, price, author);
        this.categeory = categeory;
    }

    public Fictionbook(String categeory) {
        this.categeory = categeory;
    }

    public Fictionbook() {
    }

    public String getCategeory() {
        return categeory;
    }

    public void setCategeory(String categeory) {
        this.categeory = categeory;
    }

    @Override
    public String toString() {
        return "Fictionbook{" +
                "categeory='" + categeory + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
