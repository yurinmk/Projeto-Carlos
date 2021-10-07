/**
 * 
 */
package br.com.namikoka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.namikoka.modal.Student;
import br.com.namikoka.repository.StudentRepository;
import lombok.AllArgsConstructor;

/**
 * @author Namikoka
 *
 */

@Service
@AllArgsConstructor
public class StudentService {
	
	private final StudentRepository repository;
	
	public void saveStudent(Student student) {
		this.repository.save(student);
	}
	
	
	public List<Student> listStudent() {
		return this.repository.findAll();
	}
	
	public void removeStudent(Long id) {
		this.repository.deleteById(id);
	}

	public Student findStudent(String name) {
		return this.repository.findByName(name);
	}
	
	public List<Student> findStudentsPerCourse(String couser) {
		return this.repository.findByCourse(couser);
	}
	
	public Student findStudentID(Long id) {
		return this.repository.getById(id);
	}
	
}
