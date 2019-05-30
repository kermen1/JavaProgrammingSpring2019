package Day51;

public class AtTheGym {

	public static void main(String[] args) {
		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j= new JuiJitsu();
		Sprinting sp = new Sprinting();
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(30));
		System.out.println(s.perform(30));
		System.out.println(y.perform(30));
		System.out.println(j.perform(30));
		System.out.println(sp.perform(30));
		
		System.out.println("========================================");
		
		Snwboarding sn = new Snwboarding();
		System.out.println(sn.perform(100));

	}

}
