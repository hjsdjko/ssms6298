package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshixiaojiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshixiaojiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshixiaojiashenqingView;


/**
 * 教师销假申请
 *
 * @author 
 * @email 
 * @date 2021-04-22 16:39:33
 */
public interface JiaoshixiaojiashenqingService extends IService<JiaoshixiaojiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshixiaojiashenqingVO> selectListVO(Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
   	
   	JiaoshixiaojiashenqingVO selectVO(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
   	
   	List<JiaoshixiaojiashenqingView> selectListView(Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
   	
   	JiaoshixiaojiashenqingView selectView(@Param("ew") Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshixiaojiashenqingEntity> wrapper);
   	
}

