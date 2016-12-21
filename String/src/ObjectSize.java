import javax.sound.midi.Instrument;

class t {

}

class t1 {
	int w;
	String a = "hello";
}

public class ObjectSize {
	public static void premain(String a, Instrument ins) {
		// System.out.println("t size is "+ins.getobjectsize(new t()));
		// System.out.println("t size is "+ins.getobjectsize(new t1()));
		System.out.println("premain call");
	}

	public static void main(String[] args) {
		System.out.println("main call");

	}

}
