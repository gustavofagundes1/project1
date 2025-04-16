package com.gustavo.project1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.gustavo.project1.model.enums.StatusEnum;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private StatusEnum statusEnum;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

}
