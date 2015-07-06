package leetcode.solution;

/**
 * Created by guo7711 on 6/26/2015.
 */
public class RectangleArea {

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        int overlap_width = Math.min(G,C)>Math.max(A,E)? Math.min(G,C)-Math.max(A,E):0;
        int overlap_length = Math.min(D,H)>Math.max(B,F)? Math.min(D,H)-Math.max(B,F):0;

        return (C-A)*(D-B)+(G-E)*(H-F)-overlap_width*overlap_length;

    }
}
