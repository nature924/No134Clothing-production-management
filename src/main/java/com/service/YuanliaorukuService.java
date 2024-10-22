package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanliaorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanliaorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanliaorukuView;


/**
 * 原料入库
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaorukuService extends IService<YuanliaorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanliaorukuVO> selectListVO(Wrapper<YuanliaorukuEntity> wrapper);
   	
   	YuanliaorukuVO selectVO(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
   	
   	List<YuanliaorukuView> selectListView(Wrapper<YuanliaorukuEntity> wrapper);
   	
   	YuanliaorukuView selectView(@Param("ew") Wrapper<YuanliaorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanliaorukuEntity> wrapper);
   	
}

