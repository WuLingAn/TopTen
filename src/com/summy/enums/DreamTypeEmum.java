package com.summy.enums;

public enum DreamTypeEmum {
	SWEETDREAM("com.summy.impl.SweetDream", 1), NIGHTMARE("com.summy.impl.Nightmare",
			2), NODREAM("com.summy.impl.NoDream", 3);

	private String className;
	private int index;

	private DreamTypeEmum(String name, int ordinal) {
		this.className = name;
		this.index = ordinal;
	}

	public String getClassName() {
		return className;
	}

	public int getIndex() {
		return index;
	}

	public static DreamTypeEmum dreamTypeOf(int index) {
		for (DreamTypeEmum dreamType : values()) {
			if (dreamType.getIndex() == index) {
				return dreamType;
			}
		}
		return NODREAM;
	}
}
