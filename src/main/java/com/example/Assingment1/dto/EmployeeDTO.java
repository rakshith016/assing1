package com.example.Assingment1.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private Long age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
    
	public EmployeeDTO(Long id, String name, Long age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

    
}
