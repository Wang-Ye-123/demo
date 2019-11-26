package com.itrip.biz.service.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

public interface HotelService {
    /**
     * 所有旅店信息
     *
     * @return
     */
    public List<Hotel> getHotels();
}
