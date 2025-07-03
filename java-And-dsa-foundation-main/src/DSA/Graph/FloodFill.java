package DSA.Graph;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int origColor = image[sr][sc];
        int[][] ans = image;
        int dx[] ={-1,0,0,1};   // top left right bottom
        int dy[] ={ 0,-1,1,0};

        dfs(sr,sc,ans, image,newColor,dx,dy,origColor);
        return ans;
    }

    private void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] dx, int[] dy, int origColor) {

        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i=0 ; i< 4 ; i++){
            int nrow = row+ dx[i];
            int ncol = col+ dy[i];

            if(nrow >=0 && nrow < n && ncol >=0 && ncol < m &&
                    image[nrow][ncol] == origColor && ans[nrow][ncol] != newColor){
                dfs(nrow,ncol,ans,image,newColor,dx,dy,origColor);
            }
        }
    }
}
