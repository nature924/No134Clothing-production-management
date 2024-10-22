package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongziView;


/**
 * 工资
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface GongziService extends IService<GongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongziVO> selectListVO(Wrapper<GongziEntity> wrapper);
   	
   	GongziVO selectVO(@Param("ew") Wrapper<GongziEntity> wrapper);
   	
   	List<GongziView> selectListView(Wrapper<GongziEntity> wrapper);
   	
   	GongziView selectView(@Param("ew") Wrapper<GongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongziEntity> wrapper);
   	
}

