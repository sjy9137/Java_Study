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
         System.out.println("  1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
         System.out.println("--------------------------------------------------");
         System.out.println("선택>");

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
      System.out.println("프로그램 종료");
   }

   private static void createAccount() {
      String ano;
      String owner;
      int balance;
      
      System.out.print("계좌번호: ");
      ano = scanner.next();
      System.out.print("계좌주: ");
      owner = scanner.next();
      System.out.print("초기입금액: ");
      balance = scanner.nextInt(); //버퍼에 있는 개행받기
  
      
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

      System.out.print("계좌번호: ");
      ano = scanner.next();

      System.out.print("예금액: ");
      balance = scanner.nextInt();

      if (findAccount(ano) != null) {
         findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
         System.out.println("결과 : 예금이 성공되었습니다.");
      } else {
         System.out.println("해당 계좌는 없습니다.");
      }
   }

   private static void withdraw() {
      String ano;
      int balance;

      System.out.print("계좌번호: ");
      ano = scanner.next();

      System.out.print("출금액: ");
      balance = scanner.nextInt();
      
      if (findAccount(ano) != null) {
         findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
         System.out.println("결과 : 출금이 성공되었습니다.");
      } else {
         System.out.println("해당 계좌는 없습니다.");
      }

   }

   private static Account findAccount(String ano) {
      for (int i = 0; i < accountArray.length; i++) {
         if (accountArray[i] == null) {
            System.out.println("해당 계좌는 없습니다.");
            return null;
         } else if (accountArray[i].getAno().equals(ano)) {

            return accountArray[i];
         }
      }
      return null;
   }
}