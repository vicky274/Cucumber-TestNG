package Webautomation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;

public class Whilewait {

	public static void main(String[] args) throws InterruptedException {
		
		/*long start = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		System.out.println(start);
		Thread.sleep(5000);
		
		long current = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		System.out.println(current);*/
		
		
		/*long start_time = System.currentTimeMillis();
		System.out.println(start_time);
		long wait_time = 1000;
		long end_time = start_time + wait_time;

		while (System.currentTimeMillis() < end_time) {
		 
			Thread.sleep(1000);
			System.out.println("inside loop");
		}

		String id="BASIS/Comf/KJB/BD/015655413";
		String[] id1 = id.split("/");
		System.out.println(id1.length);
		System.out.println(id1[id1.length-1]);
		
		String i="10.00";
		System.out.println(i.split("[.]")[0]);*/
		System.out.println(StringUtils.leftPad("8", 2, '0'));
		bau_FormattedTime();
	}
	public static String bau_FormattedTime() {
    	//16:400
		String hourandminute = "", rep = "", repl = "";
		String hour = null;
		try {
			SimpleDateFormat format4 = new SimpleDateFormat("HH:mm");
			Calendar c1 = Calendar.getInstance();
			c1.add(Calendar.MINUTE, +15);
			System.out.println(format4.format(c1.getTime()));
			hourandminute = format4.format(c1.getTime());

			if (hourandminute.substring(3, 4).matches("[012]")) {
				rep = hourandminute.substring(3, 4).replaceAll("[012]", "3");
			} else if (hourandminute.substring(3, 4).matches("[345]")) {
				rep = hourandminute.substring(3, 4).replaceAll("[345]", "0");
			}
			repl = hourandminute.substring(4).replaceAll("[1-9]", "0");
			String minu = rep + repl;
			if (minu.matches("0{2}")) {
				int h = Integer.valueOf(hourandminute.substring(0, 2)) + 1;
				hour = StringUtils.leftPad(String.valueOf(h), 2, '0');
				System.out.println("Hour :" + hour);
				System.out.println("Time :" + hour + ":" + rep + repl);
				return hour + ":" + rep + repl;
			}
			System.out.println(hourandminute.substring(0, 3) + rep + repl);
		} catch (Exception e) {

		}
		return hourandminute.substring(0, 3) + rep + repl;
	}
}
