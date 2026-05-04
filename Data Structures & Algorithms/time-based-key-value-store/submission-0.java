class TimeMap {
    // 1. Create a helper class to store the pair
    class TimeVal {
        String value;
        int timestamp;
        
        public TimeVal(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    // Now your map holds a List of TimeVal objects
    HashMap<String, ArrayList<TimeVal>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // A cleaner way to handle the map insertion
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        // 2 & 3. Add the bundled object to the list
        map.get(key).add(new TimeVal(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        
        ArrayList<TimeVal> list = map.get(key);
        // You will need to implement this binary search logic
        // Remember to return the .value of the found TimeVal!
        return binSearch(list, timestamp); 
    }
    
    private String binSearch(ArrayList<TimeVal> list, int timestamp) {
        int left=0;
        int right=list.size()-1;
        String ans="";
        while(left<=right){
            int mid=left+(right-left)/2;
            if(list.get(mid).timestamp<=timestamp){
                ans= list.get(mid).value;
                left=mid+1;
            } 
            else right=mid-1;
        }
        return ans;
    }
}