package com.dao;

import com.entity.YuanliaochukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanliaochukuVO;
import com.entity.view.YuanliaochukuView;


/**
 * 原料出库
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaochukuDao extends BaseMapper<YuanliaochukuEntity> {
	
	List<YuanliaochukuVO> selectListVO(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
	
	YuanliaochukuVO selectVO(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
	
	List<YuanliaochukuView> selectListView(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);

	List<YuanliaochukuView> selectListView(Pagination page,@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
	
	YuanliaochukuView selectView(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
	
}
