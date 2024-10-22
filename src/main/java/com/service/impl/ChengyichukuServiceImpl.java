package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengyichukuDao;
import com.entity.ChengyichukuEntity;
import com.service.ChengyichukuService;
import com.entity.vo.ChengyichukuVO;
import com.entity.view.ChengyichukuView;

@Service("chengyichukuService")
public class ChengyichukuServiceImpl extends ServiceImpl<ChengyichukuDao, ChengyichukuEntity> implements ChengyichukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengyichukuEntity> page = this.selectPage(
                new Query<ChengyichukuEntity>(params).getPage(),
                new EntityWrapper<ChengyichukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengyichukuEntity> wrapper) {
		  Page<ChengyichukuView> page =new Query<ChengyichukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengyichukuVO> selectListVO(Wrapper<ChengyichukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengyichukuVO selectVO(Wrapper<ChengyichukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengyichukuView> selectListView(Wrapper<ChengyichukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengyichukuView selectView(Wrapper<ChengyichukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
