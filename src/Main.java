import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tasks> tasks = new ArrayList<>();
        tasks.add(new Tasks("Dishes", Priority.MEDIUM));
        tasks.add(new Tasks("Building", Priority.HIGH));
        tasks.add(new Tasks("Getting out of bed", Priority.LOW));
        }
    }
}
