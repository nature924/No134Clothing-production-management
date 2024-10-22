package com.entity.view;

import com.entity.YuanliaochukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 原料出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
@TableName("yuanliaochuku")
public class YuanliaochukuView  extends YuanliaochukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanliaochukuView(){
	}
 
 	public YuanliaochukuView(YuanliaochukuEntity yuanliaochukuEntity){
 	try {
			BeanUtils.copyProperties(this, yuanliaochukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
