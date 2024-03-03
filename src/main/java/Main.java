
public class Main {
	
	public static String find (Queue<wolter>q, int cc) {
		
		q.insert(null);
		
		while(q.head().getCc()<cc&q.head()!=null) {
			q.insert(q.remove());
		}
		
		String id=q.head().getId();
		
		while(q.head()!=null) {
			q.insert(q.remove());
		}
		
		return id;
	}
	
	public static Queue<wolter> build(){
		wolter w =new wolter();
		Queue<wolter>q=new Queue<wolter>();
		
		for(int i=0; i<=10; i++) {
			w=new wolter();
			q.insert(w);
		
		}
		q.remove();
		return q;
		
	}

	public static void main(String[] args) {
		
		Queue<wolter> wolt =build();
		System.out.println(wolt);
		System.out.println(find(wolt,765));
		
		
	}

}

//////////////////////////////


public class wolter {
	
	private String id=""+(int)(Math.random()*((9999-1000)+1));
	private int cc=(int)+(Math.random()*((999-100)+1));;
	
	

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}


	public String toString() {
		return "wolter [id=" + id + ", cc=" + cc + "]";
	}
	
	
}

//////////////////////////////////////










