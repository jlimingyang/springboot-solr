package com.item1024.Entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 阳十三
 * @email wdful165177@gmail.com
 * @blog http://www.item1024.com
 * @date 2017/9/19
 */

@Entity
@Table(name="t_catalog")
public class TCatalog implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer status;

    @Override
    public String toString() {
        return "CataLog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}