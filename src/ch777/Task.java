package ch777;

/* Modify the Task class from PPs 7.5 and 7.6 so that it also implements the 
   Comparable interface from the Java standard class library.  Implement the 
   interface such that the tasks are ranked by priority.  Create a driver class 
   whose main method shows these new features of Task objects. */

import java.util.*;

public class Task implements Priority, Comparable, Complexity {
    public static ArrayList<Task> tasks = new ArrayList<Task>(); //for storing all tasks
    private static int count;
    private String taskName;
    private int priority;
    private int complexity;

    public Task(String taskName, int priority, int complexity) {
        this.taskName = taskName;
        this.priority = priority;
        setPriority(priority);
        this.complexity = complexity;
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public static void listAll() {  //prints all tasks from ArrayList tasks
        count++;
        System.out.println("---Tasks as of Iteration " + count + "---");
        for (int i = 1; i <= tasks.size(); i++)
            System.out.println(i + ": " + tasks.get(i - 1).toString());
        System.out.println("-----------------------------");
    }

    public int compareTo(Object obj) {
        Task task = (Task) obj;
        return task.getPriority() - getPriority(); //returns negative if lower task
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        tasks.add(priority - 1, this);
    }

    public void remove() {
        tasks.remove(this);
        System.out.println("Task \"" + this.toString() + "\" removed.");
    }

    public String toString() {
        return (taskName);
    }
}
