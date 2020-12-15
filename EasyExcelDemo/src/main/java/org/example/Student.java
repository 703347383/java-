package org.example;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @ExcelProperty("序号")
    Integer id;
    @ExcelProperty("学号")
    String number;
    @ExcelProperty("姓名")
    String name;
    @ExcelProperty("性别")
    String sex;
    @ExcelProperty("联系电话")
    String phone;
    @ExcelProperty("QQ")
    String qq;
    @ExcelProperty("班级")
    Integer clazzid;
    @ExcelProperty("年级")
    Integer gradeid;
}
