package arrayexamples;

class MaxProfit {
	public static int maxProfit(int[] prices) {
		int totalProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			int dailyProfit = Math.max(0, prices[i] - prices[i - 1]);
			totalProfit = totalProfit + dailyProfit;
		}
		return totalProfit;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = maxProfit(nums);
		System.out.println("Profit : " + k);
	}
}