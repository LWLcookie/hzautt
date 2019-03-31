package com.bishe.service;

import com.bishe.entity.Student;
import com.bishe.model.QueryStudentList;
import com.bishe.util.Page;

import java.util.List;

public interface StudentService  extends IService<Student>{

    public List<Student> queryStudentList(Page<QueryStudentList> page);





}
