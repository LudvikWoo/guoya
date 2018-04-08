package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyUserMapper {
    long countByExample(GyUserExample example);

    int deleteByExample(GyUserExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(GyUser record);

    int insertSelective(GyUser record);

    List<GyUser> selectByExample(GyUserExample example);

    GyUser selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") GyUser record, @Param("example") GyUserExample example);

    int updateByExample(@Param("record") GyUser record, @Param("example") GyUserExample example);

    int updateByPrimaryKeySelective(GyUser record);

    int updateByPrimaryKey(GyUser record);
}