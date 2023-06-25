package com.example.controller;

import com.example.entity.CompetentTeacher;
import com.example.entity.StudentVO;
import com.example.entity.Teacher;
import com.example.service.CompetentTeacherService;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("lxstudent")
public class lx {
    @Resource
    private StudentService studentService;

    @RequestMapping("/listStudent")
    public ResponseResult findStudentAll(Integer pagination , Integer  pagesize){

        if (pagination==null){
            pagination=1;
        }
        if (pagesize==null){
            pagesize=10;
        }
        HashMap studentAllNotPay = studentService.findStudentAll_not_pay(pagination, pagesize);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //yyyy-MM-dd HH:mm:ss
        List<StudentVO> studentAll = (List<StudentVO>) studentAllNotPay.get("studentVOS");
        for (StudentVO studentVO : studentAll) {

            Integer sdSex = studentVO.getSdSex();

            if(sdSex == 0){
                studentVO.setSSex("女");
            }else{
                studentVO.setSSex("男");
            }

            studentVO.setSdSex(null);

            Date date = studentVO.getDate();

            String format = sdf.format(date);

            studentVO.setDatetime(format);
            studentVO.setDate(null);
        }
        return ResponseResult.getResponseResult("获取数据成功",studentAllNotPay);
    }
    @RequestMapping("/findStudentAll_like_name")
    public ResponseResult<List<StudentVO>> findStudentAll_like_name( String name){

        List<StudentVO> studentAll = studentService.findStudentAll_like_name(name);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (StudentVO studentVO : studentAll) {

            Integer sdSex = studentVO.getSdSex();

            if(sdSex == 0){
                studentVO.setSSex("女");
            }else{
                studentVO.setSSex("男");
            }

            studentVO.setSdSex(null);

            Date date = studentVO.getDate();

            String format = sdf.format(date);

            studentVO.setDatetime(format);
            studentVO.setDate(null);
        }
        return ResponseResult.getResponseResult("获取数据成功",studentAll);
    }

    @RequestMapping("delete_stu")
    public ResponseResult deleteStudent(Integer id) {


        if (id==null){
            return ResponseResult.getResponseResult(400,"请把id传过来");
        }

        try {
            int del = studentService.del(id);
            if (del > 0) {
                return ResponseResult.getResponseResult("删除数据成功");
            }
            return ResponseResult.getResponseResult(400,"删除数据失败");
        } catch (Exception e) {
            return ResponseResult.getResponseResult(400,"删除数据失败");
        }
    }

    @RequestMapping("update_stu")
    public ResponseResult update_stu( StudentVO studentVO){
        System.out.println("studentVO = " + studentVO);
        try {
            int i = studentService.update_stu(studentVO);
            if (i > 0) {
                return ResponseResult.getResponseResult("更新数据成功");
            }
            return ResponseResult.getResponseResult(400,"更新数据失败");
        } catch (Exception e) {
            return ResponseResult.getResponseResult(400,"更新数据失败");
        }
    }

    @RequestMapping("insert_stu")
    public ResponseResult insert_stu(@RequestBody StudentVO studentVO){

        System.out.println("studentVO = "+studentVO);
        try {
            int i = studentService.insert_stu(studentVO);
            if (i > 0){
                return ResponseResult.getResponseResult("新增数据成功");
            }
            return ResponseResult.getResponseResult(400, "新增数据失败");
        } catch (Exception e) {
            return ResponseResult.getResponseResult(400, "新增数据失败");
        }

    }

    @Resource
    private TeacherService teacherService;
//个人(获取所有老师的所有学生数量)
    @RequestMapping("listView_tea")
    public ResponseResult listView_tea() {

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();        List<Teacher> teachers = teacherService.count_teacher();
        for (Teacher teacher : teachers) {
            int i = studentService.query_tid(teacher.getTeacherId());
            stringIntegerHashMap.put(teacher.getTeacherName(), i);
        }


        return ResponseResult.getResponseResult("获取数据成功", stringIntegerHashMap);
    }
    @Resource
    private   CompetentTeacherService competentTeacherService;

    @RequestMapping("citd_tea")
    public ResponseResult citd_tea(){

        ArrayList objects = new ArrayList();
        List<CompetentTeacher> competentTeachers = competentTeacherService.query_all();
        for (CompetentTeacher competentTeacher : competentTeachers) {
            List<Teacher> teachers = teacherService.query_ctid(competentTeacher.getCtid());
            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
            
            for (Teacher teacher : teachers) {
                int i = studentService.query_tid(teacher.getTeacherId());
                stringIntegerHashMap.put(teacher.getTeacherName(),i);
            }
            objects.add(stringIntegerHashMap);
        }


        return ResponseResult.getResponseResult("获取数据成功", objects);
    }

    @RequestMapping("intra_class")
    public ResponseResult intra_class( Integer id){

        CompetentTeacher competentTeacher = competentTeacherService.query_ctid(id);
        if (competentTeacher!=null){
            List<Teacher> teachers = teacherService.query_ctid(competentTeacher.getCtid());
            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
            for (Teacher teacher : teachers) {
                int i = studentService.query_tid(teacher.getTeacherId());
                stringIntegerHashMap.put(teacher.getTeacherName(),i);
            }
            return ResponseResult.getResponseResult("响应成功",stringIntegerHashMap);
        }

        return ResponseResult.getResponseResult("数据为空");
    }



@RequestMapping("quert_detail_stu")
    public ResponseResult quert_detail_stu( Integer id){

        if (id==null){

            return ResponseResult.getResponseResult(400, "请把id传过来");
        }
    StudentVO studentVO = studentService.query_stuSelfById(id);

    return ResponseResult.getResponseResult("响应成功", studentVO);
}

@RequestMapping("/update_pay")
    public ResponseResult update_pay( Integer id) {
        int i = studentService.update_pay(id);
        if (i == 0) {
            return ResponseResult.getResponseResult(400, "修改失败");
        }
        return ResponseResult.getResponseResult("修改成功");
}


}
