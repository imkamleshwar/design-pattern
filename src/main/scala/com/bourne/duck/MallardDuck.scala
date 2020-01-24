package com.bourne.duck

import com.bourne.behaviorImpl.FlyWithWings
import com.bourne.behaviorImpl.Quack
import com.bourne.behaviorImpl.FlyNoWay
import com.bourne.behaviorImpl.MuteQuack

class MallardDuck extends Duck {

  setFlybehavior(new FlyNoWay)
  setQuackBehavior(new MuteQuack)

  override def display() = println("I'm real Mallard duck")

}

object MallardDuck extends App {

  val md: Duck = new MallardDuck
  
  md.display()
  md.performFly()
  md.performQuack()
  md.setFlybehavior(new FlyWithWings)
  md.setQuackBehavior(new Quack)
  md.performFly()
  md.performQuack()
  md.swim()

}