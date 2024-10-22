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


import com.dao.KaoqinDao;
import com.entity.KaoqinEntity;
import com.service.KaoqinService;
import com.entity.vo.KaoqinVO;
import com.entity.view.KaoqinView;

@Service("kaoqinService")
public class KaoqinServiceImpl extends ServiceImpl<KaoqinDao, KaoqinEntity> implements KaoqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqinEntity> page = this.selectPage(
                new Query<KaoqinEntity>(params).getPage(),
                new EntityWrapper<KaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqinEntity> wrapper) {
		  Page<KaoqinView> page =new Query<KaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoqinVO> selectListVO(Wrapper<KaoqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoqinVO selectVO(Wrapper<KaoqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoqinView> selectListView(Wrapper<KaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqinView selectView(Wrapper<KaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
