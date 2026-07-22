package Collection.stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackCustom cs = new StackCustom();
		cs.push(0);
		cs.push(1);
		cs.push(2);
		
		System.out.println(cs.pop());
		//System.out.println(cs.peek());
	}

}
