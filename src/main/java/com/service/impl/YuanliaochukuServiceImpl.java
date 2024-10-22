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


import com.dao.YuanliaochukuDao;
import com.entity.YuanliaochukuEntity;
import com.service.YuanliaochukuService;
import com.entity.vo.YuanliaochukuVO;
import com.entity.view.YuanliaochukuView;

@Service("yuanliaochukuService")
public class YuanliaochukuServiceImpl extends ServiceImpl<YuanliaochukuDao, YuanliaochukuEntity> implements YuanliaochukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanliaochukuEntity> page = this.selectPage(
                new Query<YuanliaochukuEntity>(params).getPage(),
                new EntityWrapper<YuanliaochukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanliaochukuEntity> wrapper) {
		  Page<YuanliaochukuView> page =new Query<YuanliaochukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanliaochukuVO> selectListVO(Wrapper<YuanliaochukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanliaochukuVO selectVO(Wrapper<YuanliaochukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanliaochukuView> selectListView(Wrapper<YuanliaochukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanliaochukuView selectView(Wrapper<YuanliaochukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
