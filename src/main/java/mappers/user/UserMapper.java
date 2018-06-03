package mappers.user;

import entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户mapper类。
 *
 * @author rango
 *         2018-06-02 20:59
 **/
public interface UserMapper {

    /**
     * 查询用户列表。
     * @return List<User>
     */
    @Select("select c_id as id, d_update_time as updateTime from t_user")
    List<User> getUserList();

    /**
     * 新增用户。
     * @param user 用户实体
     * @return int
     */
    int addUser(User user);
}
