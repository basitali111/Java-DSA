// How to do linear Search

class ArrayCC {
    public static int linearSearch(int numbers[],int key) {
       for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
          return i;
      }
  }
  // If the key is not found, return -1
  return -1;
  }
  public static void main(String[] args) {
      int numbers [] ={1,2,3,4,5};
      int key= 4;
      int index = linearSearch(numbers,key);
      if(index==-1){
          System.out.println("Not found");
      }else{
          System.out.println("its found");
      }
  }
}