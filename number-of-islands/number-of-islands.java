class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int numIsland = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    numIsland += dfs(grid, i, j);
                }
            }
        }
        return numIsland;
    }
    
    public int dfs(char[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') {
            return 0;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        return 1;
    }
}