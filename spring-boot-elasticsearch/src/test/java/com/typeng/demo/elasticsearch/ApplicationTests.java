package com.typeng.demo.elasticsearch;

import com.typeng.demo.elasticsearch.model.Resource;
import com.typeng.demo.elasticsearch.service.ResourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private ResourceService resourceService;
    
    @Test
    void contextLoads() {
    }
    
    @Test
    void saveResource() {
        for (int i = 0; i < 100; i++) {
            Resource resource = new Resource();
            resource.setId(String.valueOf(i));
            resource.setName("name" + i);
            resource.setUser("user" + i);
            resourceService.save(resource);
        }
    }

}
