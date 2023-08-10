package seb45.pre14.member;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seb45.pre14.member.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
