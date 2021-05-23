package com.company;

public class Main {

    public static void main(String[] args) {
	try{
	    throw new Exception("Problem!!!");
    }catch (Exception e){
        System.out.println("[CATCH] -> " + e.getMessage());
        }
	finally{
        System.out.println("[FINALLY]");
        }
    }
}
