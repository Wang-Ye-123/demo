package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.commom.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    //service对象
    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Dto queryHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return DtoUtil.returnSuccess("查询旅店成功", hotels);
    }
}