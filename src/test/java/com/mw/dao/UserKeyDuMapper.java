package com.mw.dao;

import com.mw.model.UserKeyDu;
import com.mw.model.UserKeyDuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserKeyDuMapper {
    long countByExample(UserKeyDuExample example);

    int deleteByExample(UserKeyDuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserKeyDu record);

    int insertSelective(UserKeyDu record);

    List<UserKeyDu> selectByExample(UserKeyDuExample example);

    UserKeyDu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserKeyDu record, @Param("example") UserKeyDuExample example);

    int updateByExample(@Param("record") UserKeyDu record, @Param("example") UserKeyDuExample example);

    int updateByPrimaryKeySelective(UserKeyDu record);

    int updateByPrimaryKey(UserKeyDu record);
}