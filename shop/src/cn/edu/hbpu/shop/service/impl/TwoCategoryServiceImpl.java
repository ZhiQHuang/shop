package cn.edu.hbpu.shop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.shop.mapper.CategoryMapper;
import cn.edu.hbpu.shop.mapper.TwocategoryMapper;
import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.ProductExample;
import cn.edu.hbpu.shop.pojo.TwoCategoryPojo;
import cn.edu.hbpu.shop.pojo.Twocategory;
import cn.edu.hbpu.shop.pojo.TwocategoryExample;
import cn.edu.hbpu.shop.service.TwoCategoryService;

@Service
public class TwoCategoryServiceImpl<TwocategoryPojo> implements TwoCategoryService {
	
	@Autowired
	private TwocategoryMapper twocategoryMapper;
	@Autowired
	private CategoryMapper categoryMapper;
	
	public void insertTwoCategory(Twocategory twocategory) {
		twocategory.setTcname(twocategory.getTcname());
		twocategory.setState(0);
		twocategoryMapper.insertSelective(twocategory);
	}

	public List<Twocategory> getTwoCategoryList() {
		TwocategoryExample example = new TwocategoryExample();
		example.createCriteria().andStateEqualTo(0);
		return twocategoryMapper.selectByExample(example);
	}
	
	public PageInfo<TwoCategoryPojo> getTwoCategory(int page, int row) {
		PageHelper.startPage(page, row);
		TwocategoryExample example = new TwocategoryExample();
		example.createCriteria().andStateEqualTo(0);
		example.setOrderByClause("cid asc");
		List<Twocategory> list = twocategoryMapper.selectByExample(example);
		List<TwoCategoryPojo> rList = new ArrayList<TwoCategoryPojo>();
		
		for (int i = 0; i < list.size(); i++) {
			TwoCategoryPojo temp = new TwoCategoryPojo();
			temp.setCid(list.get(i).getCid());
			temp.setCname(categoryMapper.selectByPrimaryKey(list.get(i).getCid()).getCname());
			temp.setState(list.get(i).getState());
			temp.setTcid(list.get(i).getTcid());
			temp.setTcname(list.get(i).getTcname());
			rList.add(temp);
		}
		PageInfo<TwoCategoryPojo> pageInfo = new PageInfo<TwoCategoryPojo>(rList);
		return pageInfo;
	}

	
	
	public void deleteTwoCategory(Integer tcid) {
		Twocategory twocategory = twocategoryMapper.selectByPrimaryKey(tcid);
		twocategory.setState(1);
		twocategoryMapper.updateByPrimaryKeySelective(twocategory);
		
	}

	public void modifyTwoCategory(Twocategory twocategory) {
		twocategoryMapper.updateByPrimaryKeySelective(twocategory);
	}

	public TwoCategoryPojo getTwoCategoryByTcid(Integer tcid) {
		return twocategoryMapper.selectTwoCategoryPojoByTcid(tcid);
	}

	public PageInfo<TwoCategoryPojo> getTwoCategoryByTcname(String tcname,
			int page, int row) {
		PageHelper.startPage(page, row);
		TwocategoryExample example = new TwocategoryExample();
		example.createCriteria().andTcnameLike("%" + tcname + "%").andStateEqualTo(0);
		List<Twocategory> list = twocategoryMapper.selectByExample(example);
		
		List<TwoCategoryPojo> rList = new ArrayList<TwoCategoryPojo>();
		for (int i = 0; i < list.size(); i++) {
			TwoCategoryPojo temp = new TwoCategoryPojo();
			temp.setCid(list.get(i).getCid());
			temp.setCname(categoryMapper.selectByPrimaryKey(list.get(i).getCid()).getCname());
			temp.setState(list.get(i).getState());
			temp.setTcid(list.get(i).getTcid());
			temp.setTcname(list.get(i).getTcname());
			rList.add(temp);
		}
		PageInfo<TwoCategoryPojo> pageInfo = new PageInfo<TwoCategoryPojo>(rList);
		return pageInfo;
	}

	public String getScnameByTcid(Integer tcid) {
		return twocategoryMapper.selectByPrimaryKey(tcid).getTcname();
	}

	public List<Twocategory> gettwoCategory(Integer cid) {
		// TODO Auto-generated method stub
		TwocategoryExample example = new TwocategoryExample();
		example.createCriteria().andCidEqualTo(cid).andStateEqualTo(0);
		 List<Twocategory> list= twocategoryMapper.selectByExample(example);
		
		return list;
	}
	
	
}
