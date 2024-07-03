public class Currency {
    public static void convertRupee(float amt)
    {
        System.out.println("Rupees "+amt+" in US Dollars is $"+0.012*amt);
        System.out.println("Rupees "+amt+" in Australian Dollars is $"+0.018*amt);
        System.out.println("Rupees "+amt+" in British Pound is "+0.009*amt);
        System.out.println("Rupees "+amt+" in Chinese Yuan is "+0.088*amt);
        System.out.println();
    }

    public static void convertUSD(float amt)
    {
        System.out.println("US Dollars $"+amt+" in Indian Rupees is "+82.50*amt);
        System.out.println("US Dollars $"+amt+" in Australian Dollar is "+1.50*amt);
        System.out.println("US Dollars $"+amt+" in British Pound is "+0.79*amt);
        System.out.println("US Dollars $"+amt+" in Chinese Yuan is "+7.23*amt);
        System.out.println();
    }

    public static void convertAUD(float amt)
    {
        System.out.println("Australian Dollar $"+amt+" in Indian Rupees is "+55*amt);
        System.out.println("Australian Dollar $"+amt+" in US Dollar is "+0.67*amt);
        System.out.println("Australian Dollar $"+amt+" in British Pound is "+0.53*amt);
        System.out.println("Australian Dollar $"+amt+" in Chinese Yuan is "+4.82*amt);
        System.out.println();
    }

    public static void convertPound(float amt)
    {
        System.out.println("British Pound " + amt + " in Indian Rupees is " + 102.50 * amt);
        System.out.println("British Pound " + amt + " in US Dollar is " + 1.27 * amt);
        System.out.println("British Pound " + amt + " in Australian Dollar is " + 1.90 * amt);
        System.out.println("British Pound " + amt + " in Chinese Yuan is " + 9.13 * amt);
        System.out.println();
    }

    public static void convertYuan(float amt)
    {
        System.out.println("Chinese Yuan " + amt + " in Indian Rupees is " + 11.40 * amt);
        System.out.println("Chinese Yuan " + amt + " in US Dollar is " + 0.140 * amt);
        System.out.println("Chinese Yuan " + amt + " in Australian Dollar is " + 0.21 * amt);
        System.out.println("Chinese Yuan " + amt + " in British Pound is " + 0.11 * amt);
        System.out.println();
    }
}
