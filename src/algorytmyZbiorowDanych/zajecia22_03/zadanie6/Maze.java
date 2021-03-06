package algorytmyZbiorowDanych.zajecia22_03.zadanie6;

import java.awt.*;
import java.util.ListIterator;
import java.util.Stack;

public class Maze {
    public static void main(String[] args) {
        int[][] maze1 = {
                {1, 0, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1}
        };
        int[][] maze2 = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}
        };

        Stack<Point> points = new Stack<>();
        points.push(new Point(1, 1));
        points.push(new Point(2, 1));
        points.push(new Point(1, 4));
        points.push(new Point(16, 1));

//        System.out.println(isOnStack(new Point(1, 4), points));
//        System.out.println(isOnStack(new Point(1, 5), points));
//        solveMaze(maze1);
        solveMaze(maze2);

    }

    public static int findStart(int[] maze1) {
        int i = 0;
        while (maze1[i] != 0) {
            i++;
        }
        return i;
    }

    public static void solveMaze(int[][] maze1) {
        Stack<Point> points = new Stack<>();
        int x = findStart(maze1[0]);
        int y = 0;
        Point currentPoint = new Point(x, y);
        while (currentPoint.getY() != maze1.length - 1) {
            System.out.println(currentPoint.getY() + " " + currentPoint.getX());
            if (maze1[currentPoint.getY() + 1][currentPoint.getX()] == 0
                    && !isOnStack(new Point(currentPoint.getX(), currentPoint.getY() + 1), points)) {
                currentPoint.setY(currentPoint.getY() + 1);
                points.push(new Point(currentPoint));
            } else if (maze1[currentPoint.getY()][currentPoint.getX() + 1] == 0
                    && !isOnStack(new Point(currentPoint.getX() + 1, currentPoint.getY()), points)) {
                currentPoint.setX(currentPoint.getX() + 1);
                points.push(new Point(currentPoint));
            } else if (maze1[currentPoint.getY()][currentPoint.getX() - 1] == 0
                    && !isOnStack(new Point(currentPoint.getX() - 1, currentPoint.getY()), points)) {
                currentPoint.setX(currentPoint.getX() - 1);
                points.push(new Point(currentPoint));
            } else if (maze1[currentPoint.getY() - 1][currentPoint.getX()] == 0
                    && !isOnStack(new Point(currentPoint.getX(), currentPoint.getY() - 1), points)) {
                currentPoint.setY(currentPoint.getY() - 1);
                points.push(new Point(currentPoint));
            } else {
                Point fromStack = points.pop();
                maze1[fromStack.getY()][fromStack.getX()] = 1;
                currentPoint = new Point(points.peek());
            }
        }

        System.out.println(currentPoint.getY() + " " + currentPoint.getX());
    }


    public static boolean isOnStack(Point point, Stack<Point> points) {
//        Point foundPoint = points.stream()
//                .filter(point1 -> point1.getY() == point.getY() && point1.getX() == point.getX())
//                .findAny()
//                .get();
        ListIterator<Point> pointListIterator = points.listIterator();
        while (pointListIterator.hasNext()) {
            Point nextPoint = pointListIterator.next();
            if (nextPoint.equals(point)) {
                return true;
            }
        }
        return false;
    }
}
