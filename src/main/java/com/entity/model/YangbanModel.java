package com.entity.model;

import com.entity.YangbanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 样板
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-13 19:48:21
 */
public class YangbanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 面料
	 */
	
	private String mianliao;
		
	/**
	 * 辅料
	 */
	
	private String fuliao;
		
	/**
	 * 样板尺码
	 */
	
	private String yangbanchima;
		
	/**
	 * 部位尺寸
	 */
	
	private String buweichicun;
		
	/**
	 * 款式信息
	 */
	
	private String kuanshixinxi;
		
	/**
	 * 注意点
	 */
	
	private String zhuyidian;
		
	/**
	 * 制作进度
	 */
	
	private String zhizuojindu;
		
	/**
	 * 样板图片
	 */
	
	private String yangbantupian;
				
	
	/**
	 * 设置：面料
	 */
	 
	public void setMianliao(String mianliao) {
		this.mianliao = mianliao;
	}
	
	/**
	 * 获取：面料
	 */
	public String getMianliao() {
		return mianliao;
	}
				
	
	/**
	 * 设置：辅料
	 */
	 
	public void setFuliao(String fuliao) {
		this.fuliao = fuliao;
	}
	
	/**
	 * 获取：辅料
	 */
	public String getFuliao() {
		return fuliao;
	}
				
	
	/**
	 * 设置：样板尺码
	 */
	 
	public void setYangbanchima(String yangbanchima) {
		this.yangbanchima = yangbanchima;
	}
	
	/**
	 * 获取：样板尺码
	 */
	public String getYangbanchima() {
		return yangbanchima;
	}
				
	
	/**
	 * 设置：部位尺寸
	 */
	 
	public void setBuweichicun(String buweichicun) {
		this.buweichicun = buweichicun;
	}
	
	/**
	 * 获取：部位尺寸
	 */
	public String getBuweichicun() {
		return buweichicun;
	}
				
	
	/**
	 * 设置：款式信息
	 */
	 
	public void setKuanshixinxi(String kuanshixinxi) {
		this.kuanshixinxi = kuanshixinxi;
	}
	
	/**
	 * 获取：款式信息
	 */
	public String getKuanshixinxi() {
		return kuanshixinxi;
	}
				
	
	/**
	 * 设置：注意点
	 */
	 
	public void setZhuyidian(String zhuyidian) {
		this.zhuyidian = zhuyidian;
	}
	
	/**
	 * 获取：注意点
	 */
	public String getZhuyidian() {
		return zhuyidian;
	}
				
	
	/**
	 * 设置：制作进度
	 */
	 
	public void setZhizuojindu(String zhizuojindu) {
		this.zhizuojindu = zhizuojindu;
	}
	
	/**
	 * 获取：制作进度
	 */
	public String getZhizuojindu() {
		return zhizuojindu;
	}
				
	
	/**
	 * 设置：样板图片
	 */
	 
	public void setYangbantupian(String yangbantupian) {
		this.yangbantupian = yangbantupian;
	}
	
	/**
	 * 获取：样板图片
	 */
	public String getYangbantupian() {
		return yangbantupian;
	}
			
}
