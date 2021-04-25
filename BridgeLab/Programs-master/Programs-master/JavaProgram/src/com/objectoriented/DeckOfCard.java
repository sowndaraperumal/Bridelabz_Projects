package com.objectoriented;

public class DeckOfCard {

public static void main(String[] args) {
	String face[]= {"heart","club","diamond","spade"};
	String cards[]= {"aces","2","3","4","5","6","7","8","9","10","jack","queen","king"};
int n=face.length*cards.length;
String deck[]=new String[n];
int l=0;
for(int i=0;i<face.length;i++) {
	for(int j=0;j<cards.length;j++)
	{
		deck[l]=cards[j]+" of "+face[i];
		l++;
	}
}
//for(int i=0;i<n;i++) {
	//System.out.println(deck[i]);
//}
for(int i=0;i<n;i++) {
	int ran=i+(int)(Math.random()*(n-i));
String t=deck[ran];
deck[ran]=deck[i];
deck[i]=t;
}


//for(int i=0;i<deck.length;i++) {
	//System.out.println(deck[i]);
//}
int k=0;
String players[]= {"atthu","amigo","thermo","kutty"};
System.out.println();
for(int i=0;i<players.length;i++) {
	//System.out.println(players[i]);

	for(int j=0;j<9;j++) {
	//System.out.println(deck[k]);
	k++;
}
}
int m=0;
String twod[][]=new String[9][4];
System.out.println("atthu       amigo      thermo      kutty");
for(int i=0;i<9;i++) {
for(int j=0;j<4;j++) {
	twod[i][j]=deck[m];
m++;
System.out.print(twod[i][j]+"  ");
/*
  if(twod[i][j].length()==12) {
System.out.print(twod[i][j]+"   ");}
 if(twod[i][j].length()==9) {
	System.out.print(twod[i][j]+"        ");
}if(twod[i][j].length()==10) {
	System.out.print(twod[i][j]+"       ");
}
if(twod[i][j].length()==13) {
	System.out.print(twod[i][j]+"    ");}


if(twod[i][j].length()==15) {
	System.out.print(twod[i][j]+"    ");}

}*/

}System.out.println();
}



}

}
