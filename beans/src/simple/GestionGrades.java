package simple;

public class GestionGrades {
	
	private String[] TestGrades;

	public String[] getTestGrades() {
		return TestGrades;
	}

	public void setTestGrades(String[] TestGrades) {
		this.TestGrades = TestGrades;
	}
	
	public String getTestGrades(int index) {
		return TestGrades[index];
	}

	public void setTestGrades(int index, String Grade) {
		this.TestGrades[index] = Grade;
	}

}
