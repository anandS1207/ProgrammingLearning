package geeksforgeeks.dynamicprogramming.problems;

public class AllPairsShortestPath {
	final static int INF = 99999, v = 4;

	public static void main(String args[]) {
		int graph[][] = { { 0, 5, INF, 10 }, { INF, 0, 3, INF }, { INF, INF, 0, 1 }, { INF, INF, INF, 0 } };
		warshallFloid(graph);
	}

	static void warshallFloid(int graph[][]) {
		int dist[][] = new int[v][v];
		int i, j, k;
		for (i = 0; i < v; i++)
			for (j = 0; j < v; j++)
				dist[i][j] = graph[i][j];
		for (k = 0; k < v; k++) {
			for (i = 0; i < v; i++) {
				for (j = 0; j < v; j++) {
					if (dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}
			}
		}
		for (i = 0; i < v; i++) {
			for (j = 0; j < v; j++) {
				if (dist[i][j] == INF)
					System.out.print("INF");
				else
					System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}
	}

}
