package com.summy.factory;

import java.util.Map;

import com.summy.enums.DreamTypeEmum;
import com.summy.impl.NoDream;
import com.summy.impl.SweetDream;
import com.summy.intetFace.IfSleep;
import com.summy.utils.PropertiesReader;

public class SleepFactory {

	private Map<String, String> typeMap;

	private static SleepFactory sleepFactory = new SleepFactory();

	private SleepFactory() {
		typeMap = new PropertiesReader().read();
	}

	public static SleepFactory getInstance() {
		return sleepFactory;
	}

	public IfSleep CreateSleepByKey(String name) {

		IfSleep sleep = null;
		try {
			sleep = (IfSleep) Class.forName(typeMap.get(name)).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sleep;
	}

	public IfSleep CreateSleep(String name) {
		if ("sweetDream".equalsIgnoreCase(name)) {
			return new SweetDream();
		} else if ("Nightmare".equalsIgnoreCase(name)) {
			return new SweetDream();
		}
		return new NoDream();
	}

	public IfSleep CreateSleep(DreamTypeEmum dreamType) {

		IfSleep sleep = null;
		try {
			sleep = (IfSleep) Class.forName(dreamType.getClassName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sleep;
	}
}
