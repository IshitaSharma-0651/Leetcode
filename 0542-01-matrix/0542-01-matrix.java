/*public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
       
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n || 
                    matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) continue;
                queue.add(new int[] {r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }
        
        return matrix;
    }
}*/
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
                Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    queue.add(new int[] {i,j});
                    
                }
                else
                    mat[i][j]=Integer.MAX_VALUE;
            }
        }
         int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty())
        {
            int [] cell=queue.poll();
            for(int[]d:dirs)
            {
                int nrow=cell[0]+d[0];
                int ncol=cell[1]+d[1];
                if(nrow<0 || nrow>=n || ncol<0 || ncol>=m || mat[nrow][ncol] <= mat[cell[0]][cell[1]] + 1)                         continue;
                queue.add(new int[] {nrow, ncol});
                mat[nrow][ncol] = mat[cell[0]][cell[1]] + 1;
                
            }
        }
        return mat;
    }
    
}