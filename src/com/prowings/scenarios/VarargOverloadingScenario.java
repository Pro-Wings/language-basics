package com.prowings.scenarios;

public class VarargOverloadingScenario {
//    public void test(int i) {
//        System.out.println("Int");
//    }

//    public void test(Character i) {
//        System.out.println("Character");
//    }

    public void test(int... i) {
        System.out.println("Int varargs");
    }

//    public void test(int[] i) {
//    	System.out.println("Int array");
//    }
    
    public void test(char... c) {
        System.out.println("Char varargs");
    }

//    public void test(char[] c) {
//    	System.out.println("Char varargs");
//    }
    
    
    public static void main(String[] args)
    {
        VarargOverloadingScenario obj = new VarargOverloadingScenario();
        
        int[] nums = {10,20,30};
        obj.test(10); 
//        obj.test('a'); 
//        obj.test(10); 
//        obj.test(10,5,6);
//        obj.test('a','e', 'i','o');
    }
}