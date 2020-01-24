package com.bourne.behaviorImpl

import com.bourne.behavior.FlyBehavior

class FlyNoWay extends FlyBehavior {
  
  override def fly() = println("I do not wings therefore can't fly.")
}