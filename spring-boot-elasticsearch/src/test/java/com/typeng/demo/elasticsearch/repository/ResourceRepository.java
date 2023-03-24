package com.typeng.demo.elasticsearch.repository;

import com.typeng.demo.elasticsearch.model.Resource;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ty-peng
 * @date 2021-01-06 11:30
 */
public interface ResourceRepository extends ElasticsearchRepository<Resource, String> {
}
