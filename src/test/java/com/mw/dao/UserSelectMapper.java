package com.mw.dao;

import com.mw.model.UserSelect;
import com.mw.model.UserSelectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSelectMapper {
    long countByExample(UserSelectExample example);

    int deleteByExample(UserSelectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSelect record);

    int insertSelective(UserSelect record);

    List<UserSelect> selectByExample(UserSelectExample example);

    UserSelect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSelect record, @Param("example") UserSelectExample example);

    int updateByExample(@Param("record") UserSelect record, @Param("example") UserSelectExample example);

    int updateByPrimaryKeySelective(UserSelect record);

    int updateByPrimaryKey(UserSelect record);
}