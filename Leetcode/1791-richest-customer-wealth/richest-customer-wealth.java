class Solution {
    public int maximumWealth(int[][] accounts) {
        int Maximum = 0 ;
        
        for(int i = 0 ; i < accounts.length ; i++){
            int Wealth = 0 ;
            for(int j = 0 ; j < accounts[i].length ; j++){
                Wealth += accounts[i][j];

              }
                if(Wealth > Maximum){
                    Maximum = Wealth ;
                }
                
            
        }

        return Maximum ; 
    }
}