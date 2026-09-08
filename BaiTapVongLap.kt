package com.example.baitapvonglap

fun main() {

    println("Bai 1: In cac so tu 1 den 10")
    for (i in 1..10) {
        print("$i ")
    }

    println("\n\nBai 2: Tinh tong tu 1 den 100")

    var tong = 0
    for (i in 1..100) {
        tong += i
    }

    println("Tong = $tong")

    println("\nBai 3: In cac so chan tu 1 den 20")

    for (i in 1..20) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}