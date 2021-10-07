/**
 * 
 */
package br.com.namikoka.repository;

import br.com.namikoka.modal.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Namikoka
 *
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findByName(String name);
	List<Student> findByCourse(String course);

}
