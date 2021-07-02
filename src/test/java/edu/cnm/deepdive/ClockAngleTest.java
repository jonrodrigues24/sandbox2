package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockAngleTest {

  static final double threePm = (90);
  static final double threeForty = (110);

  @Test
  void angleHour() {

    assertEquals(threePm, ClockAngle.angleHour(3,0));
    assertEquals(threeForty, ClockAngle.angleHour(3,40));
  }

  static final int fifteen = 90;
  static final int thirtyMin = 180;

  @Test
  void angleMin() {
    assertEquals(fifteen, ClockAngle.angleMin(15));
    assertEquals(thirtyMin, ClockAngle.angleMin(30));

  }
}