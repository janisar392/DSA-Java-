package DSA.Graph;

public class ReplaceOwithX {
    static char[][] fill(char mat[][]) {
        int n = mat.length;
        if(n==0) return mat;
        int m = mat[0].length;

        for(int i=0 ; i<n ;i++){
            if(mat[i][0] =='O') dfs(mat,i,0,n,m);   //left
            if(mat[i][m-1] =='O') dfs(mat,i,m-1,n,m);  //right
        }
        for(int j=0 ; j<m ;j++){
            if(mat[0][j] == 'O') dfs(mat,0,j,n,m);      //top
            if(mat[n-1][j] == 'O') dfs(mat , n-1,j,n,m); //bottom
        }
        for(int i=0 ; i<n ;i++){
            for(int j =0 ; j<m; j++){
                if(mat[i][j] =='O'){
                    mat[i][j]='X';
                }else if(mat[i][j] =='T'){
                    mat[i][j] ='O';
                }
            }
        }
        return mat;
    }

    public static void dfs(char[][] mat , int i , int j , int n , int m){
        if(i < 0 || j <0 || i>=n || j>= m || mat[i][j] != 'O') return;

        mat[i][j] ='T';
        dfs(mat,i-1,j,n,m);
        dfs(mat,i,j-1,n,m);
        dfs(mat,i,j+1,n,m);
        dfs(mat,i+1,j,n,m);

    }
}
