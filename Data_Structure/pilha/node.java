package pilha;

public class node {
	private int dat;
	private node reNo = null;
	
	public node() {
	}
	
	public node(int dat) {
		this.dat = dat;
	}

	public int getDat() {
		return dat;
	}

	public void setDat(int dat) {
		this.dat = dat;
	}

	public node getReNo() {
		return reNo;
	}

	public void setReNo(node reNo) {
		this.reNo = reNo;
	}

	@Override
	public String toString() {
		return "node [dat=" + dat + "]";
	}
	
	
	
	
	
	
}
