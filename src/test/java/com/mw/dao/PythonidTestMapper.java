package com.mw.dao;

import com.mw.model.PythonidTest;
import com.mw.model.PythonidTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PythonidTestMapper {
    long countByExample(PythonidTestExample example);

    int deleteByExample(PythonidTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PythonidTest record);

    int insertSelective(PythonidTest record);

    List<PythonidTest> selectByExample(PythonidTestExample example);

    PythonidTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PythonidTest record, @Param("example") PythonidTestExample example);

    int updateByExample(@Param("record") PythonidTest record, @Param("example") PythonidTestExample example);

    int updateByPrimaryKeySelective(PythonidTest record);

    int updateByPrimaryKey(PythonidTest record);
}