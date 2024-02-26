package com.raazi.cookbook

sealed class Screen(val route:String) {
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")
}
