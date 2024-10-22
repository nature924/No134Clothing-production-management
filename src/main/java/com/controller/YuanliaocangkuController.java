package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuanliaocangkuEntity;
import com.entity.view.YuanliaocangkuView;

import com.service.YuanliaocangkuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 原料仓库
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
@RestController
@RequestMapping("/yuanliaocangku")
public class YuanliaocangkuController {
    @Autowired
    private YuanliaocangkuService yuanliaocangkuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanliaocangkuEntity yuanliaocangku,
		HttpServletRequest request){
        EntityWrapper<YuanliaocangkuEntity> ew = new EntityWrapper<YuanliaocangkuEntity>();
		PageUtils page = yuanliaocangkuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanliaocangku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuanliaocangkuEntity yuanliaocangku, HttpServletRequest request){
        EntityWrapper<YuanliaocangkuEntity> ew = new EntityWrapper<YuanliaocangkuEntity>();
		PageUtils page = yuanliaocangkuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanliaocangku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanliaocangkuEntity yuanliaocangku){
       	EntityWrapper<YuanliaocangkuEntity> ew = new EntityWrapper<YuanliaocangkuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanliaocangku, "yuanliaocangku")); 
        return R.ok().put("data", yuanliaocangkuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanliaocangkuEntity yuanliaocangku){
        EntityWrapper< YuanliaocangkuEntity> ew = new EntityWrapper< YuanliaocangkuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanliaocangku, "yuanliaocangku")); 
		YuanliaocangkuView yuanliaocangkuView =  yuanliaocangkuService.selectView(ew);
		return R.ok("查询原料仓库成功").put("data", yuanliaocangkuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuanliaocangkuEntity yuanliaocangku = yuanliaocangkuService.selectById(id);
        return R.ok().put("data", yuanliaocangku);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuanliaocangkuEntity yuanliaocangku = yuanliaocangkuService.selectById(id);
        return R.ok().put("data", yuanliaocangku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuanliaocangkuEntity yuanliaocangku, HttpServletRequest request){
    	yuanliaocangku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanliaocangku);
        yuanliaocangkuService.insert(yuanliaocangku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody YuanliaocangkuEntity yuanliaocangku, HttpServletRequest request){
    	yuanliaocangku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanliaocangku);
        yuanliaocangkuService.insert(yuanliaocangku);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuanliaocangkuEntity yuanliaocangku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanliaocangku);
        yuanliaocangkuService.updateById(yuanliaocangku);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuanliaocangkuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuanliaocangkuEntity> wrapper = new EntityWrapper<YuanliaocangkuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yuanliaocangkuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
