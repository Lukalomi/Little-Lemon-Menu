package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert ->
                productsList.filterDessert()

            FilterType.Drinks ->
                productsList.filterDrinks()

            FilterType.Food ->
                productsList.filterFood()

        }
    }

    private fun List<ProductItem>.filterDessert(): List<ProductItem> {
        return  filter {
            it.category == "Dessert"
        }
    }

    private fun List<ProductItem>.filterDrinks(): List<ProductItem> {
        return  filter {
            it.category == "Drinks"
        }
    }

    private fun List<ProductItem>.filterFood(): List<ProductItem> {
        return  filter {
            it.category == "Food"
        }
    }

}