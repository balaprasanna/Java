
public class Club {
private int currentNumber;
private int arrayPointer=0;
private Member[] members;

public Club(){
	this.currentNumber=1;
	this.members= new Member[100];
}

public Member addMember(String surName, String firstName, String secondName){
	members[arrayPointer]=new Member(currentNumber,surName,firstName,secondName);
	Member m= members[arrayPointer];
	currentNumber++;
	arrayPointer++;
return m;
}
}
