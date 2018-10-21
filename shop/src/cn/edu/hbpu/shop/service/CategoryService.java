package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.Category;

public interface CategoryService {
	List<Category> getCategoryList();

	String getCnameByCid(Integer cid);

	void deleteCategories(Integer cid);

	void insertCategories(Category category);

	void modifyCategories(Category category);

	public List<Category> getCategoryByCname(String cname);

	Category getname(Integer cid);
}
