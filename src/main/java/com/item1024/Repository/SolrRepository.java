package com.item1024.Repository;

import com.item1024.Entity.CommodInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface SolrRepository extends SolrCrudRepository<CommodInfo, String > {
    @Query("value:?0")
    List<CommodInfo> findAllByValue(String markey, Pageable pageable);
}
