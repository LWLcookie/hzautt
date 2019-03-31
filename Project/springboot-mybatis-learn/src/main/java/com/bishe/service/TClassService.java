package com.bishe.service;

import com.bishe.entity.TClass;
import com.bishe.model.QueryTClassList;
import com.bishe.util.Page;

import java.util.List;
import java.util.Map;

public interface TClassService  extends IService<TClass>{
    public List<TClass> queryTClassList(Page<QueryTClassList> page);

    public Map<String,Object> saveOrUpdateTClass(TClass tclass);


}
