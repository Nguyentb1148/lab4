import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string1 = sc.nextLine();
    }

}

//public static void reverseEachWords(String string1){
//        String[]words=string1.split("\\s");
//        String[]reverseWords=new String[words.length];
//        for (int i=0;i<words.length;i++){
//            reverseWords[words.length-i-1]=words[i];
//        }
//        for (int i=0;i< words.length;i++){
//            System.out.print(reverseWords[i]+" ");
//        }
//    }

//    public  static void convertName(String string1){
//        String[] words=string1.split("\\s");
//        String index="";
//        for (int i=0;i<words.length;i++){
//            if(i == (words.length-1)){
//                index=words[i]+index;
//            }
//            else
//                index=index+" "+words[i];
//        }
//        System.out.println(index);
//    }

//    public static void convertString(String string1){
//        StringBuffer string2=new StringBuffer(string1);
//        int numeralNumber=0;
//        String place = null;
//        int i=0;
//        int ch=0;
//        for (;i<string1.length();i++){
//            String temp = string1.substring(i, i+1);
//            if (temp.matches(" ")) {
//                numeralNumber++;
//                place=string1.substring(i);
//                ch=i;
//                if (Character.isSpaceChar()){
//                    string2.delete(ch,string1.length());
//                }
//            }
//        }
//        System.out.println(numeralNumber);
//        string2.insert(0,place+" ");
//        System.out.println(string2);
//    }
//    public static void upperFirstLetters(String string1){
//        StringBuffer string2=new StringBuffer(string1);
//        boolean check=true;
//        for (char ch : string1.toCharArray()){
//            if(Character.isSpaceChar(ch)){
//                check=true;
//            } else if (check) {
//                ch=Character.toTitleCase(ch);
//                check=false;
//            }else{
//                ch=Character.toLowerCase(ch);
//            }
//            string2.append(ch);
//        }
//        System.out.println(string2);
//    }

//    public static void countLetters(String string1) {
//        int count[] = new int[256];
//        char ch[] = new char[string1.length()];
//        for (int i=0; i<string1.length();i++) {
//            count[string1.charAt(i)]++;
//        }
//        for (int i=0;i<string1.length();i++){
//            ch[i]=string1.charAt(i);
//            int find=0;
//            for (int j=0;j<string1.length();j++){
//                if (string1.charAt(i)==ch[j]){
//                    find++;
//                }
//            }
//            if (find==1){
//                System.out.println(string1.charAt(i)+" : "+count[string1.charAt(i)]);
//            }
//        }
//    }

//    public static void removeUnnescessaryBlanks(String string1)
//    {
//        for (int i=0;i<string1.length()-1;i++) {
//            int j = i+1;
//            boolean check=true;
//            char ch =' ';
//            do {
//                if(j!=string1.length()&&string1.charAt(i)==string1.charAt(j)&&string1.charAt(i)==' ') {
//                    j++;
//                }
//                else {
//                    check=false;
//                }
//            }
//            while (check);
//            string1=string1.substring(0,i+1)+string1.substring(j);
//        }
//        System.out.println("New string: "+string1);
//    }

//    public  static void replaceLetters(String string1) {
//        for (int i = 0; i < string1.length() - 1; i++) {
//            int j = i + 1;
//            boolean check = true;
//            String ch = String.valueOf(string1.charAt(i));
//            do {
//                if (j != string1.length() && string1.substring(j).startsWith(ch)) {
//                    j++;
//                } else {
//                    check = false;
//                }
//            }
//            while (check);
//            string1 = string1.substring(0, i + 1) + string1.substring(j);
//        }
//        System.out.println("New string: " + string1);
//    }

//    }

//    public static void lowerAndUpperLetters(String string1)
//    {
//        System.out.println(string1.toLowerCase());
//        System.out.println(string1.toUpperCase());
//    }

//    public static void CountWords(String string1)
//    {
//        int count=1;
//        for (int i=0;i<string1.length();i++)
//        {
//            if(string1.charAt(i)==' ')
//            {
//                count++;
//            }
//        }
//        System.out.println("String  have "+count+ " Words");
//    }

//    public static void NumeralCharacters(String string1)
//    {
//        int vowelCharacters=0;
//        int consonantCharacters=0;
//        int specialCharacters=0;
//        int numeralNumber=0;
//        for (int i =0;i<string1.length();i++)
//        {
//            String temp = string1.substring(i, i+1);
//            if (temp.matches("[0-9]"))
//            {
//                numeralNumber++;
//            }
//            else if (temp.matches("[a-zA-Z]"))
//            {
//                if (temp.matches("[aouieAOUIE]")) vowelCharacters++;
//                else consonantCharacters++;
//            }
//             specialCharacters=string1.length()-(numeralNumber+vowelCharacters+consonantCharacters);
//        }
//        System.out.println("string 1: "+string1.length());
//        System.out.println("Numeral Characters: "+ numeralNumber);
//        System.out.println("the vowel characters: "+vowelCharacters);
//        System.out.println("the consonant characters: "+consonantCharacters);
//        System.out.println("the special characters: "+specialCharacters);
//    }

//    public static void ConCatString()
//    {
//        String s1="concatenation";
//        String s2="cat";
//        String s3="tent";
//        if(s1.contains(s2))
//        {
//            for(int i=0;i<s1.length();i++)
//            {
//                if(s1.substring(i).startsWith(s2))
//                {
//                    System.out.println(s2+" found at position "+(i+1)+" in " + s1);
//                }
//            }
//        }
//        else
//        {
//            System.out.println(s2+" not found in "+s1);
//        }
//
//        if(s1.contains(s3))
//        {
//            for(int i=0;i<s1.length();i++)
//            {
//                if(s1.substring(i).startsWith(s3))
//                {
//                    System.out.println(s3+" found at position "+(i+1)+" in " + s1);
//                }
//            }
//        }
//        else
//        {
//            System.out.println(s3+" not found in "+s1);
//        }
//    }

//        public static void stringLength(String string1)
//        {
//            if(string1.length()>=3)
//            {
//                System.out.println(" the third character of "+string1+" is: "+string1.substring(2,3));
//            }
//            else
//            {
//                System.out.println("“undefined”");
//            }
//        }

//        public static void reverseString(String string1)
//        {
//            System.out.print("reserve string of "+string1+"is: " );
//           for (int i=string1.length()-1;i>=0;i--)
//           {
//               char temp = string1.charAt(i);
//               System.out.print(temp);
//           }
//            System.out.println();
//        }

//        public static void CharacterString(String string1) {
//            int count = 0;
//            for (int i=0;i<string1.length();i++)
//            {
//                if(string1.charAt(i)!=' ')
//                {
//                    count++;
//                }
//            }
//            System.out.println("sum of characters "+count);
//        }