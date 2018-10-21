package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.CategoryMapper;
import cn.edu.hbpu.shop.mapper.TwocategoryMapper;
import cn.edu.hbpu.shop.pojo.Category;
import cn.edu.hbpu.shop.pojo.CategoryExample;
import cn.edu.hbpu.shop.pojo.TwocategoryExample;
import cn.edu.hbpu.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private TwocategoryMapper twocategoryMapper;

	public List<Category> getCategoryList() {
		CategoryExample example = new CategoryExample();
		example.createCriteria().andStateEqualTo(0);
		return categoryMapper.selectByExample(example);
	}

	public String getCnameByCid(Integer cid) {
		return categoryMapper.selectByPrimaryKey(cid).getCname();
	}

	public void deleteCategories(Integer cid) {
		TwocategoryExample example = new TwocategoryExample();
		example.createCriteria().andCidEqualTo(cid);
		twocategoryMapper.deleteByExample(example);
		CategoryExample category = new CategoryExample();
		category.createCriteria().andCidEqualTo(cid);
		categoryMapper.deleteByExample(category);
	}

	public void insertCategories(Category category) {
		categoryMapper.insertSelective(category);
	}

	public void modifyCategories(Category category) {
		categoryMapper.updateByPrimaryKeySelective(category);
	}

	public List<Category> getCategoryByCname(String cname) {
		CategoryExample example = new CategoryExample();
		example.createCriteria().andCnameLike("%" + cname + "%");
		List<Category> list = categoryMapper.selectByExample(example);

		return list;
	}

	public Category getname(Integer cid) {

		Category category = categoryMapper.selectByPrimaryKey(cid);

		return category;
	}

}
