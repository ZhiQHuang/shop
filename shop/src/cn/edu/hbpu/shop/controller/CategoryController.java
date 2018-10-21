package cn.edu.hbpu.shop.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.hbpu.shop.pojo.Category;
import cn.edu.hbpu.shop.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/admin/getCategories")
	@ResponseBody
	public List<Category> getCategories() {
		return categoryService.getCategoryList();
	}

	@RequestMapping("/admin/deleteCategories")
	@ResponseBody
	public String deleteCategories(Integer cid) {
		categoryService.deleteCategories(cid);
		return "ok";
	}

	@RequestMapping("/admin/insertCategories")
	@ResponseBody
	public String insertCategories(String cname) {
		Category category = new Category();
		category.setCname(cname);
		category.setState(0);
		categoryService.insertCategories(category);
		return "ok";
	}

	@RequestMapping("/admin/modifyCategories")
	@ResponseBody
	public String modifyCategories(Integer cid, String cname) {
		Category category = new Category();
		category.setCid(cid);
		category.setCname(cname);
		category.setState(0);
		categoryService.modifyCategories(category);
		return "ok";
	}

	@RequestMapping("/admin/findCategories")
	@ResponseBody
	public List<Category> findCategories(String cname) {

		String content = "";
		try {
			content = URLDecoder.decode(cname, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return categoryService.getCategoryByCname(content);
	}

	@RequestMapping("/admin/getname")
	@ResponseBody
	public Category getname(Integer cid) {
		Category category = categoryService.getname(cid);

		return category;
	}

}
