package cn.edu.hbpu.shop.controller;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.TwoCategoryPojo;
import cn.edu.hbpu.shop.pojo.Twocategory;
import cn.edu.hbpu.shop.service.TwoCategoryService;

@Controller
public class TwoCategoryController {
	@Autowired
	private TwoCategoryService twoCategoryService;
	
	@RequestMapping("/admin/getTwoCategories")
	@ResponseBody
	public PageInfo<TwoCategoryPojo> getTwoCategories(int page, int row){
		return twoCategoryService.getTwoCategory(page, row);
	}
	
	@RequestMapping("/admin/deleteTwoCategories")
	@ResponseBody
	public String deleteTwoCategories(Integer tcid){
		twoCategoryService.deleteTwoCategory(tcid);
		return "ok";
	}
	
	@RequestMapping("/admin/insertTwoCategories")
	@ResponseBody
	public String insertTwoCategories(Twocategory twocategory){
		twoCategoryService.insertTwoCategory(twocategory);
		return "ok";
	}
	
	@RequestMapping("/admin/modifyTwoCategories")
	@ResponseBody
	public String modifyTwoCategories(Twocategory twocategory){
		twoCategoryService.modifyTwoCategory(twocategory);
		return "ok";
	}
	
	@RequestMapping("/admin/getTwoCategoryByTcid")
	@ResponseBody
	public Twocategory getTwoCategoryByTcid(Integer tcid){
		return twoCategoryService.getTwoCategoryByTcid(tcid);
	}
	
	@RequestMapping("/admin/getTwoCategoryByTcname")
	@ResponseBody
	public PageInfo<TwoCategoryPojo> getTwoCategoryByTcname(String tcname, int page, int row) {
		String content = "";
		try {
			content = URLDecoder.decode(tcname, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return twoCategoryService.getTwoCategoryByTcname(content, page, row);
	}

	@RequestMapping("/admin/getTwocategoriesList")
	@ResponseBody
	public List<Twocategory> getTwocategoriesList(Integer cid){
		return twoCategoryService.gettwoCategory(cid);
		
	}

}
