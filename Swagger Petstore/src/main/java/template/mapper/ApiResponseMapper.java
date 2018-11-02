package template.mapper;

import java.util.List;
import template.entity.ApiResponse;

public interface ApiResponseMapper {
    int insert(ApiResponse record);

    List<ApiResponse> selectAll();
}