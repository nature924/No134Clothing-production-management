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


import com.dao.YuanliaocangkuDao;
import com.entity.YuanliaocangkuEntity;
import com.service.YuanliaocangkuService;
import com.entity.vo.YuanliaocangkuVO;
import com.entity.view.YuanliaocangkuView;

@Service("yuanliaocangkuService")
public class YuanliaocangkuServiceImpl extends ServiceImpl<YuanliaocangkuDao, YuanliaocangkuEntity> implements YuanliaocangkuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanliaocangkuEntity> page = this.selectPage(
                new Query<YuanliaocangkuEntity>(params).getPage(),
                new EntityWrapper<YuanliaocangkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanliaocangkuEntity> wrapper) {
		  Page<YuanliaocangkuView> page =new Query<YuanliaocangkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanliaocangkuVO> selectListVO(Wrapper<YuanliaocangkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanliaocangkuVO selectVO(Wrapper<YuanliaocangkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanliaocangkuView> selectListView(Wrapper<YuanliaocangkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanliaocangkuView selectView(Wrapper<YuanliaocangkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
