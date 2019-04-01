package cn.com.manager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.commons.EasyUiDataGrid;
import cn.com.manager.service.TbItemService;

@Controller
public class TbItemController {
	@Resource
	private TbItemService tbItemService;
	
	
	@RequestMapping("item/list")
	@ResponseBody
	public EasyUiDataGrid show(int page,int rows) {
		
		System.out.println(tbItemService.show(page, rows));
		return tbItemService.show(page, rows);
	}
	
	

}
