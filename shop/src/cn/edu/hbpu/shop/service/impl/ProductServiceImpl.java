package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.shop.mapper.ProductMapper;
import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.ProductExample;
import cn.edu.hbpu.shop.pojo.ProductPojo;
import cn.edu.hbpu.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	public void insertProduct(Product product) {
		productMapper.insertSelective(product);
	}

	public PageInfo<Product> listProductByPage(int page, int row) {
		PageHelper.startPage(page, row);
		ProductExample example = new ProductExample();
		List<Product> list = productMapper.selectByExample(example);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	private void changeProductList(List<Product> list) {
		for (int i = 0; i < list.size(); i++) {
			Product product = list.get(i);
			String image = product.getImage();
			String[] split = image.split(",");
			product.setImage("/pic/" + split[0]);
			String pname = product.getPname();
			if (pname.length() > 8) {
				product.setPname(pname.substring(0, 8) + "...");
			}
		}
	}

	public PageInfo<Product> getPicProduct() {
		PageHelper.startPage(1, 3);
		ProductExample example = new ProductExample();
		example.createCriteria().andIsPicEqualTo(1);
		example.setOrderByClause("pid desc");
		List<Product> list = productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	public PageInfo<Product> getHotProduct() {
		PageHelper.startPage(1, 11);
		ProductExample example = new ProductExample();
		example.createCriteria().andIsHotEqualTo(1);
		example.setOrderByClause("pid desc");
		List<Product> list = productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	public PageInfo<Product> getNewProduct() {
		PageHelper.startPage(1, 11);
		ProductExample example = new ProductExample();
		example.setOrderByClause("pid desc");
		List<Product> list = productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	public PageInfo<Product> getProductsByCid(int cid, int page, int row) {
		PageHelper.startPage(page, row);
		ProductExample example = new ProductExample();
		example.createCriteria().andCidEqualTo(cid);
		List<Product> list = productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}
	
	

	public PageInfo<Product> getProductsByPname(String name, int page, int row) {
		PageHelper.startPage(page, row);
		ProductExample example = new ProductExample();
		example.createCriteria().andPnameLike("%" + name + "%");
		List<Product> list = productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	public ProductPojo getProductPojoByPid(Integer pid) {
		return productMapper.selectProductPojoByPid(pid);
	}

	
public PageInfo<Product> getProductByTcid(int tcid, int page, int row) {
		
		PageHelper.startPage(page,row);
		ProductExample example=new ProductExample();
		example.createCriteria().andTcidEqualTo(tcid);
		List<Product> list=productMapper.selectByExample(example);
		changeProductList(list);
		PageInfo<Product> pageInfo=new PageInfo<Product>(list);
		return pageInfo;
	}

public PageInfo<Product> getProductByCid(int cid, int page, int row) {
	// TODO Auto-generated method stub
	PageHelper.startPage(page, row);
	ProductExample example = new ProductExample();
	example.createCriteria().andCidEqualTo(cid);
	List<Product> list = productMapper.selectByExample(example);
	changeProductList(list);
	PageInfo<Product> pageInfo = new PageInfo<Product>(list);
	return pageInfo;
}


}
