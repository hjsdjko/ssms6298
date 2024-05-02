package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiqingjiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiqingjiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiqingjiashenqingView;


/**
 * 教师请假申请
 *
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
public interface JiaoshiqingjiashenqingService extends IService<JiaoshiqingjiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiqingjiashenqingVO> selectListVO(Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
   	
   	JiaoshiqingjiashenqingVO selectVO(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
   	
   	List<JiaoshiqingjiashenqingView> selectListView(Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
   	
   	JiaoshiqingjiashenqingView selectView(@Param("ew") Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiqingjiashenqingEntity> wrapper);
   	
}

