package interview.gs.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check {
	public static void main(String sd[]) {
		Map<Long, List<Long>> m = new HashMap<>();
		List<Long> abc = new ArrayList<Long>();
		abc.add(1L);
		abc.add(2L);
		abc.add(1L);
		m.put(1L, abc);
		for (Long x : m.keySet()) {
			List<Long> xy = m.get(x);
			xy.remove(1L);
		}
		System.out.println(m.get(1L));
	}
}
