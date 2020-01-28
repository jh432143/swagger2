package com.example.swagger2.controller;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShopApiController {
    @RequestMapping(value = "/api/shop", method = RequestMethod.POST)
    @ResponseBody
    public int createShop (HttpServletRequest request, HttpServletResponse response) {
        int count = 0;

        return count;
    }

    @RequestMapping(value = "/api/shop", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject findShops (HttpServletRequest request, HttpServletResponse response) {

        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "kang");

        JSONObject jsonObject = new JSONObject(map);

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map2 = new HashMap<>();
        map2.put("id_2", "1_2");
        map2.put("name_2", "kang_2");
        list.add(map2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("id_3", "1_3");
        map3.put("name_3", "kang_3");
        list.add(map3);

        jsonObject.put("list", list);

        return jsonObject;
    }

    @RequestMapping(value = "/api/shop/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> findShop (HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id) {
        Map<String, String> map = new HashMap<>();

        return map;
    }

    @RequestMapping(value = "/api/shop", method = RequestMethod.PUT)
    @ResponseBody
    public int updateShop (HttpServletRequest request, HttpServletResponse response) {
        int count = 0;

        return count;
    }
}
