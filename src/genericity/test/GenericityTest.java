package genericity.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.summy.enums.DreamTypeEmum;
import com.summy.factory.SleepFactory;

import genericity.member.Box;

public class GenericityTest {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();

		box.f(SleepFactory.getInstance().CreateSleep(DreamTypeEmum.SWEETDREAM));

		String conpileStr = "ui*80*-+^hjfdslk^&$%)(>:POJkoji_87";

		Pattern p = Pattern.compile("[!\"\\·$%&/()=?;:_*'#+-, .   ]");
		Matcher m = p.matcher(conpileStr);
		conpileStr = m.replaceAll("").trim();

		System.out.println(conpileStr);

	}

}
