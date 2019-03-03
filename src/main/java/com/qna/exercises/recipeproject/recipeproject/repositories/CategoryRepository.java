package com.qna.exercises.recipeproject.recipeproject.repositories;

import com.qna.exercises.recipeproject.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
