package cn.komikun.library.entities;


import java.sql.Date;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:25
 * @description：
 * @modified By：
 * @version:
 */
public class Record {
  private int cardId;
  private int bookId;
  private Date borrowDate;
  private Date returnDate;
  private int managerId;

  public Record(int cardId, int bookId, Date borrowDate, Date returnDate, int managerId) {
    this.cardId = cardId;
    this.bookId = bookId;
    this.borrowDate = borrowDate;
    this.returnDate = returnDate;
    this.managerId = managerId;
  }

  public int getCardId() {
    return cardId;
  }

  public void setCardId(int cardId) {
    this.cardId = cardId;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public Date getBorrowDate() {
    return borrowDate;
  }

  public void setBorrowDate(Date borrowDate) {
    this.borrowDate = borrowDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public int getManagerId() {
    return managerId;
  }

  public void setManagerId(int managerId) {
    this.managerId = managerId;
  }
}
