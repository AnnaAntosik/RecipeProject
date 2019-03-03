package com.qna.exercises.recipeproject.recipeproject.repositories;

import com.qna.exercises.recipeproject.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
