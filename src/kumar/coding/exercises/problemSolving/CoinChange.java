package kumar.coding.exercises.problemSolving;
/**
 * 
 */
public class CoinChange {

	public static void main(String[] args) {
		System.out.println(testing());
		System.out.println(Character.isLetter(' '));
	}
	
   public static int testing(){
	   int amount = 5; 
	   int[] coins = {1, 2, 5};
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
   }
}
