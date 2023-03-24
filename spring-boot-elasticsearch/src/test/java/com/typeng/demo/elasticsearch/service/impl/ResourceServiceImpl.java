package com.typeng.demo.elasticsearch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import com.typeng.demo.elasticsearch.repository.ResourceRepository;
import com.typeng.demo.elasticsearch.model.Resource;
import com.typeng.demo.elasticsearch.service.ResourceService;

import java.util.List;

/**
 * @author ty-peng
 * @date 2021-01-06 11:18
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @Override
    public void save(Resource resource) {
        resourceRepository.save(resource);
    }

    @Override
    public Resource searchById(String id) {
        return resourceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Resource> findAll() {
        return (List<Resource>)resourceRepository.findAll();
    }

    @Override
    public void deleteIndex(String index) {

    }
}
