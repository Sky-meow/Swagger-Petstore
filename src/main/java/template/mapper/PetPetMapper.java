package template.mapper;

import java.util.List;
import template.entity.PetPet;

public interface PetPetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetPet record);

    PetPet selectByPrimaryKey(Integer id);

    List<PetPet> selectAll();

    int updateByPrimaryKey(PetPet record);
}