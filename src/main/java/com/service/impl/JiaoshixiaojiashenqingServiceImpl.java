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


import com.dao.JiaoshixiaojiashenqingDao;
import com.entity.JiaoshixiaojiashenqingEntity;
import com.service.JiaoshixiaojiashenqingService;
import com.entity.vo.JiaoshixiaojiashenqingVO;
import com.entity.view.JiaoshixiaojiashenqingView;

@Service("jiaoshixiaojiashenqingService")
public class JiaoshixiaojiashenqingServiceImpl extends ServiceImpl<JiaoshixiaojiashenqingDao, JiaoshixiaojiashenqingEntity> implements JiaoshixiaojiashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshixiaojiashenqingEntity> page = this.selectPage(
                new Query<JiaoshixiaojiashenqingEntity>(params).getPage(),
                new EntityWrapper<JiaoshixiaojiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshixiaojiashenqingEntity> wrapper) {
		  Page<JiaoshixiaojiashenqingView> page =new Query<JiaoshixiaojiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshixiaojiashenqingVO> selectListVO(Wrapper<JiaoshixiaojiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshixiaojiashenqingVO selectVO(Wrapper<JiaoshixiaojiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshixiaojiashenqingView> selectListView(Wrapper<JiaoshixiaojiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshixiaojiashenqingView selectView(Wrapper<JiaoshixiaojiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
