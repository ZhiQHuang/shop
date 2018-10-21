package cn.edu.hbpu.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hbpu.shop.pojo.Adminuser;
import cn.edu.hbpu.shop.service.AdminUserService;

@Controller
@RequestMapping("/admin")
public class AdminuserController {
	@Autowired
	private AdminUserService adminuserService;

	/*
	 * 控制器做以下四步操作1.接收页面的参数2.访问Service3.将结果保存Model4.跳转页面View
	 */

	/* @RequestMapping表示访问路径 */
	@RequestMapping(value = { "adminlist", "/adminAll" })
	public ModelAndView adminlist() {
		// 访问Service
		List<Adminuser> list =  adminuserService.getAdminUserList();
		// 将结果保存Model
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("adminlist", list);
		// 跳转页面View
		// modelAndView.setViewName("/admin/admin_list.jsp");//不适用视图解析器
		modelAndView.setViewName("admin_list"); // 使用视图解析器，加载前缀和后缀
		return modelAndView;

	}

	@RequestMapping("/adminEdit/{uid}")
	public ModelAndView adminEdit(@PathVariable() Integer uid) {
		Adminuser admin = adminuserService.getAdminuserByUid(uid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("admin", admin);
		modelAndView.setViewName("../edit_admin");
		return modelAndView;
	}


	@RequestMapping("/adminModify")
	public String adminModify(Adminuser admin) {
		adminuserService.updateAdminUser(admin);
		return "redirect:/admin/adminlist";
	}

	@RequestMapping("/adminDel")
	@ResponseBody
	public String adminDel(Integer uid) {
		adminuserService.delAdminUser(uid);
		return "ok";

	}

	@RequestMapping("/batchDelAdmin")
	@ResponseBody
	public String adminBatchDel(@RequestParam(value = "uids[]") Integer[] uids) {
		for (int i = 0; i < uids.length; i++) {
			adminuserService.delAdminUser(uids[i]);
		}
		return "ok";

	}
	
	@RequestMapping("/addAdmin")
	@ResponseBody
	public String adminAdd(Adminuser admin) {
		adminuserService.insertAdminUser(admin);
		return "ok";

	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin(Adminuser admin, HttpSession session){
		Boolean login = adminuserService.checkLogin(admin.getUid(), admin.getPassword());
		if(login){
			session.setAttribute("adminuser", admin.getUid());
			return "index";
		}
		return "login";
		
	}
	

}
