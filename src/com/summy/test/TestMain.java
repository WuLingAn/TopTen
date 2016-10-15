package com.summy.test;

import com.summy.factory.SleepFactory;
import com.summy.intetFace.IfSleep;

public class TestMain {

	public static void main(String[] args) {

		SleepFactory sleepFactory = SleepFactory.getInstance();
		/*
		 * IfSleep sleep = sleepFactory.CreateSleep("nodream");
		 * 
		 * 
		 * sleep.allProcessing();
		 * 
		 * sleep = sleepFactory.CreateSleep(DreamTypeEmum.SWEETDREAM);
		 * 
		 * Object o = DreamTypeEmum.SWEETDREAM;
		 * 
		 * sleep.allProcessing(); sleep =
		 * sleepFactory.CreateSleep(DreamTypeEmum.dreamTypeOf(0));
		 * 
		 * sleep.allProcessing();
		 * 
		 * System.out.println(SimpleEnum.E666666.toString());
		 * 
		 * System.out.println(DreamTypeEmum.SWEETDREAM == o);
		 * 
		 * System.out.println(o.getClass());
		 */
		IfSleep sleep = sleepFactory.CreateSleepByKey("noDream");

		sleep.allProcessing();

	}

}
