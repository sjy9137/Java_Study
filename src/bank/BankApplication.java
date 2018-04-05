package bank;

import java.util.Scanner;

public class BankApplication {
   private static Account[] accountArray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);

   String ano;
   String owner;

   public static void main(String[] args) {
      boolean run = true;

      while (run) {
         System.out.println("--------------------------------------------------");
         System.out.println("  1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
         System.out.println("--------------------------------------------------");
         System.out.println("����>");

         int selectNo = scanner.nextInt();
         scanner.nextLine();
         
         if (selectNo == 1) {
            createAccount();
         } else if (selectNo == 2) {
            accountList();
         } else if (selectNo == 3) {
            deposit();
         } else if (selectNo == 4) {
            withdraw();
         } else if (selectNo == 5) {
            run = false;
         }
      }
      System.out.println("���α׷� ����");
   }

   private static void createAccount() {
      String ano;
      String owner;
      int balance;
      
      System.out.print("���¹�ȣ: ");
      ano = scanner.next();
      System.out.print("������: ");
      owner = scanner.next();
      System.out.print("�ʱ��Աݾ�: ");
      balance = scanner.nextInt(); //���ۿ� �ִ� ����ޱ�
  
      
      for (int i = 0; i < accountArray.length; i++) {
         if (accountArray[i] == null) {
            accountArray[i] = new Account(ano, owner, balance);;
            break;
         }
      }
   }

   private static void accountList() {
      for (int i = 0; i < accountArray.length; i++) {
         if (accountArray[i] == null) {
            break;
         } else {
            System.out.println(accountArray[i].getAno() + "   " + accountArray[i].getOwner() + "    "
                  + accountArray[i].getBalance());
         }
      }
   }

   private static void deposit() {
      String ano;
      int balance;

      System.out.print("���¹�ȣ: ");
      ano = scanner.next();

      System.out.print("���ݾ�: ");
      balance = scanner.nextInt();

      if (findAccount(ano) != null) {
         findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
         System.out.println("��� : ������ �����Ǿ����ϴ�.");
      } else {
         System.out.println("�ش� ���´� �����ϴ�.");
      }
   }

   private static void withdraw() {
      String ano;
      int balance;

      System.out.print("���¹�ȣ: ");
      ano = scanner.next();

      System.out.print("��ݾ�: ");
      balance = scanner.nextInt();
      
      if (findAccount(ano) != null) {
         findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
         System.out.println("��� : ����� �����Ǿ����ϴ�.");
      } else {
         System.out.println("�ش� ���´� �����ϴ�.");
      }

   }

   private static Account findAccount(String ano) {
      for (int i = 0; i < accountArray.length; i++) {
         if (accountArray[i] == null) {
            System.out.println("�ش� ���´� �����ϴ�.");
            return null;
         } else if (accountArray[i].getAno().equals(ano)) {

            return accountArray[i];
         }
      }
      return null;
   }
}