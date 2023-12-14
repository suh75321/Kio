package com.example.myapplication.semple

import com.example.myapplication.BurgerMenu
import com.example.myapplication.DrinkMenu

fun main() {
    println("========================================")
    println("   버거킹에 오신걸 환영 합니다!  ")
    println("========================================")

    val burgerMenu = BurgerMenu()
    val drinkMenu = DrinkMenu()

    while (true) {
        try {
            println("메뉴를 선택하세요:")
            println("1. 버거")
            println("2. 음료")
            println("3. 종료")
            print(" ---> ")

            val input = readLine()!!.toInt()

            when (input) {
                1 -> {
                    burgerMenu.showMenu()

                    val burgerInput = readLine()!!.toInt()

                    when (burgerInput) {
                        0 -> {
                        }
                        in 1..burgerMenu.menuItems.size -> {
                            burgerMenu.menuItems[burgerInput - 1].displayInfo()
                        }
                        else -> {
                            println("올바른 번호를 입력하세요.")
                        }
                    }
                }
                2 -> {
                    drinkMenu.showMenu()

                    val drinkInput = readLine()!!.toInt()

                    when (drinkInput) {
                        0 -> {
                        }
                        in 1..drinkMenu.menuItems.size -> {
                            drinkMenu.menuItems[drinkInput - 1].displayInfo()
                        }
                        else -> {
                            println("올바른 번호를 입력하세요.")
                        }
                    }
                }
                3 -> {
                    println("프로그램을 종료합니다.")
                    break
                }
                else -> {
                    println("1, 2, 3 중에서 선택하세요.")
                }
            }
        } catch (e: NumberFormatException) {
            println("올바른 숫자를 입력하세요.")
        }
    }
}
