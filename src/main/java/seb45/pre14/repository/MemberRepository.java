package seb45.pre14.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seb45.pre14.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
