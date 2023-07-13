package com.demo.jpaHibernate.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.jpaHibernate.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CoursejdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Aditya"));
		repository.insert(new Course(2, "Learn GCP", "Aditya"));
		repository.insert(new Course(3, "Learn Full Stack", "Aditya"));
		
		repository.deleteById(1);
		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
	}
}
