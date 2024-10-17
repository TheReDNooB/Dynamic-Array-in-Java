
package dynamicarraystructure;

public class DynamicArrayStructure {


    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        
        dynamicArray.add("Cellphone");
        dynamicArray.add("Tablet");
        dynamicArray.add("Airpods");
        
        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        System.out.println("size :" + dynamicArray.size);
        System.out.println("capacity :" + dynamicArray.capacity);
    }
    
}
