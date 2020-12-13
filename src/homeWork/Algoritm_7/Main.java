package homeWork.Algoritm_7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(2,5);
        graph.addEdge(1,0);
        graph.addEdge(3,2);
        graph.addEdge(4,5);
        graph.addEdge(7,0);
        graph.addEdge(9,1);
        graph.addEdge(8,7);
        graph.addEdge(9,2);
        graph.addEdge(2,1);
        graph.addEdge(1,5);

//        System.out.println(graph.getAdjList(1));

        BreadthFirstPaths bfp =new BreadthFirstPaths(graph,1);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(3));
    }
}
