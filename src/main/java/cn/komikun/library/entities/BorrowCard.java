package cn.komikun.library.entities;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:21
 * @description：
 * @modified By：
 * @version:
 */
public class BorrowCard {
  private int id;
  private String name;
  private String department;
  private String catalog;

  public BorrowCard(int id, String name, String department, String catalog) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.catalog = catalog;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCatalog() {
    return catalog;
  }

  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }
}
