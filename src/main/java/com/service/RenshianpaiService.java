package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshianpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshianpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshianpaiView;


/**
 * 人事安排
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface RenshianpaiService extends IService<RenshianpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshianpaiVO> selectListVO(Wrapper<RenshianpaiEntity> wrapper);
   	
   	RenshianpaiVO selectVO(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
   	
   	List<RenshianpaiView> selectListView(Wrapper<RenshianpaiEntity> wrapper);
   	
   	RenshianpaiView selectView(@Param("ew") Wrapper<RenshianpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshianpaiEntity> wrapper);
   	
}

