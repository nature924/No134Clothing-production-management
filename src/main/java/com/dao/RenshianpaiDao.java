package com.dao;

import com.entity.RenshianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenshianpaiVO;
import com.entity.view.RenshianpaiView;


/**
 * 人事安排
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface RenshianpaiDao extends BaseMapper<RenshianpaiEntity> {
	
	List<RenshianpaiVO> selectListVO(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
	
	RenshianpaiVO selectVO(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
	
	List<RenshianpaiView> selectListView(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);

	List<RenshianpaiView> selectListView(Pagination page,@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
	
	RenshianpaiView selectView(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
	
}
