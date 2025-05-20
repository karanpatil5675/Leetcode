public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor != newColor) {
            dfs(image, sr, sc, originalColor, newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int r, int c, int color, int newColor) {
        // Check bounds and color match
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != color) {
            return;
        }

        // Change color
        image[r][c] = newColor;

        // Recursive calls in 4 directions
        dfs(image, r + 1, c, color, newColor); // down
        dfs(image, r - 1, c, color, newColor); // up
        dfs(image, r, c + 1, color, newColor); // right
        dfs(image, r, c - 1, color, newColor); // left
    }
}
