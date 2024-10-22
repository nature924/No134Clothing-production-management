package com.entity.view;

import com.entity.KaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考勤
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
@TableName("kaoqin")
public class KaoqinView  extends KaoqinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoqinView(){
	}
 
 	public KaoqinView(KaoqinEntity kaoqinEntity){
 	try {
			BeanUtils.copyProperties(this, kaoqinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
