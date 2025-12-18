public class VowelsConsonants {
    public static void main(String[] args) {
        String v="",c="";
        for(char ch='a';ch<='z';ch++){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                v+=ch+" ";
            else
                c+=ch+" ";
        }
        System.out.println(v);
        System.out.println(c);
    }
}
