package org.example;

public class TwoDArray {

    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int currX = points[i][0];
            int currY = points[i][1];
            int targetX = points[i + 1][0];
            int targetY = points[i + 1][1];
            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};

//        for (int i=0; i<points.length; i++){
//            for (int j=0; j<2; j++){
//            System.out.println(points[i][j]);
//            }
//        }
        TwoDArray twoDArray= new TwoDArray();

        System.out.println(twoDArray.minTimeToVisitAllPoints(points));
    }
}
