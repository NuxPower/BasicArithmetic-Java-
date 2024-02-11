import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class BasicArithmetic<T>{
    static Scanner scan = new Scanner(System.in);
    private ArrayList<T> list;

    public BasicArithmetic() {
        list = new ArrayList<>();
    }

    public void add(T element) {
    /**
     * Adds the specified element to the list.
     *
     * @param element   the element to be added to the list
     */
        list.add(element);
    }

    public T get(int index) {
    /**
     * Retrieves the element at the specified index.
     *
     * @param index     the index of the element to retrieve
     * @return          the element at the specified index
     */
        return list.get(index);
    }

    public static int add(int a, int b) {
    /**
     * A function to add two integers.
     *
     * @param a     the first integer to be added
     * @param b     the second integer to be added
     * @return      the sum of the two integers
     */        
        return a + b;
    }
    public static double add(double a, double b) {
    /**
     * A function that adds two double numbers.
     *
     * @param a	    first double number
     * @param b	    second double number
     * @return      sum of the two double numbers
     */
        return a + b;
    }
    public static int subtract(int a, int b) {
    /**
     * A function that subtracts two integers.
     *
     * @param a	    first integer
     * @param b	    second integer
     * @return      the result of subtracting b from a
     */
        return a - b;
    }
    public static double subtract(double a, double b) {
    /**
     * Subtracts two double numbers.
     *
     * @param a	    first double number
     * @param b	    second double number
     * @return    	result of the subtraction
     */
        return a - b;
    }
    public static int multiply(int a, int b) {
    /**
     * This function multiplies two integers.
     *
     * @param a	    the first integer
     * @param b	    the second integer
     * @return      the result of multiplying a and b
     */
        return a * b;
    }
    public static double multiply(double a, double b) {
    /**
     * A function to multiply two double numbers.
     *
     * @param a     the first double number
     * @param b     the second double number
     * @return      the product of a and b
     */
        return a * b;
    }
    public static int divide(int a, int b) {
    /**
     * Divides two integers.
     *
     * @param a     the dividend
     * @param b     the divisor
     * @return      the quotient
     */
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    public static double divide(double a, double b) {
    /**
     * Divides two numbers.
     *
     * @param a     the dividend
     * @param b     the divisor
     * @return      the result of the division
     */
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static int addIntegers(ArrayList<Integer> list) {
    /**
     * Adds up the integers in the given list.
     *
     * @param list  the list of integers to be added
     * @return      the sum of the integers in the list
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    
    public static double addDouble(ArrayList<Double> list) {
    /**
     * Calculates the sum of all the double values in the given list.
     *
     * @param list   the list of double values
     * @return       the sum of the double values in the list
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }

    public static int subtractIntegers(ArrayList<Integer> list) {
    /**
     * A function that subtracts integers from the given list.
     *
     * @param list   the list of integers to be subtracted
     * @return       the result of the subtraction
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        return result;
    }

    public static double subtractDouble(ArrayList<Double> list) {
    /**
     * Calculates the subtraction of all elements in the input list.
     *
     * @param list   the list of Double values
     * @return       the result of the subtraction
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        double result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        return result;
    }

    public static int multiplyIntegers(ArrayList<Integer> list) {
    /**
     * Multiplies all the integers in the given list.
     *
     * @param list   the list of integers to be multiplied
     * @return       the product of all the integers in the list
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        int product = 1;
        for (int i : list) {
            product *= i;
        }
        return product;
    }

    public static double multiplyDouble(ArrayList<Double> list) {
    /**
     * Multiply the elements in the given ArrayList of Doubles.
     *
     * @param list  the ArrayList of Doubles to be multiplied
     * @return      the product of all the elements in the ArrayList
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        double product = 1;
        for (double i : list) {
            product *= i;
        }
        return product;
    }

    public static int divideIntegers(ArrayList<Integer> list) {
    /**
     * Divides a list of integers and returns the quotient.
     *
     * @param list    the list of integers to be divided
     * @return        the quotient of the division
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }
        int quotient = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            quotient /= list.get(i).intValue();
        }
        return quotient;
    }

    public static double divideDouble(ArrayList<Double> list) {
    /**
     * Divides a list of doubles and returns the quotient.
     *
     * @param list   the list of doubles to be divided
     * @return       the quotient of the division
     */
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }
        double quotient = list.get(0);
        for (int i = 1; i < list.size(); i++) {     
            if (list.get(i) == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            quotient /= list.get(i).doubleValue();
        }
        return quotient;
    }

    public static boolean isIntArray(ArrayList<?> list) {
    /**
     * Checks if the given ArrayList contains only Integer objects.
     *
     * @param list	    the ArrayList to be checked
     * @return true     if all elements are Integers, false otherwise
     */
        for (Object obj : list) {
            if (!(obj instanceof Integer)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isDoubleArray(ArrayList<?> list) {
    /**
     * Check if all elements in the ArrayList are of type Double.
     *
     * @param list	    the ArrayList to be checked
     * @return true     if all elements are of type Double, false otherwise
     */

        for (Object obj : list) {
            if (!(obj instanceof Double)) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
    /**
     * The main method to perform basic arithmetic operations on integer and double lists.
     *
     * @param args    the command-line arguments
     * @return        void
     */        
        BasicArithmetic<Integer> integerList = new BasicArithmetic<>();
        BasicArithmetic<Double> doubleList = new BasicArithmetic<>();
        boolean loop = true;
        while (loop) {
            System.out.print("Enter a number (type 'quit' to proceed): ");
            if (scan.hasNextInt()) {
                int a = scan.nextInt();
                integerList.add(a);
                System.out.println("Current list: " + integerList.list);
            } else if (scan.hasNextDouble()) {
                double a = scan.nextDouble();
                doubleList.add(a);
                System.out.println("Current list: " + doubleList.list);
            } else if (scan.hasNextLine()) {
                String a = scan.nextLine();
                if (a.equalsIgnoreCase("quit")) {
                    loop = false;
                    break;
                } else {
                    try {
                        throw new InputMismatchException();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            }
        }
        if (integerList.list.size() < 3 && !integerList.list.isEmpty()) {
            System.out.println("\nFinal list: " + integerList.list);
            System.out.println("Sum: " + add(integerList.list.get(0), integerList.list.get(1)));
            System.out.println("Difference: " + subtract(integerList.list.get(0), integerList.list.get(1)));
            System.out.println("Product: " + multiply(integerList.list.get(0), integerList.list.get(1)));
            System.out.println("Quotient: " + divide(integerList.list.get(0), integerList.list.get(1))); 
        } else if (integerList.list.size() >= 3 && isIntArray(integerList.list)) {
            System.out.println("\n" + //
                                "Final list: " + integerList.list);
            System.out.println("Sum: " + addIntegers(integerList.list));
            System.out.println("Difference: " + subtractIntegers(integerList.list));
            System.out.println("Product: " + multiplyIntegers(integerList.list));
            System.out.println("Quotient: " + divideIntegers(integerList.list));
        } else {
            System.out.println("\nEmpty list.");
        }
        if (doubleList.list.size() < 3 && !doubleList.list.isEmpty()) {
            System.out.println("\nFinal list: " + doubleList.list);
            System.out.println("Sum: " + add(doubleList.list.get(0), doubleList.list.get(1)));
            System.out.println("Difference: " + subtract(doubleList.list.get(0), doubleList.list.get(1)));
            System.out.println("Product: " + multiply(doubleList.list.get(0), doubleList.list.get(1)));
            System.out.println("Quotient: " + divide(doubleList.list.get(0), doubleList.list.get(1)));
        } else if (doubleList.list.size() >= 3 && isDoubleArray((doubleList.list))) {
            System.out.println("\n" + //
                                "Final list: " + doubleList.list);
            System.out.println("Sum: " + addDouble(doubleList.list));
            System.out.println("Difference: " + subtractDouble(doubleList.list));
            System.out.println("Product: " + multiplyDouble(doubleList.list));
            System.out.println("Quotient: " + divideDouble(doubleList.list));
        } else {
            System.out.println("\nEmpty double list.");
        }
    }
}
