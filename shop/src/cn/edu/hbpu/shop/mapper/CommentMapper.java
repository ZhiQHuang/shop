package cn.edu.hbpu.shop.mapper;

import cn.edu.hbpu.shop.pojo.Comment;
import cn.edu.hbpu.shop.pojo.CommentExample;
import cn.edu.hbpu.shop.pojo.CommentPojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer comid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer comid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    List<CommentPojo> selectCommentPojoByPid(Integer pid);
}