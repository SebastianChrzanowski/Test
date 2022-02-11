package Strumienie.Optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        printToLowerCaseNormal("SeBaStiAn");
        printToLowerCaseIfy(null);
printToLowerCaseIOPTIONA(null);
printToLowerCaseIOPTIONA("aVdFDFsssdASSd");
optionalMethid("Eeter");
        System.out.println(optionalMethid("Eeter"));

    }

    public static void printToLowerCaseNormal(String string){
        System.out.println(string.toLowerCase());
    }

    public static void printToLowerCaseIfy(String string){
        if(string != null)
        System.out.println(string.toLowerCase());
        else
            System.out.println("Jest zerem- zle");
    }

    public static void printToLowerCaseIOPTIONA(String string){
        String messege = Optional.ofNullable(string).
                                                    map(String::toLowerCase).
                                                                            orElse("jest zle, jest zero");


        System.out.println(messege);
    }

    public static int optionalMethid(String param){
        return Optional.ofNullable(param)
                .map(string->{
                            System.out.println(string);
                            return string.length();
                        }).
                filter((lengts) -> lengts >3)
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
