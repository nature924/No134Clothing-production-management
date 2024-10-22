package com.dao;

import com.entity.YangbanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YangbanVO;
import com.entity.view.YangbanView;


/**
 * 样板
 * 
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface YangbanDao extends BaseMapper<YangbanEntity> {
	
	List<YangbanVO> selectListVO(@Param("ew") Wrapper<YangbanEntity> wrapper);
	
	YangbanVO selectVO(@Param("ew") Wrapper<YangbanEntity> wrapper);
	
	List<YangbanView> selectListView(@Param("ew") Wrapper<YangbanEntity> wrapper);

	List<YangbanView> selectListView(Pagination page,@Param("ew") Wrapper<YangbanEntity> wrapper);
	
	YangbanView selectView(@Param("ew") Wrapper<YangbanEntity> wrapper);
	
}
