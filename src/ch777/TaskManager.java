package ch777;

public class TaskManager {
    public static void main(String[] args) {
        Task program = new Task("program", 1, 50);
        Task homework = new Task("homework", 2, 60);
        Task skateboard = new Task("skateboard", 3, 30);


        System.out.println("list all:");
        System.out.println("--------------------------------------------------------------------------------");
        Task.listAll();
        System.out.println();

        System.out.println("Skateboarding is ranked: " + skateboard.getPriority());
        System.out.println("Skateboarding complexity: " + skateboard.getComplexity());
        System.out.println("Skateboarding is ranked: " + skateboard.compareTo(program) + " compared to programming.");
        System.out.println("--------------------------------------------------------------------------------");
        Task.listAll();
        Task.listAll();
        Task.listAll();
        Task.listAll();
        Task.listAll();
        Task.listAll();
    }
}

