class Solution {
    public void rotate(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == 0 || i == j || i<j){
                    continue;
                }else{
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        int p1=0;
        int p2=a[0].length-1;
        while(p1<p2){
            for (int i = 0; i < a.length; i++) {
                int temp=a[i][p1];
                a[i][p1]=a[i][p2];
                a[i][p2]=temp;

            }
            p1++;
            p2--;
        }
       }
}
        