package genericity.test;

import com.summy.enums.DreamTypeEmum;
import com.summy.factory.SleepFactory;

import genericity.member.Box;

public class GenericityTest {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();

		box.f(SleepFactory.getInstance().CreateSleep(DreamTypeEmum.SWEETDREAM));


	}

}
