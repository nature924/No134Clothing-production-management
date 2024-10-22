package com.dao;

import com.entity.ChengyichukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengyichukuVO;
import com.entity.view.ChengyichukuView;


/**
 * 成衣出库
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface ChengyichukuDao extends BaseMapper<ChengyichukuEntity> {
	
	List<ChengyichukuVO> selectListVO(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
	
	ChengyichukuVO selectVO(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
	
	List<ChengyichukuView> selectListView(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);

	List<ChengyichukuView> selectListView(Pagination page,@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
	
	ChengyichukuView selectView(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
	
}
