package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;
import com.project_2.project_2.entities.concretes.Subject;


public interface SubjectDal {
	List<Subject> getAllSubject();
	void create(Subject subject);
	void update(Subject subject);
	String getSubjectById(int id);
}
