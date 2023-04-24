import java.util.Arrays;
public class MyArrayList  <T extends Comparable<T>> implements MyList{
    int size = 0;
    int[] arr;

    public MyArrayList(){
        arr  = new int[5];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {//It determines if a specific item is present in the arrayList.
        for(int i=0; i<size; i++){
            if (arr[i] == (int)o){
                return true;
            }

        }
        return false;
    }

    @Override
    public void add(Object item) {// adding a particular item to an index
        arr[size]= (int)item;
        size =size + 1;
    }

    @Override
    public void add(Object item, int index) {
        if(arr.length == size){
            increasebuffer();
        }
        for(int i=size-1; i >=index; i--){
            arr[i+1]= arr[i];
        }
        arr[index]= (int)item;
        size++;
    }

    public void increasebuffer(){// It is a function that increases
        int[] temp = new int[size + 5];
        for(int i=0; i<size; i++){
            temp[i] = arr[i];
        }
        arr=temp;
    }

    @Override
    public boolean remove(Object item) {
        for(int i=0;i<size;i++){
            if ((int)item== arr[i]) {
                remove(i);
                size--;
                return true;
            }

        }
        return false;
    }

    @Override
    public Object remove(int index) {// this procedure moves each element by one, overwriting the element to be deleted.
        int temp = arr[index];
        for(int i=index; i <size-1; i++){
            arr[i]= arr[i+1];
        }
        arr[size-1] = 0;
        size--;
        return temp;
    }

    @Override
    public void clear() {
        Arrays.fill(arr,0);
        size =0;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i=0;i>size; i++){
            if (arr[i]==(int)o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i= size -1; i>=0; i--){
            if (arr[i]==(int)o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        Arrays.sort(arr,0,size);
    }

    public void print() {
        for(int i=0; i< size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void addAll(Object item) {
        for (int i=0; i< size ; i++) {
            if (arr.length == size) {
                increasebuffer();
            }

            size++;

        }
}}
