package template.mapper;

import java.util.List;
import template.entity.Tag;

public interface TagMapper {
    int insert(Tag record);

    List<Tag> selectAll();
}