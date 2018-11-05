package template.mapper;

import java.util.List;
import template.entity.PetUser;

public interface PetUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetUser record);

    PetUser selectByPrimaryKey(Integer id);

    List<PetUser> selectAll();

    int updateByPrimaryKey(PetUser record);
}