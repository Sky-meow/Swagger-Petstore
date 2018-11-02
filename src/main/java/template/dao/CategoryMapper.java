package template.dao;

import template.entity.Category;
import java.util.List;

public interface CategoryMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Category record);


    Category selectByPrimaryKey(Integer id);


    List<Category> selectAll();


    int updateByPrimaryKey(Category record);
}