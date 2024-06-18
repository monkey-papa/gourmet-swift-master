package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.ArrayList;


@Mapper
public interface OrderDetailMapper {
    /**
     * 批量插入订单明情数据
     * @param orderDetailList
     */
    void insertBatch(ArrayList<OrderDetail> orderDetailList);

    /**
     * 根据订单id查询订单明细
     * @param orderId
     * @return
     */
    @Select("select * from order_detail where order_id = #{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);

    /**
     * 月销量
     *
     */
    @Select("<script>" +
            "SELECT * FROM order_detail WHERE order_id IN " +
            "<foreach item='item' index='index' collection='orderIds' open='(' separator=',' close=')'>" +
            "#{item}" +
            "</foreach>" +
            "</script>")
    List<OrderDetail> findDetailsByOrderIds(@Param("orderIds") List<Long> orderIds);
}
