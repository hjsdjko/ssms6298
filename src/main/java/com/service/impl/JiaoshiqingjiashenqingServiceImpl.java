package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshiqingjiashenqingDao;
import com.entity.JiaoshiqingjiashenqingEntity;
import com.service.JiaoshiqingjiashenqingService;
import com.entity.vo.JiaoshiqingjiashenqingVO;
import com.entity.view.JiaoshiqingjiashenqingView;

@Service("jiaoshiqingjiashenqingService")
public class JiaoshiqingjiashenqingServiceImpl extends ServiceImpl<JiaoshiqingjiashenqingDao, JiaoshiqingjiashenqingEntity> implements JiaoshiqingjiashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiqingjiashenqingEntity> page = this.selectPage(
                new Query<JiaoshiqingjiashenqingEntity>(params).getPage(),
                new EntityWrapper<JiaoshiqingjiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiqingjiashenqingEntity> wrapper) {
		  Page<JiaoshiqingjiashenqingView> page =new Query<JiaoshiqingjiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiqingjiashenqingVO> selectListVO(Wrapper<JiaoshiqingjiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiqingjiashenqingVO selectVO(Wrapper<JiaoshiqingjiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiqingjiashenqingView> selectListView(Wrapper<JiaoshiqingjiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiqingjiashenqingView selectView(Wrapper<JiaoshiqingjiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
