package com.example;

import com.example.entity.*;
import com.example.mapper.ClassManagement;
import com.example.mapper.HistoryTableDao;
import com.example.mapper.StudentdetailsDao;
import com.example.service.ClassTableService;
import com.example.service.StudentdetailsService;
import com.example.service.TeacherService;
import com.example.utils.ResponseResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
public class HTtests {

    @Autowired
    private ClassManagement classManagement;
    @Autowired
    private StudentdetailsService studentdetailsService;

    @Autowired
    private ClassTableService classTableService;
    @Autowired
    private TeacherService teacherService;

    @Test
    public void bb(){
        List<HistoryTable2> historyTable2s = classManagement.getClassAll();
        System.out.println(historyTable2s);
    }
    @Test
    public void cc(){
        List<Studentdetails> studentAll = studentdetailsService.getStudentAll();
        System.out.println(studentAll);
    }
    @Test
    public void dd(){
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        List<Map<String,String>> list = new ArrayList<>();
        for (ClassTable s:classTableAll){
            Map<String,String> map = new HashMap<>();
            map.put("clsid",s.getClassId().toString());
            map.put("clsname",s.getClassName());
            list.add(map);
        }
        System.out.println(list);
    }

    @Test
    public void cd(){
        List<Studentdetails> studentLikeId = studentdetailsService.getStudentLikeId(1);
        List<Map<String,String>> list = new ArrayList();

        for (Studentdetails s : studentLikeId){
            Map<String,String> map = new HashMap();
            map.put("stid",s.getSdId().toString());
            map.put("stname",s.getSdName());
            map.put("clsid",s.getClassId());
            list.add(map);
        }
        System.out.println(list);


    }
    @Test
    public void aas(){
        ClassTable byId = classTableService.getById(1);

        Map<String,String> map = new HashMap<>();
        map.put("clsid",byId.getClassId().toString());
        map.put("clsname",byId.getClassName());
        System.out.println(byId);
    }
    @Test
    public void aaaa(){
        List<Teacher> teacherAll = teacherService.getTeacherAll(1);
        List<Map<String,String>> list = new ArrayList<>();
        for (Teacher s : teacherAll){
            HashMap<String, String> map = new HashMap<>();
            map.put("teid",s.getTeacherId().toString());
            map.put("tename",s.getTeacherName());
            list.add(map);
        }
        System.out.println(list);
    }

    @Test
    public void ccc(){
        List<Studentdetails> studentAll = studentdetailsService.getStudentAll();
        List<ClassTable> classTableAll = classTableService.getClassTableAll();
        Map map = new HashMap();
        map.put("StudentInformation",studentAll);
        map.put("ClassInformation",classTableAll);
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
}


