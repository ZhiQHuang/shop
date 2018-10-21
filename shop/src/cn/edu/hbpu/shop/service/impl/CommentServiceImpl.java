package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.CommentMapper;
import cn.edu.hbpu.shop.pojo.Comment;
import cn.edu.hbpu.shop.pojo.CommentPojo;
import cn.edu.hbpu.shop.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;

	public List<CommentPojo> getCommentsPojoByPid(Integer pid) {
		return commentMapper.selectCommentPojoByPid(pid);
	}

	public void insertComment(Comment comment) {
		commentMapper.insert(comment);
	}
}
