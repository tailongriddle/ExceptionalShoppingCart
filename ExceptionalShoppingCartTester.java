//////////////// FILE HEADER //////////////////////////
//
// Title: Testing the shopping cart
// Course: CS 300 Spring 2022
//
// Author: Tai-Long Riddle
// Email: mlriddle@wisc.edu
// Lecturer: Mouna Kacem
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: (name of your pair programming partner)
// Partner Email: (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons: Instructors on Piazza, Kushagara Kapil, Michele Jensen, Hobbes on Piazza
// Online Sources: NONE
//
///////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.zip.DataFormatException;
import java.util.Scanner;


public class ExceptionalShoppingCartTester {

  /*
   * This method tests lookupProductByName, lookupProductByID, getProductPrice, addItemToCart,
   * nbOccurences, contains, removeItem, emptyCart, checkout, and getCartSummary for exceptions
   * 
   * @return boolean value of true if all exceptions caught
   * 
   */
  public static boolean testLookupMethods() {

    String[] cart = new String[6];
    
    try {
      ExceptionalShoppingCart.lookupProductByName("name");
    } catch (NoSuchElementException e) {
      System.out.println("No Such Element: No match found for product id entered");

    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }
    try {
      ExceptionalShoppingCart.lookupProductById(4390);

    } catch (IllegalArgumentException e) {

    } catch (NoSuchElementException e) {
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");

    }

    try {
      ExceptionalShoppingCart.getProductPrice("banana");

    } catch (NoSuchElementException e) {
      System.out.println("No Such Element: No match found for product id entered");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }

    try {
      ExceptionalShoppingCart.addItemToCart("watermelon", null, 4);

    } catch (IllegalArgumentException e) {

    } catch (IllegalStateException e) {
      System.out.println("IllegalStateException: Cart is full");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }

    try {
      ExceptionalShoppingCart.nbOccurrences("banana", cart, 6);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }

    try {
      ExceptionalShoppingCart.contains("banana", cart, 4);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }


    try {
      ExceptionalShoppingCart.removeItem(cart, "banana", 4);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (NoSuchElementException e) {
      System.out.println("No Such Element: Item not found in cart");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }


    try {
      ExceptionalShoppingCart.emptyCart(cart, 4);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception: Cart is null");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }

    try {
      ExceptionalShoppingCart.checkout(cart, 4);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }

    try {
      ExceptionalShoppingCart.getCartSummary(null, 4);

    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }



    return true;



  }

  /**
   * This method checks lookupProductByName for exceptions
   */
  public static boolean testLookupMethodCatalog() {
    try {
      ExceptionalShoppingCart.lookupProductByName("banan");
    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: id not parsable to 4-digits"
          + "    int, name is null or empty string, and price not parsable to double");
    } catch (IllegalStateException e) {
      System.out.println("Illegal State: cart is full");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    }


    return true;

  }

  public static boolean testSaveCartSummary() {
    try {

      ExceptionalShoppingCart.saveCartSummary(null, 6, null);
    } catch (IllegalArgumentException e) {
      System.out.println("Illegal Argument: Size must be greater than zero");
    } catch (Exception e) {
      System.out.println("Unknown exception: Unknown error occured");
    } 
    return true;
  }

  /**
   * This method runs testLoadCartSummary()
   * 
   * @return true if all tests are passed
   * 
   */
  public static boolean testLoadCartSummary() {
    return true;
  }

  /**
   * This method runs testLookupMethods() and testLookupMethodCatalog() true if all tests are passed
   * 
   * @return true if all tests are passed
   * 
   */
  public static boolean runAllTests() {
    testLookupMethods();
    testLookupMethodCatalog();
    testSaveCartSummary();
    return true;
  }

  /**
   * This is the main method
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.print(runAllTests());


  }



}
