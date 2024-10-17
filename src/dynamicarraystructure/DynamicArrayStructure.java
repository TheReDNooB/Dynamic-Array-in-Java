
package dynamicarraystructure;

public class DynamicArrayStructure {


    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);
        
        dynamicArray.add("Cellphone");
        dynamicArray.add("Tablet");
        dynamicArray.add("Airpods");
        
        System.out.println(dynamicArray);
        dynamicArray.insert(0, "SmarWatch");
        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        
        dynamicArray.delete("Airpods");
        System.out.println("Tablet Index: " + dynamicArray.search("Tablet"));
        dynamicArray.add("Clock");
        dynamicArray.add("Tesla");
        System.out.println(dynamicArray);
        System.out.println("size :" + dynamicArray.size);
        System.out.println("capacity :" + dynamicArray.capacity);
    }
    
}
