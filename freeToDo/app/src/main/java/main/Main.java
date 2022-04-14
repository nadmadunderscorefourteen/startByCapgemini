/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class Main {
     public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Main().getGreeting());        
        // TODO code application logic here

      /*  ProjectController projectController = new ProjectController();
        
        Project project = new Project();
       // project.setId(1);
        project.setName("Start capgemini");
       // project.setName("Teste de projeto capgemini");
        project.setDescription("Bootcamp Capgemini");
        projectController.save(project); */
        
        //project.setName("Teste de projeto capgemini");
        //projectController.update(project);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos = " + projects.size());
        
        //projectController.removeById(1);
       
  /*     TaskController taskController = new TaskController();
        
        Task task = new Task();
        task.setIdProject(2);
        task.setName("Criar model");
        task.setDescription("Criando um model de tarefas");
        task.setNotes("Tarefa teste");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task); */
        
    /*    task.setName("Mudando telas da api");
        task.setDescription("telas para cadastros");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        task.setCreatedAt(new Date());
        task.setId(1);
        taskController.update(task);
        
        List<Task> tasks = taskController.getAll(2);
        System.out.println("Total de tarefas: " + tasks.size());  
        
        taskController.removeById(1);*/
    }
}
