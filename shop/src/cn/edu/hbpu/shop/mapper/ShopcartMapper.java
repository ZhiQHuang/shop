package cn.edu.hbpu.shop.mapper;

import cn.edu.hbpu.shop.pojo.Shopcart;
import cn.edu.hbpu.shop.pojo.ShopcartExample;
import cn.edu.hbpu.shop.pojo.ShopcartPojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcartMapper {
    int countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
    
    List<ShopcartPojo> selectShopcartPojoByUid(Integer uid);
}