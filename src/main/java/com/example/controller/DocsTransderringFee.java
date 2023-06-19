package com.example.controller;

import com.example.entity.*;
import com.example.service.*;
import com.example.service.impl.ClassManagementServiceImpl;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class DocsTransderringFee {
    @Autowired
    private StudentdetailsService studentdetailsService;
    @Autowired
    private ClassManagementService classManagementService;
    @Autowired
    private ClassTableService classTableService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private HistoryTableService historyTableService;



    @GetMapping("transferorderid") //调单 模糊查询学生信息id
    private ResponseResult TransferOrder(Integer id){
        List<Studentdetails> studentLikeId = studentdetailsService.getStudentLikeId(id);
        List<Map<String,String>> list = new ArrayList();

        for (Studentdetails s : studentLikeId){
            Map<String,String> map = new HashMap();
            map.put("stid",s.getSdId().toString());
            map.put("stname",s.getSdName());
            map.put("clsid",s.getClassId());
            list.add(map);
        }
        return ResponseResult.getResponseResult("符合条件的学生",list);
    }

    @GetMapping("classByid")//调单 按id查询班级
    private ResponseResult OriginalClass (Integer id){
        ClassTable byId = classTableService.getById(id);
        Map<String,String> map = new HashMap<>();
        map.put("clsid",byId.getClassId().toString());
        map.put("clsname",byId.getClassName());
        return ResponseResult.getResponseResult("班级",map);
    }
    @GetMapping("classAll")//调单  转入班级
    public ResponseResult TransferToClass(){
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        List<Map<String,String>> list = new ArrayList<>();
        for (ClassTable s:classTableAll){
            Map<String,String> map = new HashMap<>();
            map.put("clsid",s.getClassId().toString());
            map.put("clsname",s.getClassName());
            list.add(map);
        }
        return ResponseResult.getResponseResult("班级",list);
    }
    @GetMapping("proposer")//调单  申请人
    public ResponseResult ProposerAll(Integer id){
        List<Teacher> teacherAll = teacherService.getTeacherAll(id);
        List<Map<String,String>> list = new ArrayList<>();
        for (Teacher s : teacherAll){
            HashMap<String, String> map = new HashMap<>();
            map.put("teid",s.getTeacherId().toString());
            map.put("tename",s.getTeacherName());
            list.add(map);
        }
        return ResponseResult.getResponseResult("申请人",list);
    }

    @PostMapping("addTransferOrder")//调单  添加
    public ResponseResult addTransferOrder(Integer stid,Integer zrclsid,Integer sqrid){
        Studentdetails studentById = studentdetailsService.getStudentById(stid);
        HistoryTable historyTable = new HistoryTable();
        historyTable.setStuId(stid);
        historyTable.setNewClassId(zrclsid);
        historyTable.setProposer(sqrid);
        historyTable.setOldClassId(Integer.parseInt(studentById.getClassId()));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        try {
            Date parse = simpleDateFormat.parse(format);
            historyTable.setApplyforTime(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        historyTable.setState(1);
        System.out.println(historyTable);
        historyTableService.setHistoryTable(historyTable);

        return ResponseResult.getResponseResult("请求成功");
    }








    @RequestMapping("dd00")//查询班级管理
    public ResponseResult aac(){
        List<Studentdetails> studentAll = studentdetailsService.getStudentAll();
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        Map map = new HashMap();
        map.put("StudentInformation",studentAll);
        map.put("ClassInformation",classTableAll);
        return ResponseResult.getResponseResult("map信息",map);
    }

    @GetMapping("bb01")
    public ResponseResult acb(String id){
        ClassTable byId = classTableService.getById(Integer.parseInt(id));
        return ResponseResult.getResponseResult("班级",byId);
    }

    @PostMapping("dd01")
    public ResponseResult abc(String xinxi,String yxinxi,String zxinxi,String sqr){
        System.out.println(xinxi+yxinxi+zxinxi+sqr);

        return ResponseResult.getResponseResult("请求成功",123);
    }

    @RequestMapping("dd02")
    public ResponseResult aaa(){
        List<HistoryTable2> classAll = classManagementService.getClassAll();
        return ResponseResult.getResponseResult("返回数据",classAll);
    }

}
