package org.example.read;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.example.bean.Student;
import org.junit.Test;

public class BaseRead {
    @Test
    public void test01(){
        //读取文件的路径
        String fileName="student.xlsx";

        //读取excel文件
        EasyExcel.read(fileName, Student.class, new AnalysisEventListener<Student>() {

            //解析一行Excel中的数据就会调用次该方法
            @Override
            public void invoke(Student student, AnalysisContext analysisContext) {
                System.out.println("###"+student);
            }

            //表格中的数据解析完毕后才执行该方法
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("表格数据打印完了");
            }
        }).sheet().doRead();
    }
}
