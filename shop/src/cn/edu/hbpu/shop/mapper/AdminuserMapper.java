package cn.edu.hbpu.shop.mapper;

import cn.edu.hbpu.shop.pojo.Adminuser;
import cn.edu.hbpu.shop.pojo.AdminuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminuserMapper {
    int countByExample(AdminuserExample example);

    int deleteByExample(AdminuserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample(AdminuserExample example);
    
    List<Adminuser> selectByExample1(AdminuserExample example);
    
    Adminuser selectByPrimaryKey(Integer uid);
    
    Adminuser selectByUsername(String username);

    int updateByExampleSelective(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByExample(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
    
    int updateStateByPrimaryKey(Integer uid);
}