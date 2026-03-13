
package com.panchayat.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.panchayat.entity.Member;
import com.panchayat.service.MemberService;

@RestController
@RequestMapping("/api/members")
@CrossOrigin
public class MemberController{

 @Autowired
 private MemberService service;

 @GetMapping("/family/{id}")
 public List<Member> getMembers(@PathVariable Long id){
  return service.getMembers(id);
 }

 @PostMapping
 public Member addMember(@RequestBody Member m){
  return service.save(m);
 }
}
