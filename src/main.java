
public static void main(String[] args){
    String str = "!2Good#game$$$";
    System.out.println(function(str));

}

public static String function(String str) {
    char[] symbol = str.toCharArray();
    int left = 0;
    int right = symbol.length - 1;

while (left < right) {
    if (!Character.isLetter(symbol[left])) {
        left++;
        }
    else if(!Character.isLetter(symbol[right])){
        right--;
        }
    else{
            char temp = symbol[left];
            symbol[left] = symbol[right];
            symbol[right] = temp;
            left++;
            right--;
    }

}
    return new String(symbol);
}
