package com.Dhyan;

import java.util.Arrays;

public class RowColMatrix {
   public static void main ( String[] main) {

      int [][] arr = {
              {12,20,30,50},
              {15,21,39,51},
              {16,22,40,52},
              {20,23,41,53}

      };

      System.out.println(Arrays.toString(search(arr , 23 )));

   }

   static int[] search (int [][] matrix , int target ){
      int r = 0  ;
      int c = matrix.length - 1 ;

      while(r < matrix.length && c >= 0 ) {
                 if( matrix[r][c]== target) {
                    return new int[]{r , c} ;
                 }
                 if(target > matrix[r][c]) {
                    r++;
                 }
                 else {
                    c-- ;
                 }
      }
        return new int[]{-1 , -1 };
   }
}
