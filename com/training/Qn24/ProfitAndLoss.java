package com.training.Qn24;

/**
 * Profit and Loss Sam purchased x dozens of toys at the rate of Rs. y per
 * dozen. He sold each one of them at the rate of Rs. z. Can you please help him
 * out percentage of profit? Given the values of x, y and z, write a program to
 * compute Sam's profit percentage. Example: Dozens of toys purchased (x) = 20
 * Rate per dozen (y) = Rs. 375 Selling price per toy (z) = Rs. 33 Cost Price of
 * 1 toy = 375/12 = Rs. 31.25 Selling Price of 1 toy = Rs.33 Profit = 33 - 31.25
 * = Rs. 1.75 Profit % = 1.75 / 31.25 * 100 = 5.6% Input Format: Input consists
 * of 3 integers � x, y and z. x - Number of dozens purchased. y - Cost per
 * dozen. z - Selling price per item. Output Format: The profit percentage needs
 * to be printed correct to 2 decimal places. Sample Input and Output: number of
 * dozens of toys purchased 20 price per dozen 375, selling price of 1 toy
 * 33,Sam's profit percentage is 5.60 percent
 **/

public class ProfitAndLoss {

	public static void main(String[] args) {

		System.out.println(calculateProfit(20, 375,33));
		
	}

	public static double calculateProfit(int x, int y, int z) {
	int	noOfDozens = x;
	int costPerDozen = y;
	int sellingPricePerItem =z;
	
	double buyingPricePerItem = y/12;
	double profit = ((sellingPricePerItem-buyingPricePerItem))/100*x;
		
		return profit;
	}

}
