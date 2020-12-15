package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface StudentMapper {
    @Select("select * from student")
    Collection<Student> findStudents();
}
