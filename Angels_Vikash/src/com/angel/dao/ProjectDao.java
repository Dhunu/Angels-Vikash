package com.angel.dao;

import com.angel.exceptions.ProjectExceptions;
import com.angel.model.Project;

public interface ProjectDao {
	
	public String insertProject(Project project) throws ProjectExceptions;

}
