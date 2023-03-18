package bean;

/**
 * @ClassName B
 * @Description TODO
 * @Author Wenbo Li
 * @Date 18/3/2023 下午 1:23
 * @Version 1.0
 */
public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{" + "a=" + a + '}';
	}
}
