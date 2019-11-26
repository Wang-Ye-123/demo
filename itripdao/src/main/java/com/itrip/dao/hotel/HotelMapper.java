package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 旅店数据访问接口
 */
public interface HotelMapper {
    /**
     * 查询所有旅店信息
     *
     * @return
     */
    public List<Hotel> getHotels();
}
