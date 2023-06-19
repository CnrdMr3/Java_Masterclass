public class Student {

	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;

	public Student(String id, String name, String dateOfBirth, String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", dateOfBirth='" + dateOfBirth + '\'' +
				", classList='" + classList + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClassList() {
		return classList;
	}

	public void setClassList(final String classList) {
		this.classList = classList;
	}
}
