package cn.komikun.library.entities;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:24
 * @description：
 * @modified By：
 * @version:
 */
public class Manager {
  private int id;
  private String password;
  private String name;
  private String phoneNumber;

  public Manager(int id, String password, String name, String phoneNumber) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
