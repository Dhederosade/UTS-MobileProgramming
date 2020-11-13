package com.revan.R18090091

class angkaLogic {
    var result=0

    fun hitungplus(A1: Double, A2: Double, A3: Double): Double {
        this.result = (A1 * A2 * A3).toInt()
        return A1 * A2 * A3
    }
    fun hitungkurang(A1: Double, A2: Double, A3: Double): Double {
        this.result = (A1 - A2 - A3).toInt()
        return A1 - A2 - A3
    }
    fun hitungbagi(A1: Double, A2: Double, A3: Double): Double {
        this.result = (A1 / A2 / A3).toInt()
        return A1 / A2 / A3
    }

    }


