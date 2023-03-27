import java.util.Scanner;

 public class Atividade {
Scanner sc = new Scanner(System.in);


public void Exerc1 () {
    System.out.println(
        "Digite o número da operação a ser realizada 1(Adição), 2(Subtração), 3(Multiplicação) e 4(Divisão)");
int operacao = sc.nextInt();
System.out.println("Agora informe o primeiro némero da conta");
double nu1 = sc.nextDouble();
System.out.println("E o segundo número");
double nu2 = sc.nextDouble();
if (operacao == 1) {
    System.out.println("O valor é " + (nu1 + nu2));
}
if (operacao == 2) {
    System.out.println("O valor é " + (nu1 - nu2));
}
if (operacao == 3) {
    System.out.println("O valor é " + (nu1 * nu2));
}
if (operacao == 4) {
    System.out.println("O valor  é " + (nu1 / nu2));
}
}
}




public void Exerc2 () {
System.out.println("Insira o nº de matrícula");
int nmatricula = sc.nextInt();
int result = nmatricula % 4 ;
if (nmatricula==0) {
System.out.println("O aluno será do time do Chris");
} if (nmatricula==1) {
System.out.println("O aluno será do time do Greg");
} if (nmatricula==2) {
System.out.println("O aluno será do time do Caruso");
} if (nmatricula==3) {
System.out.println("O aluno será do time do Jerome");
}
}


public void Exerc3 () {
System.out.println("Informe quantos kilos de bananas foram comprados");
int banana = sc.nextInt();
System.out.println("Insira quantos kilos de macas foram comprados");
int macas = sc.nextInt();
System.out.println("informe quantos kilos de morangos foram comprados");
int morangos = sc.nextInt();
double kilo = 0;
double custo = banana*1.80 + macas*2.30 + morangos*3.50;
double custoFinal = 0;

 if (kilo>=15 || custoFinal>=30) {
    custoFinal = custo*0.1;
    System.out.println("O custo foi de R$"+custoFinal)
 }else{
    System.out.println("O custo foi de R$"+custoFinal);

}
} 
