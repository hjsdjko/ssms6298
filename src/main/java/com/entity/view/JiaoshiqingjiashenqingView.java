package com.entity.view;

import com.entity.JiaoshiqingjiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师请假申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
@TableName("jiaoshiqingjiashenqing")
public class JiaoshiqingjiashenqingView  extends JiaoshiqingjiashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiqingjiashenqingView(){
	}
 
 	public JiaoshiqingjiashenqingView(JiaoshiqingjiashenqingEntity jiaoshiqingjiashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiqingjiashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
