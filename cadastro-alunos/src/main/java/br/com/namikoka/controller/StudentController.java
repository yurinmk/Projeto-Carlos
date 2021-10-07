/**
 * 
 */
package br.com.namikoka.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.namikoka.modal.Student;
import br.com.namikoka.service.StudentService;
import lombok.AllArgsConstructor;

/**
 * @author Namikoka
 *
 */

@AllArgsConstructor
@RestController
@RequestMapping("api/aluno")
public class StudentController {
	
	private StudentService service;
	
	@GetMapping("listarAlunos")
	public List<Student> listStudent() {
		return this.service.listStudent();
	}
	
	@GetMapping("procurarAluno")
	public Student findStudent(@RequestParam("name") String name) {
		return this.service.findStudent(name);
	}
	
	@GetMapping("procurarAlunoPorCurso")
	public List<Student> findStudentPerCouser(@RequestParam("course") String course) {
		return this.service.findStudentsPerCourse(course);
	}
	
	@PostMapping("criarAluno")
	public String createStudent(@RequestBody Student student) {
		this.service.saveStudent(student);
		return "Aluno Salvo com sucesso!";
	}
	
	@DeleteMapping("excluirAluno/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		this.service.removeStudent(id);
		return "Aluno excluido com sucesso!";
	}
	
	@PutMapping("editarAluno")
	public String editStudent(@RequestBody Student student) {
		this.service.saveStudent(student);
		return "Aluno atualizado com sucesso!";
		
	}
	
	
}