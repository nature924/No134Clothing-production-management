package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyichukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengyichukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyichukuView;


/**
 * 成衣出库
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface ChengyichukuService extends IService<ChengyichukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengyichukuVO> selectListVO(Wrapper<ChengyichukuEntity> wrapper);
   	
   	ChengyichukuVO selectVO(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
   	
   	List<ChengyichukuView> selectListView(Wrapper<ChengyichukuEntity> wrapper);
   	
   	ChengyichukuView selectView(@Param("ew") Wrapper<ChengyichukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengyichukuEntity> wrapper);
   	
}

