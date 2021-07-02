package edu.cnm.deepdive;

import java.util.ArrayList;

public class Staircase {

  public static String oneLine(int height, int starCount) {

    String lineActual = "";
    String spaceActual = "";
    String starActual = "";

    for (int i = 0; i < height; i++) {

      spaceActual += " ";

    }

    for (int i = 0; i < starCount; i++) {

      starActual += "*";

    }

    lineActual = spaceActual + starActual;
    System.out.println(lineActual);

    return lineActual;

  }

  public static String[] tree(int height) {

    int starCount = 1;
    int spaceCount = (height - 1);
    String[] treeBuild = new String[height];

    for (int i = 0; i < height; i++) {

      treeBuild[i] = oneLine(spaceCount, starCount);
      starCount = starCount + 1;
      spaceCount = spaceCount - 1;

    }
    return treeBuild;
  }

}

