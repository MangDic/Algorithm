package baekjoon_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent; // 인접한 노드들과의 관계를 표현!
        boolean marked; // 방문했는지 확인하는 마킹 플래그
        Node (int data) {
            this.data = data; // 데이터를 받음
            this.marked = false;
            adjacent = new LinkedList<Node>(); // 링크드 리스트 준비
        }
    }
    Node[] nodes; // 노드들을 저장할 배열
    Graph(int size) {
        nodes = new Node[size];
        for(int i = 0; i < size; i++) {
            nodes[i] = new Node(i); // 편의상 방 인덱스와 데이터 값 일치 시킴
        }
    }
    void addEdge(int i1, int i2) { // 두 노드의 관계를 저장하는 함수
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }
    void dfs() { // 그냥 호출하면 0부터 시작
        dfs(0);
    }
    void dfs(int index) {
        Node root = nodes[index]; // 해당 인덱스로 노드를 가져옴
        Stack<Node> stack = new Stack<Node>();
        stack.push(root); // 현재 노드 스택에 추가
        root.marked = true;
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for(Node n : r.adjacent) {
                if(n.marked == false) {
                    n.marked = true;
                    stack.push(n); // 가져온 노드의 자식들을 스택에 추가
                }
            }
            visit(r); // 출력 함수
        }
    }
    void bfs() { // 마찬가지로 인자 없이 호출되면 0부터 시작
        bfs(0);
    }
    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.marked = true;
        while (!queue.isEmpty()) {
            Node r = queue.poll();
            for(Node n : r.adjacent) {
                if(n.marked == false) {
                    n.marked = true;
                    queue.offer(n);
                }
            }
            visit(r);
        }
    }
    void dfsR(Node r) { // R : 리커시브 - 재귀로 구현, 인자 o 일 경우
        if (r == null) return;
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n);
            }
        }
    }
    void dfsR(int index) { // 시작 노드를 받았을 경우
        Node r = nodes[index];
        dfsR(r);
    }
    void dfsR() {
        dfsR(0);
    }

    void visit(Node n) {
        System.out.print(n.data + " ");
    }
}

public class GraphPractice {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        // g.dfs(); // 0 1 3 5 7 6 8 4 2
        // g.bfs(0); // 0 1 2 3 4 5 6 7 8
        // g.dfsR(0); // 0 1 2 4 3 5 6 8 7
        // g.dfs(3); // 3 5 7 6 8 4 2 1 0
    }
}
