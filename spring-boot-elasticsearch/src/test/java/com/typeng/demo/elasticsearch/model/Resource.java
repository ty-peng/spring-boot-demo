package com.typeng.demo.elasticsearch.model;

import org.elasticsearch.index.VersionType;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 资源.
 *
 * @author ty-peng
 * @date 2021-01-06 10:30
 */
@Document(indexName = "resource", versionType = VersionType.EXTERNAL)
public class Resource {

    @Id
    private String id;

    private String name;

    private String user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
