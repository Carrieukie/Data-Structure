import java.util.*;

public class GraphTraversals {

    public static void main(String[] args) {
        bfs(getGraph(),"a");
    }

    public static void bfs(HashMap<String, ArrayList<String>> graph, String src){

        Queue<String> que= new LinkedList<>();
        Set<String> visited = new HashSet<>();
        que.offer(src);
        while (!que.isEmpty()){
            String current =  que.poll();
            if (visited.contains(current)) continue;
            System.out.println(current);
            visited.add(current);
            for (String neighbour : graph.get(current)){
                que.offer(neighbour);
            }
        }

    }

    public static void dfs(HashMap<String, ArrayList<String>> graph, String src){
        Stack<String> stk= new Stack<>();
        stk.push(src);
        while (!stk.isEmpty()){
            String currentNode = stk.pop();
            System.out.println(currentNode);
            for (String neighbour : graph.get(currentNode)){
                stk.push(neighbour);
            }
        }

    }

    public static void recursiveDfs (HashMap<String, ArrayList<String>> graph, String src, String dest){

        System.out.println(src.equals(dest));

        for(String next : graph.get(src)){
            recursiveDfs(graph,next, dest);
        }

    }

    public static HashMap<String , ArrayList<String>> getGraph(){
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        graph.put("a", new ArrayList<>(Arrays.asList("b","c")));
        graph.put("b", new ArrayList<>(Arrays.asList("d")));
        graph.put("c", new ArrayList<>(Arrays.asList("e","a")));
        graph.put("d", new ArrayList<>(Arrays.asList("f")));
        graph.put("e", new ArrayList<>(Arrays.asList()));
        graph.put("f", new ArrayList<>(Arrays.asList()));
        return graph;
    }

}
