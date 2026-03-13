
package com.panchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.panchayat.entity.Member;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long>{
 List<Member> findByFamilyId(Long familyId);
}
