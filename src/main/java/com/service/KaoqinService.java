package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqinView;


/**
 * 考勤
 *
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public interface KaoqinService extends IService<KaoqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqinVO> selectListVO(Wrapper<KaoqinEntity> wrapper);
   	
   	KaoqinVO selectVO(@Param("ew") Wrapper<KaoqinEntity> wrapper);
   	
   	List<KaoqinView> selectListView(Wrapper<KaoqinEntity> wrapper);
   	
   	KaoqinView selectView(@Param("ew") Wrapper<KaoqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqinEntity> wrapper);
   	
}

