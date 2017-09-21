package com.item1024.Controller;

import com.item1024.Entity.TCatalog;
import com.item1024.Repository.TCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 阳十三
 * @email wdful165177@gmail.com
 * @blog http://www.item1024.com
 * @date 2017/9/18
 */
@Component
@RestController
public class TestController {

    @Autowired
    private TCatalogRepository tCatalogRepository;

    @RequestMapping("/test")
    public String home(HttpServletRequest request) {
        List<TCatalog> list = tCatalogRepository.findAll();
        System.out.println(list.toString());
        return "hello world 456";
    }
}
