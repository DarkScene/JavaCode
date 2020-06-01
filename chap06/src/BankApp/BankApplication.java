package BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	private static ArrayList<Account> accountArray = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	private static int index = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}			
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void withdraw() {
		accountArray.add(null);
		
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.println("계좌번호: ");
		scanner.nextLine();		
		accountArray.get(index).setAno(scanner.nextLine());
		System.out.println("계좌주: ");
		scanner.nextLine();		
		accountArray.get(index).setOwner(scanner.nextLine());
		System.out.println("초기입금액: ");
		accountArray.get(index).setBalance(scanner.nextInt());
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌 목록
	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	// 예금
	private static void accountList() {
		// TODO Auto-generated method stub
		
	}

	// 출금
	private static void createAccount() {
		// TODO Auto-generated method stub
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return 0;
	}
	
	// 정수 이외의 입력 예외처리
	private static void except_int() {
		while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
		}
	}
	
}
