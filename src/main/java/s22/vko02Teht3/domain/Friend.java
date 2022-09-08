package s22.vko02Teht3.domain;

import javax.validation.constraints.NotNull;

public class Friend {
	
	@NotNull
	private String name;

	public Friend() {
		super();
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
}
