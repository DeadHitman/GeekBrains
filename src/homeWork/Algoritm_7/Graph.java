package homeWork.Algoritm_7;

import java.util.LinkedList;

public class Graph {
    private int vertexCount; //Кол-во вершин
    private int edgeCount; // кол-во ребер
    private LinkedList<Integer>[] adjList; //список с массивами смежности


    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("Кол-во вершин далжно быть натуральным числом");
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>(); //инициализация


        }
    }

    public LinkedList<Integer>getAdjList (int vertex){
        return (LinkedList<Integer>) adjList[vertex].clone();
    }

    public void addEdge(int v1,int v2){
        if (v1<0 || v2<0 || v1>=vertexCount || v2>=vertexCount ){
            throw new IllegalArgumentException();
        }
        adjList[v1].add(v2);
        edgeCount++;
        if (v1==v2){
            return;
        }
        adjList[v2].add(v1);
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }
}
