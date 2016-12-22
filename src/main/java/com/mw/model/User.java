package com.mw.model;

import java.io.Serializable;

/**
 * <p>
 * 测试用户类
 * </p>
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/* 主键ID 注解，value 字段名，type 用户输入ID */
	private Long id;

	/* 测试忽略验证 */
	private String name;

	private Integer age;

	/* 测试下划线字段命名类型, 字段填充 */
	private Integer testType;


	private String desc = "默认描述";

	public User() {

	}

	public User(String name) {
		this.name = name;
	}

	public User(Integer testType) {
		this.testType = testType;
	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public User(Long id, Integer age) {
		this.id = id;
		this.age = age;
	}

	public User(Long id, String name, Integer age, Integer testType) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.testType = testType;
	}

	public User(String name, Integer age, Integer testType) {
		this.name = name;
		this.age = age;
		this.testType = testType;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTestType() {
		return testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}

}
