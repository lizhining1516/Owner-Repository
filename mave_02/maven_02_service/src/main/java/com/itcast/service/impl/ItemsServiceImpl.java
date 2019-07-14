package com.itcast.service.impl;


import com.itcast.dao.ItemsDao;
import com.itcast.domain.Items;
import com.itcast.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
   @Autowired
    private ItemsDao itemsDao;

    public Items findItems(int id) {
        return itemsDao.findItems(id);
    }
}
