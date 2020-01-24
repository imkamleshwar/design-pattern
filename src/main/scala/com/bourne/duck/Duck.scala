package com.bourne.duck

import com.bourne.behavior.FlyBehavior
import com.bourne.behavior.QuackBehavior

class Duck {
  private var flyBehavior: FlyBehavior = _
  private var quackBehavior: QuackBehavior = _

  def performFly() {
    flyBehavior.fly()
  }

  def performQuack() {
    quackBehavior.quack()
  }

  def swim() = println("I can swim")
  def display() = println("dispaly image")

  def setFlybehavior(fb: FlyBehavior) {
    this.flyBehavior = fb
  }

  def setQuackBehavior(qb: QuackBehavior) {
    this.quackBehavior = qb
  }

}