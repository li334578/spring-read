package bean;

/**
 * @ClassName A
 * @Description TODO
 * @Author Wenbo Li
 * @Date 18/3/2023 下午 1:23
 * @Version 1.0
 */
public class A {

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "A{" + "b=" + b + '}';
	}
}
