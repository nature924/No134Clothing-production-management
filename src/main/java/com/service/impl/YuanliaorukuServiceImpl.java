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


import com.dao.YuanliaorukuDao;
import com.entity.YuanliaorukuEntity;
import com.service.YuanliaorukuService;
import com.entity.vo.YuanliaorukuVO;
import com.entity.view.YuanliaorukuView;

@Service("yuanliaorukuService")
public class YuanliaorukuServiceImpl extends ServiceImpl<YuanliaorukuDao, YuanliaorukuEntity> implements YuanliaorukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanliaorukuEntity> page = this.selectPage(
                new Query<YuanliaorukuEntity>(params).getPage(),
                new EntityWrapper<YuanliaorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanliaorukuEntity> wrapper) {
		  Page<YuanliaorukuView> page =new Query<YuanliaorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanliaorukuVO> selectListVO(Wrapper<YuanliaorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanliaorukuVO selectVO(Wrapper<YuanliaorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanliaorukuView> selectListView(Wrapper<YuanliaorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanliaorukuView selectView(Wrapper<YuanliaorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
