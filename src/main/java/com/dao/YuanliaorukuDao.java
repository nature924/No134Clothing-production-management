package com.dao;

import com.entity.YuanliaorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanliaorukuVO;
import com.entity.view.YuanliaorukuView;


/**
 * 原料入库
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaorukuDao extends BaseMapper<YuanliaorukuEntity> {
	
	List<YuanliaorukuVO> selectListVO(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
	
	YuanliaorukuVO selectVO(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
	
	List<YuanliaorukuView> selectListView(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);

	List<YuanliaorukuView> selectListView(Pagination page,@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
	
	YuanliaorukuView selectView(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
	
}
