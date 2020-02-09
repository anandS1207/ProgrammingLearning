package interview.gs.problems;

public class ChargingAPhone {
	public static void main(String args[]) {
		// System.out.println(chargingSmartPhone(0, 550));
		int time = 2;
		int initcharge = 20;
		while (initcharge <= 230) {
			time++;
			initcharge+=5;
		}
		System.out.println(time);
		System.out.println(initcharge);
	}

	static int chargingSmartPhone(int initCharge, int finalCharge) {
		// Write your code here
		int time = 0;
		if (initCharge >= finalCharge)
			time = 0;
		while (initCharge <= 10 && initCharge < finalCharge) {
			initCharge += 10;
			time += 1;
		}
		if (initCharge >= 11 && initCharge <= 230) {
			if (finalCharge >= 230) {
				int temp = (int) Math.ceil((230 - initCharge) / 5.0);
				time = time + temp;
				initCharge += temp * 5;
			} else {
				while (initCharge < finalCharge) {
					time += 1;
					initCharge += 5;
				}
			}
		}
		if (initCharge >= 231 && initCharge <= 559) {
			if (finalCharge >= 559) {
				int temp = (int) Math.ceil((559 - initCharge) / 8.0);
				time = time + temp;
				initCharge += temp * 8;
			} else {
				while (initCharge < finalCharge) {
					initCharge += 8;
					time += 1;
				}
			}
		}
		if (initCharge >= 560 && initCharge <= 1009) {
			if (finalCharge >= 1009) {

				int temp = (int) Math.ceil((1009 - initCharge) / 2.0);
				time += temp;
				initCharge += temp * 2;
			} else {
				while (initCharge < finalCharge) {
					initCharge += 2;
					time += 1;
				}
			}
		}
		if (initCharge >= 1010 && initCharge <= 5000) {
			if (finalCharge >= 5000) {
				int temp = (int) Math.ceil((5000 - initCharge) / 7.0);
				time += temp;
				initCharge += temp * 7;
			} else {
				while (initCharge < finalCharge) {
					initCharge += 7;
					time += 1;
				}
			}
		}
		if (initCharge >= 50001 && initCharge <= 10000) {
			if (finalCharge >= 10000) {
				int temp = (int) Math.ceil((10000 - initCharge) / 8.0);
				time += temp;
				initCharge += temp * 8;
			} else {
				while (initCharge < finalCharge) {
					initCharge += 8;
					time += 1;
				}
			}
		}

		if (initCharge < finalCharge) {
			int pending = finalCharge - initCharge;
			int temp = (int) Math.floor(pending / 3.0);
			time += temp;
		}
		return time;
	}
}
