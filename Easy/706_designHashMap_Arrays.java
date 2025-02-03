class MyHashMap {

   int[] myArr; 
   public MyHashMap() {
        
        myArr = new int[11111111];
        Arrays.fill(myArr, -1);
    }
    
    public void put(int key, int value) {
        myArr[key]= value;
        
    }
    
    public int get(int key) {
        return myArr[key];
    }
    
    public void remove(int key) {
        myArr[key]=-1;
        
    }
}
