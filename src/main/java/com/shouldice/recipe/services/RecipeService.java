package com.shouldice.recipe.services;

import com.shouldice.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
