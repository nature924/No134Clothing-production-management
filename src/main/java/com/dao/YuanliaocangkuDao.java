package com.dao;

import com.entity.YuanliaocangkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanliaocangkuVO;
import com.entity.view.YuanliaocangkuView;


/**
 * 原料仓库
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaocangkuDao extends BaseMapper<YuanliaocangkuEntity> {
	
	List<YuanliaocangkuVO> selectListVO(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
	
	YuanliaocangkuVO selectVO(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
	
	List<YuanliaocangkuView> selectListView(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);

	List<YuanliaocangkuView> selectListView(Pagination page,@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
	
	YuanliaocangkuView selectView(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
	
}
