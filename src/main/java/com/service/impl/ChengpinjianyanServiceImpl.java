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


import com.dao.ChengpinjianyanDao;
import com.entity.ChengpinjianyanEntity;
import com.service.ChengpinjianyanService;
import com.entity.vo.ChengpinjianyanVO;
import com.entity.view.ChengpinjianyanView;

@Service("chengpinjianyanService")
public class ChengpinjianyanServiceImpl extends ServiceImpl<ChengpinjianyanDao, ChengpinjianyanEntity> implements ChengpinjianyanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengpinjianyanEntity> page = this.selectPage(
                new Query<ChengpinjianyanEntity>(params).getPage(),
                new EntityWrapper<ChengpinjianyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengpinjianyanEntity> wrapper) {
		  Page<ChengpinjianyanView> page =new Query<ChengpinjianyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengpinjianyanVO> selectListVO(Wrapper<ChengpinjianyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengpinjianyanVO selectVO(Wrapper<ChengpinjianyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengpinjianyanView> selectListView(Wrapper<ChengpinjianyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengpinjianyanView selectView(Wrapper<ChengpinjianyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
