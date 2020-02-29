package cn.komikun.library.mapper;

import cn.komikun.library.entities.Manager;
import org.springframework.stereotype.Repository;

/**
 * @author ：komikun
 * @date ：Created in 2020-02-27 22:31
 * @description：
 * @modified By：
 * @version:
 */
@Repository
public interface ManagerMapper {
  Manager getManagerByName();

}
