package com.bourne.behaviorImpl

import com.bourne.behavior.FlyBehavior

class FlyWithWings extends FlyBehavior {
  override def fly() = println("I have wings and can fly.")
}