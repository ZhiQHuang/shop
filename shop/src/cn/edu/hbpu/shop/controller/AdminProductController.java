package cn.edu.hbpu.shop.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.service.ProductService;
import cn.edu.hbpu.shop.util.CommonUtils;

@Controller
public class AdminProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/admin/saveProduct")
	@ResponseBody
	public String addProduct(Product product,@RequestParam("imageFile") MultipartFile[] files) {
		CommonUtils.uploadFiles(product, files);
		product.setNewPrice(product.getOldPrice());
		product.setPdate(new Date());
		product.setState(0);
		product.setVolume(0);
		productService.insertProduct(product);
		return "ok";
	}

	@RequestMapping("/admin/listProduct")
	@ResponseBody
	public PageInfo<Product> listProduct(int page, int row) {
		return productService.listProductByPage(page, row);
	}
}
