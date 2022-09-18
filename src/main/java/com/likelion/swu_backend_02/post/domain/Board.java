package com.likelion.swu_backend_02.post.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String age;

    @Column(length = 50, nullable = false)
    private String major;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String introduce;

    @Builder
    public Board(Long id, String name, String age, String major, String introduce) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        this.introduce=introduce;
    }

}
