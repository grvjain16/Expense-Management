package com.csu.classprojects;

public class GraphToAdjucencyMatrix {
	 
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int k=0; k<matrix[0].length; k++){
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
     
    // -----------------------------------------------------------------
 
    public static void main(String[] args) {
        int[] edge_u = {0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4};
        int[] edge_v = {1, 3, 4, 0, 2, 3, 4, 1, 3, 0, 1, 2, 4, 0, 1, 3};
     
    final int n = 5;
     
    int[][] adjMatrix = new int[n][n];
     
    int m = edge_u.length;
    for(int i=0; i<m; i++){
        int u = edge_u[i];
        int v = edge_v[i];
        adjMatrix[u][v] = 1;
    }
     
    // check matrix
    System.out.println("Adjacency matrix:");
    printMatrix(adjMatrix);
     
 
    }
}

