package cn.com.manager.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.com.commons.EasyUiDataGrid;
import cn.com.dubbo.service.TbItemDubboService;
import cn.com.manager.service.TbItemService;

@Service
public class TbItemServiceImpl implements TbItemService{
	  
	@Reference
	private TbItemDubboService tbItemDubboServiceImpl;
	
	@Override
	public EasyUiDataGrid show(int page, int rows) {
		System.err.println("123:"+tbItemDubboServiceImpl);
		return tbItemDubboServiceImpl.show(page, rows);
	}

	
	
	
	
	

}
