
package com.panchayat.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.panchayat.repository.MemberRepository;
import com.panchayat.entity.Member;

@Service
public class MemberService{

 @Autowired
 private MemberRepository repo;

 public List<Member> getMembers(Long familyId){
  return repo.findByFamilyId(familyId);
 }

 public Member save(Member m){
  return repo.save(m);
 }
}
