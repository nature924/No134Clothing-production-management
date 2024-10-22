package com.dao;

import com.entity.GongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongziVO;
import com.entity.view.GongziView;


/**
 * 工资
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface GongziDao extends BaseMapper<GongziEntity> {
	
	List<GongziVO> selectListVO(@Param("ew") Wrapper<GongziEntity> wrapper);
	
	GongziVO selectVO(@Param("ew") Wrapper<GongziEntity> wrapper);
	
	List<GongziView> selectListView(@Param("ew") Wrapper<GongziEntity> wrapper);

	List<GongziView> selectListView(Pagination page,@Param("ew") Wrapper<GongziEntity> wrapper);
	
	GongziView selectView(@Param("ew") Wrapper<GongziEntity> wrapper);
	
}
