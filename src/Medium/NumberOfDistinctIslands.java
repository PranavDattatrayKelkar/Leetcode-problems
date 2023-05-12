package Medium;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

/**
 * This class identifies islands in an island and water map and returns number of distinct islands
 */
public class NumberOfDistinctIslands {
    // Input grid
    private int [][] grid;
    // Blocks in the grid that are visited islands
    private boolean[][] visited;
    // Current island
    private Set<Pair< Integer, Integer>> currentIsland;
    private int currRowOrigin;
    private int currColOrigin;

    /**
     * This method returns the number of distinct islands in a grid
     *
     * @param grid
     * @return integer number of islands
     */
    public int numOfDistinctIslands(int[][] grid)
    {
        this.grid = grid;
        this.visited = new boolean[grid.length][grid[0].length];
        Set<Set<Pair<Integer, Integer>>> uniqueIslands = new HashSet<>();

        for(int row = 0; row < grid.length; row ++)
        {
            for(int col = 0; col < grid[0].length; col ++)
            {
                currentIsland = new HashSet<>();
                currRowOrigin = row;
                currColOrigin = col;
                dfs(row, col);
                if(!currentIsland.isEmpty())
                {
                    uniqueIslands.add(currentIsland);
                }
            }
        }
        return uniqueIslands.size();

    }

    public void dfs(int row, int col)
    {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return;
        if(visited[row][col] || grid[row][col] == 0) return;
        visited[row][col] = true;
        // Add it to hashset
        currentIsland.add(new Pair<>(row - currRowOrigin, col - currColOrigin));
        dfs(row + 1, col);
        dfs(row - 1, col);
        dfs(row, col + 1);
        dfs(row, col - 1);

    }

}
