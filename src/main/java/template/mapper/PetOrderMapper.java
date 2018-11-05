package template.mapper;

import java.util.List;
import template.entity.PetOrder;

public interface PetOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetOrder record);

    PetOrder selectByPrimaryKey(Integer id);

    List<PetOrder> selectAll();

    int updateByPrimaryKey(PetOrder record);
}