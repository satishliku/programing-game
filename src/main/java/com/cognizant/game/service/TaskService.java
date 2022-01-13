package com.cognizant.game.service;

import com.cognizant.game.model.Task;
import com.cognizant.game.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public List<Task> getTaskList(){
        return taskRepository.findAll();
    }
}
