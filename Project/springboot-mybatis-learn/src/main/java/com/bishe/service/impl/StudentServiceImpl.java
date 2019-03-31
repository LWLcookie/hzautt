/*
package com.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.bishe.entity.Student;
import com.bishe.mapper.StudentMapper;
import com.bishe.model.QueryStudentList;
import com.bishe.service.StudentService;
import com.bishe.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl extends BaseService<Student>  implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudentList(Page<QueryStudentList> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return studentMapper.queryStudentList(page.getCondition());
    }
}
*/
