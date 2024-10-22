package com.entity.view;

import com.entity.ChengyicangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成衣仓库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
@TableName("chengyicangku")
public class ChengyicangkuView  extends ChengyicangkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengyicangkuView(){
	}
 
 	public ChengyicangkuView(ChengyicangkuEntity chengyicangkuEntity){
 	try {
			BeanUtils.copyProperties(this, chengyicangkuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
