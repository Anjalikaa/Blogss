package org.java.blogs.repository;

import java.util.List;

import org.java.blogs.entity.Blog;
import org.java.blogs.entity.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	
	List<Item> findByBlog(Blog blog, Pageable pageable);
}
