package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyicangkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengyicangkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyicangkuView;


/**
 * 成衣仓库
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public interface ChengyicangkuService extends IService<ChengyicangkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengyicangkuVO> selectListVO(Wrapper<ChengyicangkuEntity> wrapper);
   	
   	ChengyicangkuVO selectVO(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
   	
   	List<ChengyicangkuView> selectListView(Wrapper<ChengyicangkuEntity> wrapper);
   	
   	ChengyicangkuView selectView(@Param("ew") Wrapper<ChengyicangkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengyicangkuEntity> wrapper);
   	
}

