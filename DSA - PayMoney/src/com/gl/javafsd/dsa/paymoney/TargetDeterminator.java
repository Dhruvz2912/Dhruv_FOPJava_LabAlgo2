package com.gl.javafsd.dsa.paymoney;

public class TargetDeterminator {

	private int[] noOfTransactionsCountArray;
	private int dailyTarget;

	Result result;

	public TargetDeterminator(int[] noOfTransactionsCountArray, int dailyTarget) {

		this.noOfTransactionsCountArray = noOfTransactionsCountArray;
		this.dailyTarget = dailyTarget;

		result = new Result();

	}

	public Result determine() {

		int tempValue = 0;

		for (int index = 0; index < noOfTransactionsCountArray.length; index++) {

			int noOfTransactions = noOfTransactionsCountArray[index];

			tempValue = tempValue + noOfTransactions;

			if (tempValue >= dailyTarget) {

				result.setNoOfTranscations((index + 1));

				result.setTargetAchievedOrNot(true);

				break;

			}

		}

		if (!result.isTargetAchievedOrNot()) {
			result.setNoOfTranscations(-1);
		}

		return result;
	}
}
