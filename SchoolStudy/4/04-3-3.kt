package com.doyoung.andoridlab

abstract class Animal {
    var name : String = ""
    abstract fun move()
}

class Tiger : Animal() {
    var age : Int = 0
    override fun move() {
        println("네 발로 이동한다. ")
    }
}

class Eagle : Animal() {
    var home : String = ""
    override fun move() {
        println("날개로 날아간다. ")
    }
}

fun main() {
    var tiger1 = Tiger()
    var eagle1 = Eagle()

    tiger1.move()
    eagle1.move()

    // 다형성 생성
    var animal : Animal

    animal = Tiger()
    animal.move()

    animal = Eagle()
    animal.move()
    // Animal 은 추상 클래스이므로 객체를 만들 수 없음
}