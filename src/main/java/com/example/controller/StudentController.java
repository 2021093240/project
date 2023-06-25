package com.example.controller;

import com.example.entity.ClassTable;
import com.example.entity.StudentVO;
import com.example.entity.StudentVO;
import com.example.entity.Studentdetails;
import com.example.service.StudentService;
import com.example.service.ex.DataNullException;
import com.example.utils.ResponseResult;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController extends BaseController{

    @Resource
    private StudentService studentService;

    @RequestMapping("select_status")
    public ResponseResult<List> getSelectStatus(){

        List<StudentVO> studentVOS = studentService.selectStatus();

        if(studentVOS == null){
            return ResponseResult.getResponseResult("无未付款的学生!");
        }

        return ResponseResult.getResponseResult("查询成功",studentVOS);

    }



    @RequestMapping("/listStudent")
    public HashMap<String , Object> findStudentAll(Integer current,Integer pageSize){

        if(pageSize == null){

            pageSize = 10 ;
        }

        if(current == null){

            current = 1 ;
        }

        Integer total = studentService.findAllStudent();

        HashMap<String , Object> hashMap = new HashMap<>();
        List<StudentVO> studentAll = studentService.findStudentsAll(current,pageSize);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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

        }

        ResponseResult<List<StudentVO>> responseResult = ResponseResult.getResponseResult("获取数据成功", studentAll);
        hashMap.put("data" , responseResult);
        hashMap.put("current(当前页数)",current);
        hashMap.put("total" , total);

        return hashMap;
    }

    @RequestMapping("/insertStudent")
    public ResponseResult<Void> insertStudent(@RequestBody  StudentVO studentVO, HttpSession session){


        studentService.insertStudents(studentVO);

        return ResponseResult.getResponseResult(200,"添加成功");
    }

    @DeleteMapping("/deleteStudent")
    public ResponseResult<Void> deleteStudent(String sdName){

        System.out.println("sdName = " + sdName);

        if(sdName == null){

            throw new DataNullException();
        }
        Studentdetails studentOne = studentService.findByStudentOne(sdName);

        studentService.deleteStudents(studentOne.getStuId());


        return ResponseResult.getResponseResult(200,"删除成功");
    }

    @RequestMapping("/updateByAllOne")
    public ResponseResult<StudentVO> updateByAllOne(String sdName){


        Studentdetails studentOne = null;
        try {
            studentOne = studentService.findByStudentOne(sdName);
        } catch (DataNullException e) {
            throw new DataNullException(e);
        }


        StudentVO studentVO = studentService.updateByAllOne(studentOne.getStuId());


        return ResponseResult.getResponseResult(studentVO);
    }

    @PutMapping("/updateStudent")
    public ResponseResult<Void> updateStudent(@RequestBody StudentVO studentVO){

        System.err.println("sdName = " + studentVO.getSdName());
        System.err.println("studentVO = " + studentVO);

        if(studentVO.getSdName() == null){

            throw new DataNullException();
        }
        Studentdetails studentOne = studentService.findByStudentOne(studentVO.getSdName());


        studentService.updateStudents(studentOne.getStuId() , studentVO);

        return ResponseResult.getResponseResult(200,"修改成功") ;
    }

    @RequestMapping("/search")
    public ResponseResult<List<StudentVO>> findStuNameAll(String sdName){

        System.err.println("sdName = " + sdName);

        List<StudentVO> stuNameAll = studentService.findStuNameAll(sdName);

        return ResponseResult.getResponseResult("查询成功",stuNameAll);
    }

    @RequestMapping("/findByClassNameAll")
    public ResponseResult<List<ClassTable>> findByClassNameAll(){

        List<ClassTable> classNameAll = studentService.findByClassNameAll();

        return ResponseResult.getResponseResult("数据获取成功" , classNameAll);
    }
}
