package com.example.login_spring;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.login_spring.UserSubmission;
@RestController
public class UserController{
  //This is service
  private List<UserSubmission> Users=new ArrayList<>();
  @GetMapping("/")
  public List<UserSubmission> home(){
    return Users;
  }
  @PostMapping("/enter")
  public String insert(@RequestBody UserSubmission user){
    Users.add(user);
    return "User added";
  }
}
