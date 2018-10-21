
package cn.edu.hbpu.shop.service;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.ProductPojo;

public interface ProductService {

	void insertProduct(Product product);
	PageInfo<Product> listProductByPage(int page, int row);
	PageInfo<Product> getPicProduct();
	PageInfo<Product> getHotProduct();
	PageInfo<Product> getNewProduct();
	PageInfo<Product> getProductByCid(int cid, int page, int row);
	PageInfo<Product> getProductByTcid(int tcid,int page,int row);
	PageInfo<Product> getProductsByPname(String name, int page, int row);
	ProductPojo getProductPojoByPid(Integer pid);
}