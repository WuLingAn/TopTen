package com.summy.intetFace;

public interface IfSleep {
	
	/**
	 * 洗漱
	 */
	public void toWash();

	/**
	 * 脱衣服
	 */
	public void Disrobe();

	/**
	 * 上床
	 */
	public void toBed();

	/**
	 * 睡觉
	 */
	public void sleeping();

	/**
	 * 起床
	 */
	public void getUp();

	/**
	 * 总流程
	 */
	public default void allProcessing() {
		this.toWash();
		this.Disrobe();
		this.toBed();
		this.sleeping();
		this.getUp();
	}

}
