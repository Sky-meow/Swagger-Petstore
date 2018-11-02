package template.mapper;

import java.util.List;
import template.entity.Category;

public interface CategoryMapper {
    int insert(Category record);

    List<Category> selectAll();
}