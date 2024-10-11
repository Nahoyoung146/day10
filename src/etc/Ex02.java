package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);

		SimpleDateFormat sim = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh-mm-ss초");
		String t = sim.format(time);
		System.out.println(t);

		Date date = new Date();
		System.out.println(date);
		System.out.println(sim.format(date));
	}
}