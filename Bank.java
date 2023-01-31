
class Bank
{
static int currentbalance=10000;
public static void greetcustomer()
{
System.out.println("Hello, welcome to the banking application");
}
public void deposit(int amount)
{
currentbalance= currentbalance + amount;
System.out.println("the amount is diposited successfully");
}
public static void withdrawal(int amount)
{
currentbalance= currentbalance - amount;
System.out.println("the amount is withdrawal successfully");
}
public int getcurrentbalance()
{
return currentbalance;
}