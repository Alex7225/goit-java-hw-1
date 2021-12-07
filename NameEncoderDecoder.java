public class NameEncoderDecoder {

    public String encode(String name){
        String repl1 = name.replace("e", "1")
         .replace("u", "2")
         .replace("i", "3")
         .replace("o", "4")
         .replace("a", "5");

         return "NOTFORYOU"+repl1+"YESNOTFORYOU";
    }

    public String decode(String name){
        String repl1 = name.replace("YESNOTFORYOU", "")
        .replace("NOTFORYOU", "")
        .replace("1", "e")
        .replace("2", "u")
        .replace("3", "i")
        .replace("4", "o")
        .replace("5", "a");

        return repl1;

    }


    public static void main(String[] args) {

    }
}
