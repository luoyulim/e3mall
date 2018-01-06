package cn.e3.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manage.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem findItemById(Long id){
		TbItem tbItem = itemMapper.selectByPrimaryKey(id);
		return tbItem;
	}
}
