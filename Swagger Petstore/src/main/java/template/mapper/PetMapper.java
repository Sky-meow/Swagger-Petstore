package template.mapper;

import java.util.List;
import template.entity.Pet;

public interface PetMapper {
    int insert(Pet record);

    List<Pet> selectAll();
}