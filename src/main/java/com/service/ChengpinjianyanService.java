package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengpinjianyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengpinjianyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengpinjianyanView;


/**
 * 成品检验
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface ChengpinjianyanService extends IService<ChengpinjianyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengpinjianyanVO> selectListVO(Wrapper<ChengpinjianyanEntity> wrapper);
   	
   	ChengpinjianyanVO selectVO(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
   	
   	List<ChengpinjianyanView> selectListView(Wrapper<ChengpinjianyanEntity> wrapper);
   	
   	ChengpinjianyanView selectView(@Param("ew") Wrapper<ChengpinjianyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengpinjianyanEntity> wrapper);
   	
}

