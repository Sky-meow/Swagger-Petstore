package template.mapper;

import java.util.List;
import template.entity.User;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}