package cn.komikun.library;

import cn.komikun.library.entities.Book;
import cn.komikun.library.mapper.BookMapper;
import cn.komikun.library.mapper.BorrowCardMapper;
import cn.komikun.library.mapper.ManagerMapper;
import cn.komikun.library.mapper.RecordMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-28 20:17
 * @description：
 * @modified By：
 * @version:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookTest {
  @Autowired
  private BookMapper bookMapper;

  @Autowired
  private BorrowCardMapper borrowCardMapper;

  @Autowired
  private ManagerMapper managerMapper;

  @Autowired
  private RecordMapper recordMapper;

  private final Logger logger = LoggerFactory.getLogger(BookTest.class);

  @Test
  public void insertBookTest(){
        bookMapper.insertBook(new Book("980807", "数学", "微积分",
        "浙江大学出版", 2010, "苏", 40.2, 100, 100));
  }

  @Test
  public void insertBooksTest(){
    List<Book> books = new ArrayList<>();
    List<String> bookRows = readFile("/data/insertbooks");
    for(String string : bookRows) {
      string = string.replace(" ", "");
      String subString = string.substring(1, string.length() - 1);
      String[] bookString = subString.split(",");
      logger.info("insert: "+ subString);
      books.add(new Book(bookString[0], bookString[1], bookString[2], bookString[3],
          Integer.parseInt(bookString[4]), bookString[5], Double.parseDouble(bookString[6]),
          Integer.parseInt(bookString[7]), Integer.parseInt(bookString[7])));
    }
    bookMapper.insertBooks(books);
  }
  @Test
  public void selectBookByIdTest(){

  }
  private List<String> readFile(String filepath) {
    List<String> list = new ArrayList<>();
    Resource resource = new ClassPathResource(filepath);
    try {
      File file = resource.getFile();
      if (file.isFile() && file.exists()) {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
        BufferedReader bf = new BufferedReader(reader);
        String nextLine = null;
        while ((nextLine = bf.readLine()) != null) {
          list.add(nextLine);
        }
      }else{
//        System.out.println("No such file!");
        logger.error("No such file!");
      }

    } catch (IOException e) {
      logger.error("Read file failed!");
      e.printStackTrace();
    }
    return list;
  }
}
