package com.example.demo1.domain;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Data
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@Table(name = "tb_tag_mapping")
public class TagMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long seq;

    @Column(name = "tag")
    private Integer tag;

    @Column(name = "item")
    private Integer item;

    @Column(name = "item_rule")
    private Integer itemRule;
}
