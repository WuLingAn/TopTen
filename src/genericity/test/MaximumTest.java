package genericity.test;

import java.util.ArrayList;
import java.util.List;

public class MaximumTest {
	// 比较三个值并返回最大值
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // 假设x是初始最大值
		if (y.compareTo(max) > 0) {
			max = y; // y 更大
		}
		if (z.compareTo(max) > 0) {
			max = z; // 现在 z 更大
		}
		return max; // 返回最大对象
	}

	public static void main(String args[]) {

//		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(3, 4, 5));
//
//		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.71, maximum(6.6, 8.8, 7.7));
//
//		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
		
		List<String> l = new ArrayList<String>();
		
		l.add("666");

		getSize(l);
	}

	public static <Z extends List<String>> void getSize(Z l){
		if (l != null && l.size() > 0) {
			System.out.println(l.get(0));
		}
		// System.out.println(l.size());
	}
}