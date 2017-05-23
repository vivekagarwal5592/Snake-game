package vivz.snakesnake;

import android.graphics.Rect;

import java.util.ArrayList;

/**
 * Created by user on 30-09-2016.
 */
public class Collision_detection {


    public boolean Collision(Rect r, int circle_x, int circle_y, int circle_radius) {


        if (circle_x >= r.left &&
                circle_x <= r.right
                && (Math.abs(circle_y - r.top) <= circle_radius ||
                Math.abs(circle_y - r.bottom) <= circle_radius)) {
            return true;
        } else if (circle_y >= r.top &&
                circle_y <= r.bottom
                && (Math.abs(circle_x - r.right) <= circle_radius
                || Math.abs(circle_x - r.left) <= circle_radius)) {
            return true;
        }

        return false;
    }

    public boolean internal_collision(Rect r, int circle_x, int circle_y, int circle_radius) {
        if (circle_x >= r.left &&
                circle_x <= r.right &&
                circle_y >= r.top &&
                circle_y <= r.bottom

                ) {
            return true;
        }

        return false;
    }


    public boolean Collision(ArrayList<Rect> r, int circle_x, int circle_y, int circle_radius) {


        for (int i = 0; i <= r.size() - 1; i++) {
            if (circle_x >= r.get(i).left &&
                    circle_x <= r.get(i).right
                    && (Math.abs(circle_y - r.get(i).top) <= circle_radius ||
                    Math.abs(circle_y - r.get(i).bottom) <= circle_radius)) {
                return true;
            } else if (circle_y >= r.get(i).top &&
                    circle_y <= r.get(i).bottom
                    && (Math.abs(circle_x - r.get(i).right) <= circle_radius
                    || Math.abs(circle_x - r.get(i).left) <= circle_radius)) {
                return true;
            }
        }
        return false;
    }

    public boolean Collision(int circle1_x, int circle1_y, int circle1_radius,
                             int circle2_x, int circle2_y, int circle2_radius) {


        if (Math.abs(circle1_x - circle2_x) <= circle1_radius + circle2_radius
                && Math.abs(circle1_y - circle2_y) <= circle1_radius + circle2_radius) {

            return true;
        }

        return false;
    }


}
