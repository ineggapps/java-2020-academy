package d200213;

public class UserVO {
	private String name;
	private int age;
	private String tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	/* 
	Reference
	- What is the use of getters and setters in java?
		https://www.quora.com/What-is-the-use-of-getters-and-setters-in-java
	
		 Getters and setters in Java are methods that let us read and write the value of an instance variable of an object.
		 And this is the way we can set and get values rather than directly exposing fields of a class.
		As per the OO Principles, one should have properties as private and changes must be allowed through the methods only.
		This rule is for enforcing the guaranty that there will be no accidental change of property.
		If we make properties as public then others can directly change the it and by using getters setters, we can have primitive data validations with it.
		Along with that, getters setters can also be used for purpose of say reflection, serialization, mock objects, with Hibernate etc in Java.
	
	- What is the benefit of getter and setter methods?
		https://dev.to/ogwurujohnson/getters-and-setters-used-in-javascript-objectshow-4jef
		
		Getter and Setter methods get and set the properties of an object.
		Advantages: You can check if new data is valid before setting a property.
		You can perform an action on the data which you are getting or setting on a property.
	*/
}
