package seb45.pre14.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seb45.pre14.answer.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
