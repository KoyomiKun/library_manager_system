package cn.komikun.library.mapper;

import cn.komikun.library.entities.Book;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:30
 * @description：
 * @modified By：
 * @version:
 */
@Repository
public interface BookMapper {
  void insertBook(Book book);
  void insertBooks(List<Book> bookList);
  List<Book> selectBookByCatalog(String catalog);
  List<Book> selectBookByName(String name);
  List<Book> selectBookByPress(String press);
  List<Book> selectBookByYear(int start,int end);
  List<Book> selectBookByAuthor(String author);
  List<Book> selectBookByPrice(double start,double end);
}
