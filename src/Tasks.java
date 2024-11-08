public class Tasks {
    private String name;
    private Priority priority;

    public Tasks(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void tasksDisplay(){
        System.out.print("Name: " + name );
        System.out.print("|");
        System.out.print("Priority " + priority);
        System.out.print("");

    }
}
