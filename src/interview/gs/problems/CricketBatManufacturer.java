package interview.gs.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CricketBatManufacturer {
	public static void main(String sfds[]) {
		long cricketers, bats;
		Scanner s = new Scanner(System.in);
		cricketers = s.nextLong();
		bats = s.nextLong();
		Map<Long, List<Long>> cricketerCapacity = new TreeMap<Long, List<Long>>(Collections.reverseOrder());
		Map<Long, List<Long>> batsCapacity = new TreeMap<Long, List<Long>>(Collections.reverseOrder());
		Long c;
		for (int i = 0; i < cricketers; i++) {
			c = s.nextLong();
			if (!cricketerCapacity.containsKey(c)) {
				List<Long> money = new ArrayList<Long>();
				long m = s.nextLong();
				money.add(m);
				cricketerCapacity.put(c, money);
			} else {
				long m = s.nextLong();
				cricketerCapacity.get(c).add(m);
			}
		}
		for (int i = 0; i < bats; i++) {
			c = s.nextLong();
			if (!batsCapacity.containsKey(c)) {
				List<Long> money = new ArrayList<Long>();
				long m = s.nextLong();
				money.add(m);
				batsCapacity.put(c, money);
			} else {
				long m = s.nextLong();
				batsCapacity.get(c).add(m);
			}
		}
		Long count = -1L;
		for (Long cc : cricketerCapacity.keySet()) {
			List<Long> members = cricketerCapacity.get(cc);
			Collections.sort(members, Collections.reverseOrder());
			for (Long bc : batsCapacity.keySet()) {
				if (bc < cc) {
					List<Long> abc = batsCapacity.get(bc);
					Collections.sort(abc, Collections.reverseOrder());
					List<Long> needM = new ArrayList<Long>();
					Long needB = -1L;
					for (Long m : members) {
						for (Long bci : abc) {
							if (bci <= m) {
								needM.add(m);
								needB = bci;
								count++;
								break;
							}
						}
						if (needB != -1L)
							abc.remove(needB);
					}
					members.removeAll(needM);
				}
			}
		}
		System.out.println(count);
	}
}
