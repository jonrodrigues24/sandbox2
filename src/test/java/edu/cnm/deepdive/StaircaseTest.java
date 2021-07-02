package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseTest {

  static final String[] sevenSpaceOneStar = {
      "      *",
      "     **",
      "    ***",
      "   ****",
      "  *****",
      " ******",
      "*******"
  };

  @Test
  void oneLine() {

    assertArrayEquals(sevenSpaceOneStar, Staircase.tree(7));
    //assertEquals(sevenSpaceOneStar, Staircase.oneLine(7,1));
  }

  @Test
  void tree() {

  }
}