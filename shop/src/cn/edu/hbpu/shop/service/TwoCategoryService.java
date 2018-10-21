package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.TwoCategoryPojo;
import cn.edu.hbpu.shop.pojo.Twocategory;

import com.github.pagehelper.PageInfo;

public interface TwoCategoryService {
	List<Twocategory> getTwoCategoryList();
	PageInfo<TwoCategoryPojo> getTwoCategory(int page, int row);
	void insertTwoCategory(Twocategory twocategory);
	void deleteTwoCategory(Integer tcid);
	void modifyTwoCategory(Twocategory twocategory);
	TwoCategoryPojo getTwoCategoryByTcid(Integer tcid);
	PageInfo<TwoCategoryPojo> getTwoCategoryByTcname(String tcname, int page, int row);
	String getScnameByTcid(Integer tcid);
	List<Twocategory> gettwoCategory(Integer cid);
}
