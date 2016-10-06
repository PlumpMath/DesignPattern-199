package answer;

public class Main1 {

	public static void main(String[] args) {
		Entry list = new Cons();
		for(int i = 0; i < 10; i++){
			list.add(new Content(String.valueOf(i)));
		}
		for(Entry e: list){
			System.out.println(e.getContent());
		}
	}
}
