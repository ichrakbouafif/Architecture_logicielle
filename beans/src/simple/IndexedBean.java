package simple;

public class IndexedBean {
	
	private String[] elements;

	public String[] getElements() {
		return elements;
	}

	public void setElements(String[] elements) {
		this.elements = elements;
	}
	
	public String getElements(int index) {
		return elements[index];
	}

	public void setElements(int index, String elements) {
		this.elements[index] = elements;
	}

}
