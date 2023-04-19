public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Test add(E element)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List after adding elements: " + list);

        // Test add(E element, int index)
        list.add(4, 1);
        System.out.println("List after adding element 4 at index 1: " + list);

        // Test get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // Test remove(int index)
        list.remove(1);
        System.out.println("List after removing element at index 1: " + list);

        // Test size()
        System.out.println("Size of the list: " + list.size());

        // Test contains(Object o)
        System.out.println("Does the list contain 2? " + list.contains(2)); // Output: true
        System.out.println("Does the list contain 4? " + list.contains(4)); // Output: false

        // Test remove(Object o)
        System.out.println("Removing 1 from the list: " + list.remove((Integer) 1)); // Output: true
        System.out.println("List after removing 1: " + list);

        // Test indexOf(Object o)
        System.out.println("Index of 2 in the list: " + list.indexOf(2)); // Output: 0

        // Test lastIndexOf(Object o)
        list.add(2);
        System.out.println("List after adding another 2: " + list);
        System.out.println("Last index of 2 in the list: " + list.lastIndexOf(2));

        // Test clear()
        list.clear();
        System.out.println("List after clearing: " + list);
        // Test sort()
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println("List before sorting: " + list);
        list.sort();
        System.out.println("List after sorting: " + list);
    }
}
