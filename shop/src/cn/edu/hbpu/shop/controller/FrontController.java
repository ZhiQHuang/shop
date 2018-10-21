package cn.edu.hbpu.shop.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.hbpu.shop.pojo.Category;
import cn.edu.hbpu.shop.pojo.Comment;
import cn.edu.hbpu.shop.pojo.CommentPojo;
import cn.edu.hbpu.shop.pojo.OrderitemPojo;
import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.ProductPojo;
import cn.edu.hbpu.shop.pojo.Shopcart;
import cn.edu.hbpu.shop.pojo.ShopcartPojo;
import cn.edu.hbpu.shop.pojo.Twocategory;
import cn.edu.hbpu.shop.pojo.User;
import cn.edu.hbpu.shop.service.CategoryService;
import cn.edu.hbpu.shop.service.CommentService;
import cn.edu.hbpu.shop.service.OrderitemService;
import cn.edu.hbpu.shop.service.OrdersService;
import cn.edu.hbpu.shop.service.ProductService;
import cn.edu.hbpu.shop.service.ShopcartService;
import cn.edu.hbpu.shop.service.TwoCategoryService;
import cn.edu.hbpu.shop.service.UserService;

import com.github.pagehelper.PageInfo;

@Controller
public class FrontController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private TwoCategoryService twocategoryService;
	@Autowired
	private ProductService productService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private UserService userService;
	@Autowired
	private ShopcartService shopcartService;
	@Autowired
	private OrdersService ordersService;
	@Autowired
	private OrderitemService orderitemService;

	@RequestMapping("/getcategories")
	@ResponseBody
	public List<Category> getCategories() {
		return categoryService.getCategoryList();
	}

	@RequestMapping("/getPicProducts")
	@ResponseBody
	public PageInfo<Product> getPicProduct() {
		return productService.getPicProduct();

	}

	@RequestMapping("/getHotProducts")
	@ResponseBody
	public PageInfo<Product> getHotProducts() {
		return productService.getHotProduct();

	}

	@RequestMapping("/getNewProducts")
	@ResponseBody
	public PageInfo<Product> getNewProducts() {
		return productService.getNewProduct();

	}

	@RequestMapping("/getProductsByName")
	@ResponseBody
	public PageInfo<Product> getProductsByName(String name, int page, int row) {
		String content = "";
		try {
			content = URLDecoder.decode(name, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return productService.getProductsByPname(content, page, row);
	}
	
	@RequestMapping("/getProductInfo")
	@ResponseBody
	public ProductPojo getProductInfo(int pid){
		return productService.getProductPojoByPid(pid);
	}
	
	@RequestMapping("/getProductComment")
	@ResponseBody
	public List<CommentPojo> getProductComment(int pid){
		return commentService.getCommentsPojoByPid(pid);
	}
	
	@RequestMapping("/checkUserLogin")
	@ResponseBody
	public Map<String, String> checkUserLogin(User user, String checkcode, HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		Boolean result = userService.checkLogin(user);
		String vCode = (String) session.getAttribute("vCode");
		if (result && checkcode.equalsIgnoreCase(vCode)) {
			session.setAttribute("user", user.getUid()+"");
			map.put("result", "ok");
		}else {
			map.put("result", "error");
		}
		return map;
	}
	
	@RequestMapping("/addCart")
	@ResponseBody
	public Map<String, String> addCart(Shopcart cart, HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		String user = (String) session.getAttribute("user");
		if (user == null) {
			map.put("result", "error");
		}else {
			cart.setUid(Integer.parseInt(user));
			shopcartService.insertCart(cart);
			map.put("result", "ok");
		}
		return map;
		
	}
	
	@RequestMapping("/getShopCart")
	@ResponseBody
	public List<ShopcartPojo> getShopCart(HttpSession session){
		String user = (String) session.getAttribute("user");
		return shopcartService.getShopcartPojoByUid(Integer.parseInt(user));
	}
	
	@RequestMapping("/changeShopCart")
	@ResponseBody
	public String changeShopCart(Shopcart cart, HttpSession session){
		String user = (String) session.getAttribute("user");
		cart.setUid(Integer.parseInt(user));
		shopcartService.modify(cart);
		return "ok";
	}
	
	@RequestMapping("/deleteShopCart")
	@ResponseBody
	public String deleteShopCart(Integer sid){
		shopcartService.delete(sid);
		return "ok";
	}
	
	@RequestMapping("/submitOrder")
	@ResponseBody
	public Map<String, String> submitOrder(Double total, HttpServletRequest request, HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		String user = (String) session.getAttribute("user");
		String[] ids = request.getParameterValues("cartIds[]");
		Integer[] cartIds = new Integer[ids.length];
		for (int i = 0; i < ids.length; i++) {
			cartIds[i] = Integer.parseInt(ids[i]);
		}
		Integer oid = ordersService.insertOrders(total, cartIds, Integer.parseInt(user));
		map.put("result", oid+"");
		return map;
	}

	@RequestMapping("/getOrderitemList")
	@ResponseBody
	public List<OrderitemPojo> getOrderitemList(Integer oid){
		return orderitemService.getOrderItemsByOid(oid);
	}
	
	@RequestMapping("/payOrder")
	@ResponseBody
	public String payOrder(Integer oid, Double total){
		ordersService.updateOrders(oid);
		return "ok";
	}
	
	@RequestMapping("/getOrderlistByUid")
	@ResponseBody
	public PageInfo<List<OrderitemPojo>> getOrderlistByUid(HttpSession session, int page, int row) {
		String user = (String) session.getAttribute("user");
		return ordersService.getOrdersByUid(Integer.parseInt(user), page, row);
	}
	
	@RequestMapping("/confirmOrder")
	@ResponseBody
	public String confirmOrder(Integer oid){
		ordersService.updateState(oid);
		return "ok";
	}
	
	@RequestMapping("/submitEvaluate")
	@ResponseBody
	public String submitEvaluate(Comment comment,HttpSession session){
		String user = (String) session.getAttribute("user");
		comment.setUid(Integer.parseInt(user));
		commentService.insertComment(comment);
		return "ok";
	}
	
	@RequestMapping("/delOrder")
	@ResponseBody
	public String delOrder(Integer oid){
		ordersService.deleteOrder(oid);
		return "ok";
	}
	
	@RequestMapping("/getCnameAndScname")
	@ResponseBody
	public Map<String, String> getCnameAndScname(Integer cid,Integer tcid){
		 Map<String, String> map=new HashMap<String, String>();
	     map.put("cname", categoryService.getCnameByCid(cid));
	     if(tcid!=0){
	    	 map.put("scname", twocategoryService.getScnameByTcid(tcid));
	     }
		return  map;
	}
	
	@RequestMapping("/getTwocategories")
	@ResponseBody
	public List<Twocategory> getTwocategories(HttpSession session){
		return twocategoryService.getTwoCategoryList();
		
	}

	@RequestMapping("/getCatProducts")
	@ResponseBody
	 public PageInfo<Product> getCatProducts(int page,int row,int cid,int tcid){
		if(tcid==0){
			return productService.getProductByCid(cid, page, row);
		}
		return productService.getProductByTcid(tcid, page, row);
	}

}












