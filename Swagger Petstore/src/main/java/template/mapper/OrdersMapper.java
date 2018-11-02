package template.mapper;

import java.util.List;
import template.entity.Orders;

public interface OrdersMapper {
    int insert(Orders record);

    List<Orders> selectAll();
}