/*
Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]

 */
import java.util.ArrayList;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (a ==0) return result;

        for(int i=0; i<a; i++){
            ArrayList<Integer> thisRow = new ArrayList<>();
            for(int j=0; j<=i; j ++){
                if (j == 0){
                    thisRow.add(1);
                }
                else if (j<i){
                    int thisNum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    thisRow.add(thisNum);
                }
                else if(j == i){
                    thisRow.add(1);
                }
            }
            result.add(thisRow);
        }
        return result;
    }
}
