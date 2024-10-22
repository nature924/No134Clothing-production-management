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


import com.dao.ChengyicangkuDao;
import com.entity.ChengyicangkuEntity;
import com.service.ChengyicangkuService;
import com.entity.vo.ChengyicangkuVO;
import com.entity.view.ChengyicangkuView;

@Service("chengyicangkuService")
public class ChengyicangkuServiceImpl extends ServiceImpl<ChengyicangkuDao, ChengyicangkuEntity> implements ChengyicangkuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengyicangkuEntity> page = this.selectPage(
                new Query<ChengyicangkuEntity>(params).getPage(),
                new EntityWrapper<ChengyicangkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengyicangkuEntity> wrapper) {
		  Page<ChengyicangkuView> page =new Query<ChengyicangkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengyicangkuVO> selectListVO(Wrapper<ChengyicangkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengyicangkuVO selectVO(Wrapper<ChengyicangkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengyicangkuView> selectListView(Wrapper<ChengyicangkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengyicangkuView selectView(Wrapper<ChengyicangkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
