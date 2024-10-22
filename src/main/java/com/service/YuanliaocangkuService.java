package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanliaocangkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanliaocangkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanliaocangkuView;


/**
 * 原料仓库
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface YuanliaocangkuService extends IService<YuanliaocangkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanliaocangkuVO> selectListVO(Wrapper<YuanliaocangkuEntity> wrapper);
   	
   	YuanliaocangkuVO selectVO(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
   	
   	List<YuanliaocangkuView> selectListView(Wrapper<YuanliaocangkuEntity> wrapper);
   	
   	YuanliaocangkuView selectView(@Param("ew") Wrapper<YuanliaocangkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanliaocangkuEntity> wrapper);
   	
}

