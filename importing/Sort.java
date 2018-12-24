import java.util.Arrays;

class Sort {
    public static void main(String[] args) {
        String [] names = {"Mike", "Dan", "Emily"};
        int [] nums = {200, 100, 300};
        display(names);
        display(nums);
        Arrays.sort(names);
        Arrays.sort(nums);
        display(names);
        display(nums);
    }

    public static void display(String [] elems) {
        System.out.println("String array: ");
        for (int i=0; i < elems.length; i++)
        System.out.println("Element " + i + " is: " + elems[i]);
    }

    public static void display(int [] elems) {
        System.out.println("Integer array: ");
        for (int i=0; i < elems.length; i++)
        System.out.println("Element " + i + " is: " + elems[i]);
    }
}