import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (st.peek() < -asteroid) {
                    st.pop();
                } else if (st.peek() == -asteroid) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(asteroid);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision  sol = new  AsteroidCollision ();
        int[] asteroids = {5, 10, -5};  // Example input
        int[] result = sol.asteroidCollision(asteroids);

        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
    }
}
