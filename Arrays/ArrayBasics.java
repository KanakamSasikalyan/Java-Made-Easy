/*
    -> An array is a collection of similar data elements.
    -> In Java arrays are dynamically allocated
    -> In Java arrays are Objects. the length of the array can be accessed by .length property 
       but in c/c++ we use sizeof method 
    -> Index starts from 0 to n-1
    -> Java arrays access the Object superclass
    -> Java arrays implements Cloneable and java.io.Serializable
    -> Sytax:
        data_type[] name = new data_type[size];
                    (OR)
        data_type name[];
        name = new data_type[size];
*/
public class Array{
    String name;
    int id;
    Array(String name, int id){
        this.name = name;
        this.id = id;
    }
    static void ArrayMethod(int[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.println("Element at: "+i+"->"+arr[i]);
        }
    }
    static int[] getArray(){
        return new int[]{1,2,3,4};
    }
    public static void main (String[] args) {
        /* code */
        int[] arr = new int[20];  //array of 20 elements
        int[] brr = {1,2,3,4,5,6,7,8};  //Array Literal
        
        //Accessing elements in the Array
        for(int i=0;i<brr.length;i++){
            System.out.println("Element at: "+i+"->"+brr[i]);
        }
        
        //Accessing elements using for-each loops
        System.out.println("\nUsing for for-each loop");
        for(int j:brr){
            System.out.println(j);
        }
        
        //Array of Objects
        Array[] crr = new Array[5];
        crr[0] = new Array("A",65);
        crr[1] = new Array("B",66);
        crr[2] = new Array("C",67);
        crr[3] = new Array("D",68);
        crr[4] = new Array("E",69);
        
        for(int i=0;i<5;i++){
            System.out.println("Object: "+i);
            System.out.println("Name: "+crr[i].name+" ID: "+crr[i].id);
        }
        
        //Passing Arrays to method
        ArrayMethod(brr);
        
        //get an array by return statement 
        int[] res = getArray();
        
        ArrayMethod(res);
        
        
        //Class Objects for Arrays
        byte[] byteArray = new byte[10];
        short[] shortArray = new short[10];
        int[] intArray = new int[10];
        
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(intArray.getClass());
      
        //Clone an array
        int[] myArray = {1,2,3};
        int[] cloneArray = myArray.clone();
        System.out.println(myArray==cloneArray);   //false, because copy made with another memory location
      }
}
