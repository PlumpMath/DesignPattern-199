package answer;

public class Main1 {

	public static void main(String[] args) {
		//Entry list = new Cons();
		Cons list = new Cons();
		for(int i = 0; i < 10; i++){
			list.add(new Content(String.valueOf(i)));
		}
		for(Entry e: list){
			System.out.println(e.getContent());
		}
		
		Cons c0 = new Cons(new Cons(new Content("1"),new Content("2")),new Content("3"));
		//[[1,2],3]
		for(Entry e : c0){
			System.out.println(e.getContent());
		}
		
		Cons c1 = new Cons(new Content("2"),null);
		c1.add(new Content("3"));
		//System.out.println(c1.getContent());
		Cons c2 = new Cons();
		c2.add(new Content("1"));
		//System.out.println(c2.getContent());
		c2.add(c1);
		//[1,[[2,[3,()]],()]]
		//System.out.println(c2.getContent());
		for(Entry e : c2){
			System.out.println(e.getContent());
		}
		
	}
}
