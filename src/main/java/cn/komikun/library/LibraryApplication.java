package cn.komikun.library;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:04
 * @description：
 * @modified By：
 * @version:
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.komikun.library.mapper")
@SpringBootApplication
public class LibraryApplication {
  public static void main(String[] args) {
    SpringApplication.run(LibraryApplication.class, args);
  }

}
