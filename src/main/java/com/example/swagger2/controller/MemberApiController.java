package com.example.swagger2.controller;

import com.example.swagger2.vo.MemberVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
public class MemberApiController {

    @ApiOperation(value = "맴버생성", notes = "memberVO를 받아 맴버를 생성")
    @RequestMapping(value = "/api/member", method = RequestMethod.POST)
    @ResponseBody
    public int createMember (HttpServletRequest request, HttpServletResponse response) {
        int count = 0;

        return count;
    }

    @ApiOperation(value = "맴버 리스트 조회")
    @RequestMapping(value = "/api/member", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> findMembers (HttpServletRequest request, HttpServletResponse response) {
        List<Map<String, String>> list = new ArrayList<>();

        return list;
    }

    @ApiOperation(value = "맴버 조회")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "맴버키", required = true, dataType = "string", defaultValue = "", paramType = "path")
    })
    @RequestMapping(value = "/api/member/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> findMember (HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id) {
        Map<String, String> map = new HashMap<>();

        return map;
    }

    @ApiOperation(value = "맴버 정보 변경")
    @RequestMapping(value = "/api/member", method = RequestMethod.PUT)
    @ResponseBody
    public int updateMember (HttpServletRequest request, HttpServletResponse response) {
        int count = 0;

        return count;
    }
}
