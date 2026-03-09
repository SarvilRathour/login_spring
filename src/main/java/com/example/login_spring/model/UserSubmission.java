package com.example.login_spring;
public class UserSubmission{
  public String id;
  public String name;
  public String email;
  public String password;
  public UserSubmission(){}
  public UserSubmission(String id, String name, String email, String password){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
  }
}
