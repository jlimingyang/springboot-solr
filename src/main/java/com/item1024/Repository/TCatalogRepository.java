package com.item1024.Repository;

import com.item1024.Entity.TCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author 阳十三
 * @email wdful165177@gmail.com
 * @blog http://www.item1024.com
 * @date 2017/9/20
 */
public interface TCatalogRepository extends JpaRepository<TCatalog,Long> {

}
