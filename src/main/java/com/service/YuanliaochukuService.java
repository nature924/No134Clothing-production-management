package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanliaochukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanliaochukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanliaochukuView;


/**
 * 原料出库
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaochukuService extends IService<YuanliaochukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanliaochukuVO> selectListVO(Wrapper<YuanliaochukuEntity> wrapper);
   	
   	YuanliaochukuVO selectVO(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
   	
   	List<YuanliaochukuView> selectListView(Wrapper<YuanliaochukuEntity> wrapper);
   	
   	YuanliaochukuView selectView(@Param("ew") Wrapper<YuanliaochukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanliaochukuEntity> wrapper);
   	
}

