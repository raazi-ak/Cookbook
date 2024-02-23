package com.raazi.cookbook

data class Category(var idCategory: String,
                    var strCategory:String,
                    var strCategoryThumb:String,
                    var strCategoryDescription: String)

data class CategoriesResponse(var categories: List<Category>)


//"categories": [
//{
//    "idCategory": "1",
//    "strCategory": "Beef",
//    "strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
//    "strCategoryDescription": "Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times.[1] Beef is a source of high-quality protein and essential nutrients.[2]"
//},