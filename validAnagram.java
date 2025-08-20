class validAnagram {
    public boolean isAnagram(String s, String t) {
        s = s.replace("\\s", "").toLowerCase(); // Remove space and convert all string to lower case
        t = t.replace("\\s", "").toLowerCase();

        if(s.length() != t.length()) return false; // Length check for quick decissionn

        int  n = s.length();
        int [] freq = new int[26];

        for(int i = 0; i < n; i ++){
            freq[s.charAt(i) - 'a']++;//count characters from s and substract from t
            freq[t.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count != 0) return false; //check if all frequencies are zero
        }

        return true;
    }
}
