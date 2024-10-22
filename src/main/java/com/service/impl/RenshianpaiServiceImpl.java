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


import com.dao.RenshianpaiDao;
import com.entity.RenshianpaiEntity;
import com.service.RenshianpaiService;
import com.entity.vo.RenshianpaiVO;
import com.entity.view.RenshianpaiView;

@Service("renshianpaiService")
public class RenshianpaiServiceImpl extends ServiceImpl<RenshianpaiDao, RenshianpaiEntity> implements RenshianpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshianpaiEntity> page = this.selectPage(
                new Query<RenshianpaiEntity>(params).getPage(),
                new EntityWrapper<RenshianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshianpaiEntity> wrapper) {
		  Page<RenshianpaiView> page =new Query<RenshianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshianpaiVO> selectListVO(Wrapper<RenshianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshianpaiVO selectVO(Wrapper<RenshianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshianpaiView> selectListView(Wrapper<RenshianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshianpaiView selectView(Wrapper<RenshianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
