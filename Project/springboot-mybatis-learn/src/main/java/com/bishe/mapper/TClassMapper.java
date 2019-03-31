package com.bishe.mapper;

import com.bishe.entity.TClass;
import com.bishe.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TClassMapper extends MyMapper<TClass> {
    public List<TClass> queryTClassList(Map<String,Object> map);
}