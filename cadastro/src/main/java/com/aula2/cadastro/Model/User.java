package com.aula2.cadastro.Model;

public class User {
	private String name;
	private String email;
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String nome, String email) {
		this.name = nome;
		this.email = email;
	}
}
