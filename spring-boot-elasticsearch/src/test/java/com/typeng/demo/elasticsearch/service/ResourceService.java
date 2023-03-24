package com.typeng.demo.elasticsearch.service;

import com.typeng.demo.elasticsearch.model.Resource;

import java.util.Iterator;
import java.util.List;

/**
 * 资源 Service.
 *
 * @author ty-peng
 * @date 2021-01-06 11:17
 */
public interface ResourceService {

    void save(Resource resource);

    Resource searchById(String id);

    List<Resource> findAll();

    void deleteIndex(String index);
}
