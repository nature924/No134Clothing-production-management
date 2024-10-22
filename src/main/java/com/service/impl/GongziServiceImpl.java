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


import com.dao.GongziDao;
import com.entity.GongziEntity;
import com.service.GongziService;
import com.entity.vo.GongziVO;
import com.entity.view.GongziView;

@Service("gongziService")
public class GongziServiceImpl extends ServiceImpl<GongziDao, GongziEntity> implements GongziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongziEntity> page = this.selectPage(
                new Query<GongziEntity>(params).getPage(),
                new EntityWrapper<GongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongziEntity> wrapper) {
		  Page<GongziView> page =new Query<GongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongziVO> selectListVO(Wrapper<GongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongziVO selectVO(Wrapper<GongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongziView> selectListView(Wrapper<GongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongziView selectView(Wrapper<GongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
