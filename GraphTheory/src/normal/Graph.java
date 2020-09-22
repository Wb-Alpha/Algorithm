package normal;

import java.util.*;

public class Graph {
	private int V;
	private int E;
	private Bag<Integer>[] adj;
	
	public Graph(int V, int E) {
		Scanner in = new Scanner(System.in);
		this.V = V;
		this.E = E;
		adj = (Bag<Integer>[]) new Bag[V];
		for ( int v = 0; v < V; v++) {
			adj[v] = new Bag<Integer>();
		}
		for (int i = 0; i < E; i++) {
			int v = in.nextInt();
			int w = in.nextInt();
			addEdge(v, w);
		}
	}
	
	public int V() {return V;}
	public int E() {return E;}
	
	public void addEdge(int v, int w) {
		adj[v].addItem(w);
		adj[w].addItem(v);
	}
}
