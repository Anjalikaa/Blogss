package org.java.blogs.repository;

import java.util.List;

import org.java.blogs.entity.Blog;
import org.java.blogs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	
	List<Blog> findByUser(User user);
}
