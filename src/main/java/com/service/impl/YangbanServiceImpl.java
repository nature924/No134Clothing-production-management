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


import com.dao.YangbanDao;
import com.entity.YangbanEntity;
import com.service.YangbanService;
import com.entity.vo.YangbanVO;
import com.entity.view.YangbanView;

@Service("yangbanService")
public class YangbanServiceImpl extends ServiceImpl<YangbanDao, YangbanEntity> implements YangbanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YangbanEntity> page = this.selectPage(
                new Query<YangbanEntity>(params).getPage(),
                new EntityWrapper<YangbanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YangbanEntity> wrapper) {
		  Page<YangbanView> page =new Query<YangbanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YangbanVO> selectListVO(Wrapper<YangbanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YangbanVO selectVO(Wrapper<YangbanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YangbanView> selectListView(Wrapper<YangbanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YangbanView selectView(Wrapper<YangbanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
