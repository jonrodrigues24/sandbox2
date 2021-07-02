package edu.cnm.deepdive;

public class ClockAngle {

  public static double angleHour(int hour, float min) {

    if (hour < 0 || min < 0) {
      throw new IllegalArgumentException();
    }

    if (hour > 12) {
      hour = hour - 12;
    }

    return ((hour * 60 * min) * 0.5);

  }

  static float angleMin(float min) {

    if (min < 0 || min > 60) {
      throw new IllegalArgumentException();
    }

    return (min * 6);

  }

}
