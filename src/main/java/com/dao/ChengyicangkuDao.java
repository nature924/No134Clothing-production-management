package com.dao;

import com.entity.ChengyicangkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengyicangkuVO;
import com.entity.view.ChengyicangkuView;


/**
 * 成衣仓库
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface ChengyicangkuDao extends BaseMapper<ChengyicangkuEntity> {
	
	List<ChengyicangkuVO> selectListVO(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
	
	ChengyicangkuVO selectVO(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
	
	List<ChengyicangkuView> selectListView(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);

	List<ChengyicangkuView> selectListView(Pagination page,@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
	
	ChengyicangkuView selectView(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
	
}
