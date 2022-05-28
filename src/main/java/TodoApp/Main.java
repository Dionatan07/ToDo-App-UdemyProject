package TodoApp;

import controler.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class Main {

    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        Project project = new Project();
       
        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos: " + projects.size());
        
        projectController.removeById(1);

    }

}
