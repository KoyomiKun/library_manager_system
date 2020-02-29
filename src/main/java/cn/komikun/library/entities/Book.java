package cn.komikun.library.entities;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:16
 * @description：
 * @modified By：
 * @version:
 */
public class Book {

  private String id;
  private String catalog;
  private String name;
  private String press;
  private int year;
  private String author;
  private double price;
  private int amount;
  private int save;

  public Book(String id, String catalog, String name, String press, int year, String author,
      double price, int amount, int save) {
    this.id = id;
    this.catalog = catalog;
    this.name = name;
    this.press = press;
    this.year = year;
    this.author = author;
    this.price = price;
    this.amount = amount;
    this.save = save;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCatalog() {
    return catalog;
  }

  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getSave() {
    return save;
  }

  public void setSave(int save) {
    this.save = save;
  }
}
