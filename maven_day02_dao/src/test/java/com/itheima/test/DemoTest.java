package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void run01(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Spring/applicationContext-dao.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items item = itemsDao.findById(1);
        System.out.println(item.getName());
    }
}
