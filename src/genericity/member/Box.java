package genericity.member;

import com.summy.intetFace.IfSleep;

public class Box<Z> {

	private Z data;

	public Box(Z data) {
		this.data = data;
	}

	public Box() {
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}

	public <Z extends IfSleep> void f(Z x) {
		x.allProcessing();
	}
}
