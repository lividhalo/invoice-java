//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
 //click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter BILL TO Name:");
        String billName = scanner.nextLine();
        System.out.println("Enter BILL TO Address Line 1:");
        String billAdd1 = scanner.nextLine();
        System.out.println("Enter BILL TO Address Line 2:");
        String billAdd2 = scanner.nextLine();
        System.out.println("Enter BILL TO GSTIN:");
        String billGST = scanner.nextLine();
        System.out.println("Enter BILL TO Contact:");
       String billContact = scanner.nextLine();
       System.out.println("Enter BILL TO Email:");
       String billEmail = scanner.nextLine();

       System.out.println("Enter SHIP TO Name:");
       String shipName = scanner.nextLine();
        System.out.println("Enter SHIP TO Address Line 1:");
        String shipAdd1 = scanner.nextLine();
        System.out.println("Enter SHIP TO Address Line 2:");
        String shipAdd2 = scanner.nextLine();
        System.out.println("Enter SHIP TO GSTIN:");
        String shipGST = scanner.nextLine();
        System.out.println("Enter SHIP TO Contact:");
        String shipContact = scanner.nextLine();
        System.out.println("Enter SHIP TO Email:");
        String shipEmail = scanner.nextLine();


        // PRODUCT 1
        System.out.println("\nEnter Product 1 Code:");
        String p1code = scanner.nextLine();
        System.out.println("Enter Product 1 Name:");
        String p1name = scanner.nextLine();
        System.out.println("Enter Product 1 HSN:");
        String p1hsn = scanner.nextLine();
        System.out.println("Enter Product 1 Quantity:");
        int p1qty = scanner.nextInt();
        System.out.println("Enter Product 1 Rate:");
        double p1rate = scanner.nextDouble();
        System.out.println("Enter Product 1 Tax %:");
        double p1tax = scanner.nextDouble();
        scanner.nextLine();

         //PRODUCT 2
        System.out.println("\nEnter Product 2 Code:");
        String p2code = scanner.nextLine();
        System.out.println("Enter Product 2 Name:");
        String p2name = scanner.nextLine();
       System.out.println("Enter Product 2 HSN:");
        String p2hsn = scanner.nextLine();
        System.out.println("Enter Product 2 Quantity:");
        int p2qty = scanner.nextInt();
        System.out.println("Enter Product 2 Rate:");
        double p2rate = scanner.nextDouble();
       System.out.println("Enter Product 2 Tax %:");
        double p2tax = scanner.nextDouble();
        scanner.nextLine();

        // PRODUCT 3
        System.out.println("\nEnter Product 3 Code:");
        String p3code = scanner.nextLine();
        System.out.println("Enter Product 3 Name:");
        String p3name = scanner.nextLine();
        System.out.println("Enter Product 3 HSN:");
        String p3hsn = scanner.nextLine();
        System.out.println("Enter Product 3 Quantity:");
        int p3qty = scanner.nextInt();
        System.out.println("Enter Product 3 Rate:");
        double p3rate = scanner.nextDouble();
        System.out.println("Enter Product 3 Tax %:");
        double p3tax = scanner.nextDouble();
        scanner.nextLine();

         //PRODUCT 4
       System.out.println("\nEnter Product 4 Code:");
        String p4code = scanner.nextLine();
        System.out.println("Enter Product 4 Name:");
        String p4name = scanner.nextLine();
        System.out.println("Enter Product 4 HSN:");
        String p4hsn = scanner.nextLine();
        System.out.println("Enter Product 4 Quantity:");
        int p4qty = scanner.nextInt();
        System.out.println("Enter Product 4 Rate:");
        double p4rate = scanner.nextDouble();
        System.out.println("Enter Product 4 Tax %:");
        double p4tax = scanner.nextDouble();
        scanner.nextLine();

        //PRODUCT 5
        System.out.println("\nEnter Product 5 Code:");
        String p5code = scanner.nextLine();
        System.out.println("Enter Product 5 Name:");
        String p5name = scanner.nextLine();
        System.out.println("Enter Product 5 HSN:");
        String p5hsn = scanner.nextLine();
        System.out.println("Enter Product 5 Quantity:");
        int p5qty = scanner.nextInt();
        System.out.println("Enter Product 5 Rate:");
        double p5rate = scanner.nextDouble();
        System.out.println("Enter Product 5 Tax %:");
        double p5tax = scanner.nextDouble();
        scanner.nextLine();

         //RODUCT 6
        System.out.println("\nEnter Product 6 Code:");
        String p6code = scanner.nextLine();
        System.out.println("Enter Product 6 Name:");
        String p6name = scanner.nextLine();
        System.out.println("Enter Product 6 HSN:");
        String p6hsn = scanner.nextLine();
        System.out.println("Enter Product 6 Quantity:");
        int p6qty = scanner.nextInt();
        System.out.println("Enter Product 6 Rate:");
        double p6rate = scanner.nextDouble();
        System.out.println("Enter Product 6 Tax %:");
        double p6tax = scanner.nextDouble();
        scanner.nextLine();

        //PRODUCT 7
        System.out.println("\nEnter Product 7 Code:");
        String p7code = scanner.nextLine();
        System.out.println("Enter Product 7 Name:");
        String p7name = scanner.nextLine();
        System.out.println("Enter Product 7 HSN:");
        String p7hsn = scanner.nextLine();
        System.out.println("Enter Product 7 Quantity:");
        int p7qty = scanner.nextInt();
        System.out.println("Enter Product 7 Rate:");
        double p7rate = scanner.nextDouble();
        System.out.println("Enter Product 7 Tax %:");
        double p7tax = scanner.nextDouble();


        double a1 = p1qty * p1rate;
        double a2 = p2qty * p2rate;
        double a3 = p3qty * p3rate;
        double a4 = p4qty * p4rate;
        double a5 = p5qty * p5rate;
        double a6 = p6qty * p6rate;
        double a7 = p7qty * p7rate;

        double t1 = a1 * (p1tax / 100);
        double t2 = a2 * (p2tax / 100);
        double t3 = a3 * (p3tax / 100);
        double t4 = a4 * (p4tax / 100);
        double t5 = a5 * (p5tax / 100);
        double t6 = a6 * (p6tax / 100);
        double t7 = a7 * (p7tax / 100);

        double total = (a1 + t1) + (a2 + t2)+(a3 + t3) + (a4 + t4) + (a5 + t5) + (a6 + t6) + (a7 + t7);;


        double discount = total * (0.6368 / 100);
        double grandTotal = total - discount;
        System.out.println("\n=================================================================================");
        System.out.println("                                    INVOICE                                      ");
        System.out.println("=================================================================================\n");
        System.out.println("Bill To:\t\t\t\t\t\t\t\t\t\t\tShip To:");
        System.out.println(billName+"\t\t\t\t\t\t\t\t"+shipName);
       System.out.println(billAdd1+"\t\t\t\t\t\t\t\t\t"+shipAdd1);
       System.out.println(billAdd2+"\t\t\t\t\t"+shipAdd2);
        System.out.println("GSTIN: " + billGST+"\t\t\t\t\t\t\t\t\t"+"GSTIN: " + shipGST);
       System.out.println("Contact: " + billContact+"\t\t\t\t\t\t\t\t"+"Contact: " + shipContact);
       System.out.println("Email: " + billEmail + "\t\t\t\t\t\t"+"Email: " + shipEmail);

        System.out.println("Payment Date: 7 days from date of delivery");
        System.out.println("Payment Terms: 100% against invoice\n");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("S.No | Product Code | Product Name\t\t| HSN Code\t| Qty\t| Rate\t| Tax\t| Amount");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("1    | " + p1code + "          | " + p1name + "\t| " + p1hsn + "\t|" + p1qty + "\t\t|" + p1rate + "\t|" + p1tax + "%\t| " + String.format("%.2f", a1));
        System.out.println("2    | " + p2code + "          | " + p2name + "\t\t\t| " + p2hsn + "\t|" + p2qty + "\t\t|" + p2rate + "\t|" + p2tax + "%\t| " + String.format("%.2f", a2));
        System.out.println("3    | " + p3code + "          | " + p3name + "\t| " + p3hsn + "\t| " +p3qty + "\t\t|" + p3rate + "\t|" + p3tax + "%\t| " + String.format("%.2f", a3));
        System.out.println("4    | " + p4code + "          | " + p4name + "\t| " + p4hsn + "\t|" + p4qty + "\t\t|" + p4rate + "\t|" + p4tax + "% \t| " + String.format("%.2f", a4));
        System.out.println("5    | " + p5code + "          | " + p5name + "\t| " + p5hsn + "\t|" + p5qty + "\t\t|" + p5rate + "\t|" + p5tax + "% \t| " + String.format("%.2f", a5));
        System.out.println("6    | " + p6code + "          | " + p6name + "\t\t| " + p6hsn + "\t|" + p6qty + "\t\t|" + p6rate + "\t|" + p6tax + "%\t| " + String.format("%.2f", a6));
        System.out.println("7    | " + p7code + "          | " + p7name + "\t| " + p7hsn + "\t|" + p7qty + "\t\t|" + p7rate + "\t|" + p7tax + "% \t| " + String.format("%.2f", a7));

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal: " + String.format("%.2f", total));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDiscount (0.6368%): " + String.format("%.2f", discount));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrand Total: " + String.format("%.2f", grandTotal));

        System.out.println("=================================================================================");
    }
}
