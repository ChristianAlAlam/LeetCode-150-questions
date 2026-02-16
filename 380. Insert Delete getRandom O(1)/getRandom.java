class RandomizedSet {
List<Integer> a;
HashMap<Integer, Integer> h;
Random r;
    public RandomizedSet() {
        a = new ArrayList<>();
        h = new HashMap<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        
        if(h.containsKey(val)) return false;

        h.put(val, a.size());
        a.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!h.containsKey(val)) return false;

        int index = h.get(val);
        int last = a.get(a.size()-1);

        a.set(index, last);
        h.put(last, index);
        a.remove(a.size()-1);
        h.remove(val);
        return true;
    }
    
    public int getRandom() {
     int index = r.nextInt(a.size());
     return a.get(index);   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */