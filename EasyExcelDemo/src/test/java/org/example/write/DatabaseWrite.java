package org.example.write;

import com.alibaba.excel.EasyExcel;
import org.example.bean.Student;
import org.example.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

public class DatabaseWrite {
    @Autowired
    StudentMapper studentMapper;

    String fileName="学生.xlsx";

    @Test
    public void writeDB(){
        Collection<Student> students=studentMapper.findStudents();
        EasyExcel.write(fileName,Student.class).sheet().doWrite((List) students);
    }
}
