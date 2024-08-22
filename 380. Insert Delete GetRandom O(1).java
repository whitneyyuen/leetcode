class RandomizedSet {
    Set<Integer> setList;

    public RandomizedSet() {
        setList = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if (setList.contains(val)) {
            return false;
        } else {
            setList.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (setList.contains(val)) {
            setList.remove(val);
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
         Random random = new Random();
        int randomNumber = random.nextInt(setList.size());
        Iterator<Integer> iterator = setList.iterator(); 
        int currentIndex = 0; 
        Integer randomElement = null; 
  
        while (iterator.hasNext()) { 
            randomElement = iterator.next(); 
            if (currentIndex == randomNumber) 
                return randomElement; 
            currentIndex++; 
        } 
  
        return randomElement;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */