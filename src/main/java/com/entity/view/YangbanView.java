package com.entity.view;

import com.entity.YangbanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 样板
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
@TableName("yangban")
public class YangbanView  extends YangbanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YangbanView(){
	}
 
 	public YangbanView(YangbanEntity yangbanEntity){
 	try {
			BeanUtils.copyProperties(this, yangbanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
