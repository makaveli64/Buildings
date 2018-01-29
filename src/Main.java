public class Main {
    private static int[] buildings = new int[10];

    private static void initArray() {
        buildings[0] = 3;
        buildings[1] = 5;
        buildings[2] = 8;
        buildings[3] = 2;
        buildings[4] = 5;
        buildings[5] = 1;
        buildings[6] = 12;
        buildings[7] = 9;
        buildings[8] = 10;
        buildings[9] = 4;
    }

    public static void main(String[] args) {
        initArray();
        int[] result = new int[10];
        Stack stack = new Stack(10);
        for (int i = 0; i < buildings.length; i++) {
            while (!stack.isEmpty() && buildings[stack.top()] <= buildings[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.top();
            }

            stack.push(i);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
