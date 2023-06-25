package com.example.controller;

import com.example.entity.*;
import com.example.service.*;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class DocsTransderringFeeHww {
    @Autowired
    private StudentdetailsHwService studentdetailsService;
    @Autowired
    private ClassManagementHwService classManagementService;
    @Autowired
    private ClassTableServiceHw classTableService;
    @Autowired
    private TeacherServiceHw teacherService;
    @Autowired
    private HistoryTableServiceHw historyTableService;
    @Autowired
    private RemindServiceHW remindServiceHW;


    /**
     *
     *      调单
     */

    @GetMapping("transferorderid") //调单 模糊查询学生信息id
    private ResponseResult TransferOrder(String id){
        if(id == null || id.equals("")){
            return new ResponseResult(400,"参数为空或者参数格式有误");
        }
        List<RefundHw3> refundAll = classManagementService.getRefundAll();
        List<Map<String,String>> list = new ArrayList<>();
        for (RefundHw3 s : refundAll){
            if (s.getStuId().toString().contains(id)){
                if (s.getState() == 1){
                HashMap<String, String> map = new HashMap<>();
                map.put("stid",s.getStuId().toString());
                map.put("stname",s.getSdName());
                    StudentdetailsHw studentById = studentdetailsService.getStudentById(s.getStuId());
                    Integer classId = studentById.getClassId();
                    map.put("clsid",classId.toString());
                    ClassTable byId = classTableService.getById(classId);
                    map.put("clsname",byId.getClassName());
                    list.add(map);
                }
            }
        }
        return ResponseResult.getResponseResult("符合条件的学生",list);
    }

    @GetMapping("classByid")//调单 按id查询班级
    private ResponseResult OriginalClass (String id){
        if(id == null){
            return new ResponseResult(400,"参数为空或者参数格式有误");
        }
        ClassTable byId = classTableService.getById(Integer.parseInt(id));
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
    public ResponseResult ProposerAll(String id){
        if(id == null || id.equals("")){
            Map map = new HashMap();
            map.put("isNull","false");
            return new ResponseResult(400,"参数为空或者参数格式有误",map);
        }
        List<TeacherHw> teacherAll = teacherService.getTeacherAll(Integer.parseInt(id));
        if (teacherAll.size()==0){
            Map map = new HashMap();
            map.put("isNull","false");
            return new ResponseResult(202,"没有查询到该id",map);
        }
        //判断id是否合规
        List<Map<String,String>> list = new ArrayList<>();
        for (TeacherHw s : teacherAll){
            HashMap<String, String> map = new HashMap<>();
            map.put("teid",s.getTeacherId().toString());
            map.put("tename",s.getTeacherName());
            map.put("isNull","true");
            list.add(map);
        }
        return ResponseResult.getResponseResult("申请人",list);
    }

    @PostMapping("addTransferOrder")//调单  添加
    public ResponseResult addTransferOrder(@RequestBody addTransHw1 addTrans){
        String stid = addTrans.getStid();
        String sqrid = addTrans.getSqrid();
        String zrclsid = addTrans.getZrclsid();
        if (stid == null || zrclsid == null || sqrid == null){
            return new ResponseResult(400,"参数有空值或者参数格式有误");
        }
        TeacherHw teacherByid = teacherService.getTeacherByid(Integer.parseInt(zrclsid));
        if (teacherByid == null){
            return new ResponseResult(400,"没有该老师");
        }
        StudentdetailsHw studentById = studentdetailsService.getStudentById(Integer.parseInt(stid));
        HistoryTableHw historyTable = new HistoryTableHw();
        historyTable.setStuId(Integer.parseInt(stid));
        historyTable.setNewClassId(Integer.parseInt(zrclsid));
        historyTable.setProposer(Integer.parseInt(sqrid));
        historyTable.setOldClassId(studentById.getClassId());
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







    /**
     *  退费
     */
    @GetMapping("return")//退费第一次请求
    public ResponseResult returnList(String id){
        if(id == null || id.equals("")){
            return new ResponseResult(400,"参数为空或者参数格式有误");
        }
        List<ReturnHw1> likeId = classManagementService.getLikeId(id);
        if (likeId.size()==0){
            return new ResponseResult(202,"当前id不存在");
        }
        List<Map<String,String>> list = new ArrayList<>();
        for (ReturnHw1 s : likeId){
            HashMap<String, String> map = new HashMap<>();
            Integer sdId = s.getSdId();
            String sdName = s.getSdName();
            map.put("stuid",sdId.toString());
            map.put("stuname",sdName);
            StudentdetailsHw studentById = studentdetailsService.getStudentById(sdId);
            Integer classId = studentById.getClassId();
            map.put("clsid",classId.toString());
            ClassTable byId = classTableService.getById(classId);
            String className = byId.getClassName();
            map.put("clsname",className);
            list.add(map);
        }
        return ResponseResult.getResponseResult("请求成功",list);
    }
    //调单老师请求 ===>  proposer

    //提交退费请求
    @PostMapping("returnfrom")
    public ResponseResult returnfrom(@RequestBody addreturnHw1 addreturn){
        String id = addreturn.getId();
        String sqrid = addreturn.getSqrid();
        String reason = addreturn.getReason();
        if (id.equals("") || id==null || sqrid==null || sqrid.equals("") ||reason.equals("") ||reason == null){
            return new ResponseResult(400,"参数为空或者参数格式有误");
        }
        Date date = new Date();
        classManagementService.addrefund(Integer.parseInt(id),1,date,reason,Integer.parseInt(sqrid));
        remindServiceHW.insertRemind(reason,Integer.parseInt(id));

        return ResponseResult.getResponseResult("请求成功");
    }






    //调班管理
    @GetMapping("historytable")
    public ResponseResult history(){
        List<HistoryTableHw> historyTableAll = historyTableService.getHistoryTableAll();
        List<HistoryTableHw2> list = new ArrayList();
        for (HistoryTableHw s:historyTableAll){
            Integer stuId = s.getStuId();
            StudentdetailsHw studentById = studentdetailsService.getStudentById(stuId);
            if (studentById==null){
                continue;
            }
            ClassTable byId1 = classTableService.getById(studentById.getClassId());
            ClassTable byId2 = classTableService.getById(s.getNewClassId());
            HistoryTableHw2 h = new HistoryTableHw2();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            h.setId(s.getId());
            h.setStid(studentById.getSdId());
            h.setStname(studentById.getSdName());
            h.setYclsname(byId1.getClassName());
            h.setZrclsname(byId2.getClassName());
            TeacherHw teacherByid = teacherService.getTeacherByid(s.getProposer());
            if (teacherByid.equals("") || teacherByid==null){
                continue;
            }else {
                h.setProname(teacherByid.getTeacherName());
                Date applyforTime = s.getApplyforTime();
                String apply = sdf.format(applyforTime);
                h.setSqtime(apply);
                h.setState(s.getState());
                Date agree = s.getAgreeTime();
                if (agree != null) {
                    String agre = sdf.format(agree);
                    h.setSptime(agre);
                }else{
                    h.setSptime("");
                }
            }
            list.add(h);
        }
        return ResponseResult.getResponseResult("请求成功",list);
    }

    //同意
    @GetMapping("uphistory1")
    public ResponseResult uphistory1(String id){
        if (id==null){
            return ResponseResult.getResponseResult(400,"参数为空或者参数有误");
        }
        historyTableService.uphistory1(Integer.parseInt(id));//同意
        HistoryTableHw htb = historyTableService.getHistoryTableByid(Integer.parseInt(id));
        Integer stuId = htb.getStuId();
        StudentdetailsHw studentdetails = new StudentdetailsHw();
        studentdetails.setClassId(htb.getNewClassId());
        studentdetailsService.upStudentById(stuId,studentdetails);

        return ResponseResult.getResponseResult("修改成功");
    }
    @GetMapping("uphistory2")
    public ResponseResult uphistory2(String id){
        if (id==null || id.equals("")){
            return ResponseResult.getResponseResult(400,"参数为空或者参数有误");
        }
        historyTableService.uphistory2(Integer.parseInt(id));//不同意
        return ResponseResult.getResponseResult("修改成功");
    }
    @GetMapping("uphistory3")
    public ResponseResult uphistory3(String id){
        if (id==null || id.equals("")){
            return ResponseResult.getResponseResult(400,"参数为空或者参数有误");
        }
        StudentdetailsHw studentById = studentdetailsService.getStudentById(Integer.parseInt(id));
        String sdName = studentById.getSdName();
        Integer classId = studentById.getClassId();
        ClassTable byId = classTableService.getById(classId);
        String className = byId.getClassName();
        Map<String ,String> map = new HashMap<>();
        map.put("stname",sdName);
        map.put("clsname",className);
        return ResponseResult.getResponseResult("转班信息",map);
    }
    @PostMapping("uphistory4")
    public ResponseResult uphistory4(String stid,String zrclsid){
        if (stid == null || stid.equals("") || zrclsid == null || zrclsid.equals("")){
            return ResponseResult.getResponseResult(400,"数据为空或者格式有误");
        }
        studentdetailsService.upStudent(Integer.parseInt(stid),Integer.parseInt(zrclsid));
        historyTableService.delhistory(Integer.parseInt(stid));
        return ResponseResult.getResponseResult();
    }
    @GetMapping("selhistory")
    public ResponseResult selhistory(String name) {
        if (name==null || name.equals("")){
            return ResponseResult.getResponseResult(400,"参数为空或者参数有误");
        }
        List<HistoryTableHw> historyTableAll = historyTableService.getHistoryTableAll();
        List<HistoryTableHw2> list = new ArrayList();
        for (HistoryTableHw s : historyTableAll) {
            Integer stuId = s.getStuId();
            StudentdetailsHw studentById = studentdetailsService.getStudentById(stuId);
            if (studentById == null) {
                continue;
            }
            ClassTable byId1 = classTableService.getById(studentById.getClassId());
            ClassTable byId2 = classTableService.getById(s.getNewClassId());
                HistoryTableHw2 h = new HistoryTableHw2();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                h.setId(s.getId());
                h.setStid(studentById.getSdId());
                h.setStname(studentById.getSdName());
                h.setYclsname(byId1.getClassName());
                h.setZrclsname(byId2.getClassName());
                TeacherHw teacherByid = teacherService.getTeacherByid(s.getProposer());
                if (teacherByid.equals("") || teacherByid==null){
                    continue;
                }else {
                    h.setProname(teacherByid.getTeacherName());
                    Date applyforTime = s.getApplyforTime();
                    String apply = sdf.format(applyforTime);
                    h.setSqtime(apply);
                    h.setState(s.getState());
                    Date agree = s.getAgreeTime();
                    if (agree != null) {
                        String agre = sdf.format(agree);
                        h.setSptime(agre);
                    }else{
                        h.setSptime("");
                    }
                }
                list.add(h);

        }
        List<HistoryTableHw2> list1 = new ArrayList();
        for (HistoryTableHw2 s:list){
            if (s.getStname().contains(name)){
                list1.add(s);
            }
        }
        return ResponseResult.getResponseResult("查询数据",list1);
    }













    @RequestMapping("dd00")//查询班级管理
    public ResponseResult aac(){
        List<StudentdetailsHw> studentAll = studentdetailsService.getStudentAll();
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
        List<HistoryTableHw2> classAll = classManagementService.getClassAll();
        return ResponseResult.getResponseResult("返回数据",classAll);
    }

}
