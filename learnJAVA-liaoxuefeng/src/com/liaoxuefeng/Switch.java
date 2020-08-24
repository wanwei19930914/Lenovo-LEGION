package com.liaoxuefeng;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 4;
		switch (option) {
		case 1:
			System.out.println("selected 1");
			break;
		case 2:
			System.out.println("selected 2");
			break;
		case 3:
			System.out.println("selected 3");
			break;
		default:
			System.out.println("unvalid");
			break;
		}
		/*JAVA 12开始，switch语句升级为更简洁的表达。如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应。
		 * public class Main {
    		public static void main(String[] args) {
		        String fruit = "apple";
		        switch (fruit) {
		        case "apple" -> System.out.println("Selected apple");
		        case "pear" -> System.out.println("Selected pear");
		        case "mango" -> {
		            System.out.println("Selected mango");
		            System.out.println("Good choice!");
		        }
		        default -> System.out.println("No fruit selected");
        }
    }
}

		 */
		
	}

}
