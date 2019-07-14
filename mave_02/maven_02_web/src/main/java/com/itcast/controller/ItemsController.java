package com.itcast.controller;


import com.itcast.domain.Items;
import com.itcast.service.ItemsService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
 @Autowired
  private ItemsService itemsService;
  @RequestMapping(value = "/findDetail")
    public  String findDetail(Model model){
      Items items = itemsService.findItems(1);
      model.addAttribute("items",items);
      return "itemDetail";
  }
}
