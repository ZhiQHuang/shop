package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.Comment;
import cn.edu.hbpu.shop.pojo.CommentPojo;

public interface CommentService {
	List<CommentPojo> getCommentsPojoByPid(Integer pid);
	void insertComment(Comment comment);
}
