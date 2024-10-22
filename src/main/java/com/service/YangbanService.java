package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YangbanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YangbanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YangbanView;


/**
 * 样板
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface YangbanService extends IService<YangbanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YangbanVO> selectListVO(Wrapper<YangbanEntity> wrapper);
   	
   	YangbanVO selectVO(@Param("ew") Wrapper<YangbanEntity> wrapper);
   	
   	List<YangbanView> selectListView(Wrapper<YangbanEntity> wrapper);
   	
   	YangbanView selectView(@Param("ew") Wrapper<YangbanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YangbanEntity> wrapper);
   	
}

