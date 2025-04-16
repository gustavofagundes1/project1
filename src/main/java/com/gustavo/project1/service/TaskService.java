package com.gustavo.project1.service;

import com.gustavo.project1.dtos.TaskDTO;
import com.gustavo.project1.enums.StatusEnum;
import com.gustavo.project1.model.TaskModel;
import com.gustavo.project1.reposytory.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void createTask(TaskDTO taskDTO) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTitle(taskDTO.getTitle());
        taskModel.setDescription(taskDTO.getDescription());
        taskModel.setStatusEnum(StatusEnum.PENDING);
        taskModel.setDate(LocalDateTime.now());
        taskRepository.save(taskModel);
    }

}
