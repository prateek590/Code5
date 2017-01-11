import java.util.*;
import java.math.BigInteger;

class KeyGen{
public static void main(String[] args){

Random rand1 = new Random(System.currentTimeMillis());
Random rand2 = new Random(System.currentTimeMillis()*10);

//int pubKey = Integer.parseInt(args[0]);
long pubKey = Long.parseLong(args[0]);
BigInteger bigB_p = BigInteger.probablePrime(16,rand1);
BigInteger bigB_q = BigInteger.probablePrime(16,rand2);
System.out.println(bigB_p);

System.out.println(bigB_q);
BigInteger bigB_n = bigB_p.multiply(bigB_q);

BigInteger bigB_p_1 = bigB_p.subtract(new BigInteger("1"));

BigInteger bigB_q_1 = bigB_q.subtract(new BigInteger("1"));

BigInteger bigB_p_1_q_1 = bigB_p_1.multiply(bigB_q_1);


while(true)
{


BigInteger BigB_GCD = bigB_p_1_q_1.gcd(new BigInteger(""+pubKey));

if(BigB_GCD.equals(BigInteger.ONE)){
break;
}
pubKey++;



}
BigInteger bigB_pubKey = new BigInteger(""+pubKey);
BigInteger bigB_prvKey = bigB_pubKey.modInverse(bigB_p_1_q_1);

System.out.println(" public key : "+bigB_pubKey+" , "+bigB_n);
System.out.println(" private key : "+bigB_prvKey+" , "+bigB_n);


}

}