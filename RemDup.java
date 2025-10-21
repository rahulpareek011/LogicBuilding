public class RemDup {
    public static void main(String[] args) {
        String str = "Programming";
        String unique ="";

        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(unique.indexOf(temp)<0) //-> returns -1 if not present in array so its unique element
            unique+=temp;
        }
        System.out.println(unique);//only unique elements
    }
}
