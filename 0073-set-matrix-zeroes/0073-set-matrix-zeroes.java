class Solution {
    public void setZeroes(int[][] array) {
        int colo=array[0][0];
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
                if(array[row][col] == 0){
                    if(col!=0){
                    array[row][0] = 0;
                    array[0][col]=0;
                    }else{
                        colo=0;
                    }
                }
            }
        }
        for(int row=1;row<array.length;row++){
            for(int col=1;col<array[row].length;col++){
                if(array[0][col] == 0 || array[row][0] == 0){
                    array[row][col]=0;
                }
            }
        }

        int r=array[0][0];
        for(int i=array[0].length-1;i>=0;i--){
            if(r==0){
                array[0][i]=r;
            }
        }
        for(int i=array.length-1;i>=0;i--){
            if(colo==0){
                array[i][0]=colo;
            }
        }
    }
}