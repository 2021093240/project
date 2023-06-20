package com.example.controller;

import com.example.entity.StudentVO;
import com.example.entity.StudentVO;
import com.example.service.StudentService;
import com.example.utils.ResponseResult;
import com.example.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

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
    public ResponseResult<List<StudentVO>> findStudentAll(){

        List<StudentVO> studentAll = studentService.findStudentAll();

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

        return ResponseResult.getResponseResult("获取数据成功",studentAll);
    }
}
