package com.example;

import com.example.entity.*;
import com.example.mapper.ClassManagementHw;
import com.example.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
public class HTtests {
    @Autowired
    private ClassManagementHw classManagement;
    @Autowired
    private StudentdetailsHwService studentdetailsService;

    @Autowired
    private ClassTableServiceHw classTableService;
    @Autowired
    private TeacherServiceHw teacherService;
    @Autowired
    private ClassManagementHwService classManagementService;
    @Autowired
    private HistoryTableServiceHw historyTableService;
    @Autowired
    private RemindServiceHW remindServiceHW;

    @Test
    public void cc() {
        List<StudentdetailsHw> studentAll = studentdetailsService.getStudentAll();
        System.out.println(studentAll);
    }

    @Test
    public void dd() {
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        List<Map<String, String>> list = new ArrayList<>();
        for (ClassTable s : classTableAll) {
            Map<String, String> map = new HashMap<>();
            map.put("clsid", s.getClassId().toString());
            map.put("clsname", s.getClassName());
            list.add(map);
        }
        System.out.println(list);
    }

    @Test
    public void cd() {
        List<StudentdetailsHw> studentLikeId = studentdetailsService.getStudentLikeId(1);
        List<Map<String, String>> list = new ArrayList();

        for (StudentdetailsHw s : studentLikeId) {
            Map<String, String> map = new HashMap();
            map.put("stid", s.getSdId().toString());
            map.put("stname", s.getSdName());
            map.put("clsid", s.getClassId().toString());
            list.add(map);
        }
        System.out.println(list);


    }

    @Test
    public void aas() {
        ClassTable byId = classTableService.getById(1);

        Map<String, String> map = new HashMap<>();
        map.put("clsid", byId.getClassId().toString());
        map.put("clsname", byId.getClassName());
        System.out.println(byId);
    }

    @Test
    public void aaaa() {
        List<Teacher> teacherAll = teacherService.getTeacherAll(1);
        List<Map<String, String>> list = new ArrayList<>();
        for (Teacher s : teacherAll) {
            HashMap<String, String> map = new HashMap<>();
            map.put("teid", s.getTeacherId().toString());
            map.put("tename", s.getTeacherName());
            list.add(map);
        }
        System.out.println(list);
    }

    @Test
    public void ccc() {
        List<StudentdetailsHw> studentAll = studentdetailsService.getStudentAll();
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        Map map = new HashMap();
        map.put("StudentInformation", studentAll);
        map.put("ClassInformation", classTableAll);
        System.out.println(map);
    }

    @Test
    public void qq() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        Date parse = simpleDateFormat.parse(format);
        System.out.println(parse);

    }

    @Test
    public void qe() {
        List<RefundHw3> refundAll = classManagement.getRefundAll();
        List<Map<String, String>> list = new ArrayList<>();
        for (RefundHw3 s : refundAll) {
            if (s.getStuId().toString().contains("1")) {
                System.out.println(s);
                if (s.getState() == 1) {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("stid", s.getStuId().toString());
                    map.put("stname", s.getSdName());
                    StudentdetailsHw studentById = studentdetailsService.getStudentById(s.getStuId());
                    map.put("clsid", studentById.getClassId().toString());
                    list.add(map);
                }
            }
        }
        for (Map<String, String> s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void al() {
        List<ReturnHw1> likeId = classManagementService.getLikeId("1");
        if (likeId.size() == 0) {

        }
        List<Map<String, String>> list = new ArrayList<>();
        for (ReturnHw1 s : likeId) {
            HashMap<String, String> map = new HashMap<>();
            Integer sdId = s.getSdId();
            String sdName = s.getSdName();
            map.put("stuid", sdId.toString());
            map.put("stuname", sdName);
            StudentdetailsHw studentById = studentdetailsService.getStudentById(sdId);
            Integer classId = studentById.getClassId();
            map.put("clsid", classId.toString());
            ClassTable byId = classTableService.getById(classId);

            String className = byId.getClassName();
            map.put("clsname", className);
            list.add(map);
        }
        System.err.println(list);
    }

    @Test
    public void test22(){

        ClassTable byId = classTableService.getById(1);
        System.err.println("byId = " + byId);

    }

    @Test
    public void add() {
        Date date = new Date();
        int addrefund = classManagementService.addrefund(1, 1, date, "123", 1);
        System.out.println(addrefund);
    }

    @Test
    public void abb() {
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
            Teacher teacherByid = teacherService.getTeacherByid(s.getProposer());
            if (teacherByid.equals("") || teacherByid==null){
                continue;
            }else {
                h.setProname(teacherByid.getTeacherName());
                Date applyforTime = s.getApplyforTime();
                String apply = sdf.format(applyforTime);
                h.setSqtime(apply);
                h.setState(s.getState());
                Date agree = s.getAgreeTime();
                String agre = sdf.format(agree);
                h.setSptime(agre);
            }
            list.add(h);
        }
        for (HistoryTableHw2 s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void all() {
        historyTableService.uphistory1(1);//同意
        HistoryTableHw htb = historyTableService.getHistoryTableByid(1);
        Integer stuId = htb.getStuId();
        StudentdetailsHw studentdetails = new StudentdetailsHw();
        studentdetails.setClassId(1);
        studentdetailsService.upStudentById(stuId, studentdetails);


    }

    @Test
    public void aoo() {
        remindServiceHW.insertRemind("退费提示", 5);

    }

    @Test
    public void a22() {
        String id = "2";
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
            if (s.getStuId().toString().contains(id)) {
                HistoryTableHw2 h = new HistoryTableHw2();
                h.setId(s.getId());
                h.setStid(studentById.getSdId());
                h.setStname(studentById.getSdName());
                h.setYclsname(byId1.getClassName());
                h.setZrclsname(byId2.getClassName());
                Teacher teacherByid = teacherService.getTeacherByid(s.getProposer());
                System.out.println(teacherByid.getTeacherName());
                h.setProname(teacherByid.getTeacherName());
                Date date = new Date();
//                h.setSqtime(date);
//                h.setState(1);
//                h.setSptime(date);
//                list.add(h);
            }
            for (HistoryTableHw2 a : list){
                System.out.println(a);

            }
        }
    }

    @Test
    public void a99(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Date aa;
        long time = new Date().getTime();
        System.out.println(time);
    }
    @Test
    public void a10() {
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
            Teacher teacherByid = teacherService.getTeacherByid(s.getProposer());
            if (teacherByid.equals("") || teacherByid == null) {
                continue;
            } else {
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
            System.out.println(list);
        }
    }
    @Test
    public void a80(){
        String name ="李";
        if (name==null || name.equals("")){
//            return ResponseResult.getResponseResult(400,"参数为空或者参数有误");
            System.out.println("有问题");
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
            Teacher teacherByid = teacherService.getTeacherByid(s.getProposer());
            if (teacherByid.equals("") || teacherByid==null){
                continue;
            }else {
                h.setProname(teacherByid.getTeacherName());
                Date applyforTime = s.getApplyforTime();
                String apply = sdf.format(applyforTime);
                h.setSqtime(apply);
                h.setState(s.getState());
                Date agree = s.getAgreeTime();
                if (agree!=null){
                    String agre = sdf.format(agree);
                    h.setSptime(agre);
                }
               h.setSptime("");
            }
            list.add(h);

        }
        List<HistoryTableHw2> list1 = new ArrayList();
        for (HistoryTableHw2 s:list){
            if (s.getStname().contains(name)){
                list1.add(s);
            }
        }
        System.err.println(list1);
    }
}




