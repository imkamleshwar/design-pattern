package com.bourne.behaviorImpl

import com.bourne.behavior.QuackBehavior

class MuteQuack extends QuackBehavior {
  
  override def quack() = println("I Can't Speak ..!!")
}