package cn.e3.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manage.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		System.out.println(itemId);
		TbItem tbItem = itemService.findItemById(itemId);
		return tbItem;
	}
}
