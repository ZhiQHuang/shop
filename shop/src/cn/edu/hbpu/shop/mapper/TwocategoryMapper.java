package cn.edu.hbpu.shop.mapper;

import cn.edu.hbpu.shop.pojo.TwoCategoryPojo;
import cn.edu.hbpu.shop.pojo.Twocategory;
import cn.edu.hbpu.shop.pojo.TwocategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TwocategoryMapper {
    int countByExample(TwocategoryExample example);

    int deleteByExample(TwocategoryExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(Twocategory record);

    int insertSelective(Twocategory record);

    List<Twocategory> selectByExample(TwocategoryExample example);

    Twocategory selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") Twocategory record, @Param("example") TwocategoryExample example);

    int updateByExample(@Param("record") Twocategory record, @Param("example") TwocategoryExample example);

    int updateByPrimaryKeySelective(Twocategory record);

    int updateByPrimaryKey(Twocategory record);
    
    TwoCategoryPojo selectTwoCategoryPojoByTcid(Integer tcid);
}