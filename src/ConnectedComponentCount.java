import java.util.*;

public class ConnectedComponentCount {

    public static void main(String[] args) {
        countComponents(getGraph());
    }

    public static int countComponents(HashMap<String,ArrayList<String>> graph){
        int count = 0;
        int largestComponent  = Integer.MAX_VALUE;
        Set<String> visited = new HashSet<>();

        for (String key : graph.keySet()) {
            if (visited.contains(key)) continue;
            int counter = 1;
            Queue<String> queue = new LinkedList<>();
            queue.add(key);

            while (!queue.isEmpty()){
                String current = queue.poll();
                visited.add(current);
                for (String neighbour : getGraph().get(current)){
                    queue.offer(neighbour);
                    counter ++;
                }
            }
            largestComponent = Math.min(largestComponent,counter);
            count ++;
        }
        System.out.println(largestComponent);
        return count;
    }

    public static HashMap<String , ArrayList<String>> getGraph(){
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        graph.put("a", new ArrayList<>(Arrays.asList("b","c")));
        graph.put("b", new ArrayList<>(Arrays.asList("d")));
        graph.put("c", new ArrayList<>(Arrays.asList("e")));
        graph.put("d", new ArrayList<>(Arrays.asList("f")));
        graph.put("e", new ArrayList<>(Arrays.asList()));
        graph.put("f", new ArrayList<>(Arrays.asList()));
        graph.put("g", new ArrayList<>(Arrays.asList()));

        return graph;
    }

}
