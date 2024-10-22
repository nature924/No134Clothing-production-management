package com.dao;

import com.entity.ChengpinjianyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengpinjianyanVO;
import com.entity.view.ChengpinjianyanView;


/**
 * 成品检验
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface ChengpinjianyanDao extends BaseMapper<ChengpinjianyanEntity> {
	
	List<ChengpinjianyanVO> selectListVO(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
	
	ChengpinjianyanVO selectVO(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
	
	List<ChengpinjianyanView> selectListView(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);

	List<ChengpinjianyanView> selectListView(Pagination page,@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
	
	ChengpinjianyanView selectView(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
	
}
